namespace HeyNineteen.TuringMachine.ConsoleApp;

using CommandLine;
using Library;
using System;
using System.Diagnostics;
using System.Diagnostics.CodeAnalysis;
using System.IO;
using System.Threading;

class Program
{
    public static void Main(string[] args)
    {
        try
        {
            new Program().Run(args);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
        }
        finally
        {
            if (Debugger.IsAttached)
            {
                Console.Write("Press any key to continue...");
                Console.ReadKey();
            }
        }
    }

    public void Run(string[] args)
    {
        Parser.Default.ParseArguments<Options>(args)
            .WithParsed(RunOptions);
    }

    [SuppressMessage("ReSharper", "AccessToModifiedClosure")]
    public void RunOptions(Options options)
    {
        var inputFile = options.InputFile;

        var input = File.ReadAllText(inputFile);
        var (machine, tree) = new MachineBuilder().Build(input);

        var counter = 0;
        var pauseInterval = Math.Max(options.PauseInterval, 0);

        Action outputAction = options.KeepHistory
            ? () => { Write(counter, machine.State); }
            : () => { Overwrite(counter, machine.State); };

        if (options.ShowParseTree)
            Console.WriteLine(tree);

        while (counter < options.StepCount)
        {
            machine.Tick();
            counter++;
            outputAction();

            if (options.StepThrough)
                Console.ReadKey();
            else
                Thread.Sleep(pauseInterval);
        }

        Console.WriteLine();
    }

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
        Console.WriteLine($"{moveUp}{ClearLine}{MoveStartLine}{metaDataText}");
        Console.Write($"{ClearLine}{MoveStartLine}{tapeValuesText}");
    }

    private static int HorizontalCentrePosition() => Console.BufferWidth / 2;

    private const string Escape = "\u001b";
    private const string ClearLine = $"{Escape}[2K";
    private static readonly Func<int, string> MoveUp = positions => $"{Escape}[{positions}A";
    private static readonly Func<int, string> MoveDown = positions => $"{Escape}[{positions}B";
    private static readonly Func<int, string> MoveRight = positions => $"{Escape}[{positions}C";
    private static readonly Func<int, string> MoveLeft = positions => $"{Escape}[{positions}D";
    private static readonly string MoveStartLine = MoveLeft(1000);
    private const string Reversed = $"{Escape}[7m";
    private const string Reset = $"{Escape}[0m";

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

        var setupLine = $"{ClearLine}{MoveStartLine}{setStartPosition}";

        var output = $"{setupLine}{firstPart}{Reversed}{centrePart}{Reset}{lastPart}";

        return output;
    }
}