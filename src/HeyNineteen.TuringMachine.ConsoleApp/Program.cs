namespace HeyNineteen.TuringMachine.ConsoleApp;

using CommandLine;
using Library;
using System;
using System.Diagnostics;
using System.Diagnostics.CodeAnalysis;
using System.IO;
using System.Threading;
using static ConsoleX;


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
}
