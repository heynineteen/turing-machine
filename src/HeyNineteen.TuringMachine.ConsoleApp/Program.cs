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
                Console.Read();
            else
                Thread.Sleep(pauseInterval);
        }
    }

    public static void WriteNewLine(int count, string state)
    {
        Console.WriteLine("{0} : {1}", count, state);
    }

    public static string Blank = string.Empty;

    public static void WriteFromStartOfSameLine(int count, string state)
    {
        var message = $"{count} : {state}";

        if (Blank.Length < message.Length)
            Blank = new string(' ', message.Length);

        Console.Write("\r{0}", Blank);
        Console.Write("\r{0}", message);
    }
}