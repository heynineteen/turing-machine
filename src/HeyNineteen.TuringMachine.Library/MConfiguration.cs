namespace HeyNineteen.TuringMachine.Library
{
    using System;
    using System.Diagnostics;

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
}
