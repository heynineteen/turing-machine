namespace HeyNineteen.TuringMachine.Library;

using System;
using System.Collections.Generic;
using System.Collections.Immutable;

public class TapeState
{
    public TapeState(char?[] values, int headPosition)
    {
        ArgumentNullException.ThrowIfNull(values);

        Values = ImmutableArray.Create<char?>(values);
        HeadPosition = headPosition;
    }

    public ImmutableArray<char?> Values { get; }

    public int HeadPosition { get; }
}