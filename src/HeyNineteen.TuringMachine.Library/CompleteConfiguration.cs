namespace HeyNineteen.TuringMachine.Library;

using System;
using System.Linq;
using System.Text;

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
        var state = _tape.GetState();

        if (!state.Values.Any())
            return Wrap(_mConfiguration);

        var sb = new StringBuilder();

        for (var i = 0; i < state.Values.Length; i++)
        {
            if (_tape.Position == i)
                sb.Append(Wrap(_mConfiguration));

            sb.Append(state.Values[i] ?? ' ');
        }

        return sb.ToString();

        string Wrap(string value) => $"[{value}]";
    }

    public string TapeValues => _tape.AsString();

    public int TapePosition => _tape.GetState().HeadPosition;

    public string MConfiguration => _mConfiguration;
}

public static class Extensions
{
    public static string AsString(this Tape tape)
    {
        ArgumentNullException.ThrowIfNull(tape);

        var state = tape.GetState().Values;

        var sb = new StringBuilder();

        for (var i = 0; i < state.Length; i++)
            sb.Append(state[i] ?? ' ');

        return sb.ToString();
    }
}