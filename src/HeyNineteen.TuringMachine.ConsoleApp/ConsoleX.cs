namespace HeyNineteen.TuringMachine.ConsoleApp;

using Library;
using System;
using static Core.Console.AnsiEscapeCodes;

public static class ConsoleX
{
    public static void Write(int count, CompleteConfiguration state)
    {
        Console.WriteLine(MetaDataText(count, state));
        Console.WriteLine(TapeValuesText(state));
    }

    private static readonly Func<int, CompleteConfiguration, string> MetaDataText = (count, state) =>
        $"StepCount: {count}, MConfiguration: {state.MConfiguration}";

    private static readonly Func<CompleteConfiguration, string> TapeValuesText = state =>
        TextWithIndexInCentre(state.TapeAdjustedValues, state.TapeAdjustedPosition);

    public static bool IsFirstWrite = true;

    public static void Overwrite(int count, CompleteConfiguration state)
    {
        var moveUp = !IsFirstWrite ? MoveUp(1) : null;
        IsFirstWrite = false;

        var metaDataText = MetaDataText(count, state);
        var tapeValuesText = TapeValuesText(state);
        Console.WriteLine($"{moveUp}{ClearLine}{MoveStartOfLine}{metaDataText}");
        Console.Write($"{ClearLine}{MoveStartOfLine}{tapeValuesText}");
    }

    private static int HorizontalCentrePosition() => Console.BufferWidth / 2;

    private static string TextWithIndexInCentre(ReadOnlySpan<char> text, int index)
    {
        var leftOffset = index;
        var horizontalCentre = HorizontalCentrePosition();
        var startPosition = horizontalCentre - leftOffset;
        var truncateStart = Math.Max(Math.Abs(Math.Min(startPosition, 0)), 0);

        var firstPart = text.Slice(truncateStart, index - truncateStart);
        var centrePart = text[index];
        var lastPart = text.Slice(index + 1, Math.Min(horizontalCentre - 1, text.Length - (index + 1)));

        var setStartPosition = startPosition > 0 ? MoveRight(startPosition) : String.Empty;

        var setupLine = $"{ClearLine}{MoveStartOfLine}{setStartPosition}";

        var output = $"{setupLine}{firstPart}{SetReversed}{centrePart}{Reset}{lastPart}";

        return output;
    }
}