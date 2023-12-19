namespace HeyNineteen.TuringMachine.Library;

using System;

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

    public ReadOnlySpan<char> TapeValues => _tape.Values;

    public ReadOnlySpan<char> TapeAdjustedValues => _tape.AdjustedValues;

    public int TapePosition => _tape.Position;

    public int TapeAdjustedPosition => _tape.AdjustedPosition;

    public string MConfiguration => _mConfiguration;
}
