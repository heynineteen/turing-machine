namespace HeyNineteen.TuringMachine.ConsoleApp;

using CommandLine;
using Library;
using System;
using System.Diagnostics;
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

    public void RunOptions(Options options)
    {
        var inputFile = options.InputFile;

        var input = File.ReadAllText(inputFile);
        var (machine, tree) = new MachineBuilder().Build(input);

        var counter = 0;
        var pauseInterval = Math.Max(options.PauseInterval, 0);

        Action outputAction = options.KeepHistory
            ? () => { WriteNewLine(++counter, machine.State); }
            : () => { WriteFromStartOfSameLine(++counter, machine.State); };

        if (options.ShowParseTree)
            Console.WriteLine(tree);

        while (counter < options.StepCount)
        {
            machine.Tick();
            outputAction();

            if (options.StepThrough)
                Console.ReadKey();
            else
                Thread.Sleep(pauseInterval);
        }

        Console.WriteLine();
    }

    public static void WriteNewLine(int count, CompleteConfiguration state)
    {
        Console.WriteLine(MetaDataText(count, state));
        Console.WriteLine(TapeValuesText(state));
    }

    private static Func<int, CompleteConfiguration, string> MetaDataText = (count, state) =>
        $"StepCount: {count}, MConfiguration: {state.MConfiguration}";

    private static Func<CompleteConfiguration, string> TapeValuesText = (state) =>
        TextWithIndexInCentre(state.TapeValues, state.TapePosition);

    public static string Blank = string.Empty;
    public static bool IsFirstWrite = true;

    public static void WriteFromStartOfSameLine(int count, CompleteConfiguration state)
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
    private static Func<int, string> MoveUp = positions => $"{Escape}[{positions}A";
    private static Func<int, string> MoveDown = positions => $"{Escape}[{positions}B";
    private static Func<int, string> MoveRight = positions => $"{Escape}[{positions}C";
    private static Func<int, string> MoveLeft = positions => $"{Escape}[{positions}D";
    private static string MoveStartLine = MoveLeft(1000);
    private const string Reversed = $"{Escape}[7m";
    private const string Reset = $"{Escape}[0m";

    private static string TextWithIndexInCentre(string text, int index)
    {
        var leftOffset = index;
        var horizontalCentre = HorizontalCentrePosition();
        var startPosition = horizontalCentre - leftOffset;
        var truncateStart = Math.Max(Math.Abs(Math.Min(startPosition, 0)), 0);

        var firstPart = text.Substring(truncateStart, index - truncateStart);
        var centrePart = text[index];
        var lastPart = text.Substring(index + 1, Math.Min(horizontalCentre - 1, text.Length - (index + 1)));

        var setStartPosition = startPosition > 0 ? MoveRight(startPosition) : String.Empty;

        var setupLine = $"{ClearLine}{MoveStartLine}{setStartPosition}";

        var output = $"{setupLine}{firstPart}{Reversed}{centrePart}{Reset}{lastPart}";

        return output;
    }
}