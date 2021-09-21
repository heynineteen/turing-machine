namespace HeyNineteen.TuringMachine.ConsoleApp
{
    using CommandLine;
    using Library;
    using System;
    using System.IO;
    using System.Threading;

    class Program
    {
        public static void Main( string[] args )
        {
            try
            {
                new Program().Run( args );
            }
            catch ( Exception e )
            {
                Console.WriteLine( e );
            }
            finally
            {
                if ( System.Diagnostics.Debugger.IsAttached )
                {
                    Console.Write( "Press any key to continue..." );
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
            // p.81 compute alternate 0s and 1s
            //var lines = new Step[]
            //{
            //    new (new ConfigurationSpecification("b", '*'), new Behavior(new Operation[]{new Print('0'), new MoveRight()}, "c")),
            //    new (new ConfigurationSpecification("c", '*'), new Behavior(new Operation[]{new MoveRight()}, "e")),
            //    new (new ConfigurationSpecification("e", '*'), new Behavior(new Operation[]{new Print('1'), new MoveRight()}, "f")),
            //    new (new ConfigurationSpecification("f", '*'), new Behavior(new Operation[]{new MoveRight()}, "b")),
            //};

            //// p.83 compute 1/4
            //var lines = new Step[]
            //{
            //    new (new ConfigurationSpecification("b", '*'), new Behavior(new Operation[]{new Print('0'), new MoveRight()}, "c")),
            //    new (new ConfigurationSpecification("c", '*'), new Behavior(new Operation[]{new MoveRight()}, "d")),
            //    new (new ConfigurationSpecification("d", '*'), new Behavior(new Operation[]{new Print('1'), new MoveRight()}, "e")),
            //    new (new ConfigurationSpecification("e", '*'), new Behavior(new Operation[]{new MoveRight()}, "f")),
            //    new (new ConfigurationSpecification("f", '*'), new Behavior(new Operation[]{ new Print( '0' ),new MoveRight()}, "e")),
            //};

            // p.84 compute alternate 0s and 1s simpler
            //var steps = new Step[]
            //{
            //    new (new ConfigurationSpecification("b", SymbolSpecificationWildcard.Any), new Behavior(new Operation[]{new Print('0')}, "b")),
            //    new (new ConfigurationSpecification("b", '0'), new Behavior(new Operation[]{new MoveRight(), new MoveRight(), new Print('1')}, "b")),
            //    new (new ConfigurationSpecification("b", '1'), new Behavior(new Operation[]{new MoveRight(), new MoveRight(), new Print('0')}, "b")),
            //};

            //var machine = new Machine(steps);

            //while (true)
            //{
            //    Console.WriteLine(machine.State);
            //    Console.ReadKey();
            //    machine.Tick();
            //}

            var inputFile = options.InputFile;

            var input = File.ReadAllText(inputFile);
            var machine = new MachineBuilder().Build(input);

            var counter = 0;
            var pauseInterval = Math.Max(options.PauseInterval, 0);
            
            Action outputAction = options.KeepHistory
                ? () => { Console.WriteLine("{0} : {1}", ++counter, machine.State); }
                : () => { Console.Write("\r{0} : {1}", ++counter, machine.State); };
        

            while(counter < options.StepCount)
            {
                machine.Tick();
                outputAction();

                if (options.StepThrough)
                    Console.Read();
                else
                    Thread.Sleep(pauseInterval);
            }
        } 
    }
}
