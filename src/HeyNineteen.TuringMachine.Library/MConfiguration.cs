namespace HeyNineteen.TuringMachine.Library
{
    using System;
    using System.Collections.Generic;
    using System.Diagnostics;
    using System.Linq;
    using System.Text;

    public class Tape
    {
        private int _position = 0;
        private readonly List<char?> _values = new();

        public void MoveLeft()
        {
            if (_position == 0)
                throw new InvalidOperationException("Cannot move left when at the beginning of the tape.");

            _position--;
        }

        public void MoveRight()
        {
            if (++_position > _values.Count - 1)
                _values.Add(null);
        }

        public void Erase()
        {
            EnsureInitialised();
            _values[ _position ] = null;
        }

        public void Print(char value)
        {
            EnsureInitialised();
            _values[ _position ] = value;
        }

        public char? Read()
        {
            EnsureInitialised();
            return _values[ _position ];
        } 

        public List<char?> State => new(_values);

        public int Position => _position;

        private void EnsureInitialised()
        {
            if(!_values.Any())
                _values.Add(null);
        }
    }

    public class CompleteConfiguration
    {
        private readonly Tape _tape;
        private MConfiguration _mConfiguration;

        public CompleteConfiguration(Tape tape, MConfiguration mConfiguration)
        {
            _tape = tape ?? throw new ArgumentNullException(nameof(tape));
            _mConfiguration = mConfiguration ?? throw new ArgumentNullException(nameof(mConfiguration));
        }

        public CompleteConfiguration With(MConfiguration mConfiguration)
        {
            _mConfiguration = mConfiguration ?? throw new ArgumentNullException(nameof(mConfiguration));

            return this;
        }

        public override string ToString()
        {
            var state = _tape.State;

            if (!state.Any())
                return _mConfiguration;

            var sb = new StringBuilder();

            for (var i = 0; i < state.Count; i++)
            {
                if (_tape.Position == i)
                    sb.Append(_mConfiguration);

                sb.Append(state[i] ?? ' ');
            }

            return sb.ToString();
        }
    }

    public class Machine
    {
        private readonly List<Line> _lines;
        private readonly Tape _tape = new();
        private MConfiguration _currentMConfiguration;
        private CompleteConfiguration _completeConfiguration;

        public Machine(IEnumerable<Line> lines)
        {
            _lines = lines?.ToList() ?? throw new ArgumentNullException(nameof(lines));

            if (!_lines.Any())
                throw new ArgumentException("Sequence must contain at least one element.", nameof(lines));

            _currentMConfiguration = _lines[0].ConfigurationSpecification.MConfiguration;
            _completeConfiguration = new CompleteConfiguration(_tape, _currentMConfiguration);
        }

        public void Tick()
        {
            var configuration = new Configuration(_currentMConfiguration, _tape.Read());

            var line = _lines.FirstOrDefault(line => line.ConfigurationSpecification.IsSatisfiedBy(configuration));

            if (line == null)
                throw new UnrecognisedConfigurationException(configuration);

            foreach (var operation in line.Behavior.Operations)
            {
                operation.Execute(_tape);
            }

            _currentMConfiguration = line.Behavior.FinalMConfiguration;
        }

        public string State => _completeConfiguration.With(_currentMConfiguration).ToString();
    }

    [DebuggerDisplay("{ConfigurationSpecification}")]
    public class Line
    {
        public Line(ConfigurationSpecification configurationSpecification, Behavior behavior)
        {
            ConfigurationSpecification = configurationSpecification ?? throw new ArgumentNullException(nameof( configurationSpecification ) );
            Behavior = behavior ?? throw new ArgumentNullException(nameof(behavior));
        }

        public ConfigurationSpecification ConfigurationSpecification { get; }

        public Behavior Behavior { get; }
    }

    [DebuggerDisplay("{Value}")]
    public class MConfiguration : IEquatable<MConfiguration>
    {
        public MConfiguration(string value)
        {
            Value = value ?? throw new ArgumentNullException(nameof(value));
        }

        public string Value { get; }

        public static implicit operator string(MConfiguration mConfiguration) => mConfiguration.Value;

        public static implicit operator MConfiguration(string value) => new(value);

        public bool Equals(MConfiguration other)
        {
            if (ReferenceEquals(null, other))
                return false;

            if (ReferenceEquals(this, other))
                return true;

            return Value == other.Value;
        }

        public override bool Equals(object obj)
        {
            if (ReferenceEquals(null, obj))
                return false;

            if (ReferenceEquals(this, obj))
                return true;

            if (obj.GetType() != this.GetType())
                return false;

            return Equals((MConfiguration)obj);
        }

        public override int GetHashCode()
        {
            return (Value != null ? Value.GetHashCode() : 0);
        }

        public static bool operator ==(MConfiguration a, MConfiguration b)
        {
            if (ReferenceEquals(a, b))
                return true;

            if ((object)a == null || (object)b == null)
                return false;

            return a.Equals(b);
        }

        public static bool operator !=(MConfiguration a, MConfiguration b)
        {
            return !(a == b);
        }
    }

    [DebuggerDisplay("{MConfiguration.Value} : {Symbol}")]
    public class Configuration
    {
        public Configuration(MConfiguration mConfiguration, char? symbol = null)
        {
            MConfiguration = mConfiguration ?? throw new ArgumentNullException(nameof(mConfiguration));
            Symbol = symbol;
        }

        public MConfiguration MConfiguration { get; }

        public char? Symbol { get; }
    }

    [DebuggerDisplay( "{MConfiguration.Value} : {Symbol}" )]
    public class ConfigurationSpecification
    {
        public ConfigurationSpecification(MConfiguration mConfiguration, char? symbol = null)
        {
            MConfiguration = mConfiguration ?? throw new ArgumentNullException(nameof(mConfiguration));
            Symbol = symbol;
        }

        public char? Symbol { get; }

        public MConfiguration MConfiguration { get; }

        public bool IsSatisfiedBy(Configuration configuration)
        {
            _ = configuration ?? throw new ArgumentNullException(nameof(configuration));

            if (configuration.MConfiguration != MConfiguration)
                return false;

            if (Symbol == configuration.Symbol)
                return true;

            if (Symbol == null && configuration.Symbol == null)
                return true;

            if (Symbol == '?' && configuration.Symbol != null)
                return true;

            if (Symbol == '*')
                return true;

            return false;
        }
    }

    public class Behavior
    {
        public Behavior(IEnumerable<Operation> operations, MConfiguration finalMConfiguration)
        {
            Operations = operations?.ToList() ?? throw new ArgumentNullException(nameof(operations));
            FinalMConfiguration = finalMConfiguration ?? throw new ArgumentNullException(nameof(finalMConfiguration));
        }

        public List<Operation> Operations{ get; }

        public MConfiguration FinalMConfiguration { get; }
    }

    public abstract class Operation
    {
        public abstract void Execute(Tape tape);
    }

    public class Print : Operation
    {
        private readonly char _symbol;

        public Print(char symbol)
        {
            _symbol = symbol;
        }

        public override void Execute(Tape tape) => tape.Print(_symbol);
    }

    public class MoveRight : Operation
    {
        public override void Execute( Tape tape ) => tape.MoveRight();
    }

    public class MoveLeft : Operation
    {
        public override void Execute( Tape tape ) => tape.MoveLeft();
    }

    public class Erase : Operation
    {
        public override void Execute( Tape tape ) => tape.Erase();
    }

}
