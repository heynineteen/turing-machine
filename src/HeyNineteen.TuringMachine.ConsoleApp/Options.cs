namespace HeyNineteen.TuringMachine.ConsoleApp
{
    using System.Collections.Generic;
    using CommandLine;
    using CommandLine.Text;

    public class Options
    {
        [Option( 'f', "file", Required = true, HelpText = "The name of the file containing the machine definition." )]
        public string InputFile { get; set; }

        [Option( 's', "step-through", Default = false, HelpText = "Force user to press any key to execute each step." )]
        public bool StepThrough { get; set; }

        [Option( 'c', "count", Default = 1000, HelpText = "The number of steps the machine will execute before exiting." )]
        public int StepCount { get; set; }

        [Option( 'h', "history", Default = false, HelpText = "Maintain history of state." )]
        public bool KeepHistory { get; set; }

        [Option( 'p', "pauseInterval", Default = 0, HelpText = "Time in milliseconds the machine will pause between executing steps." )]
        public int PauseInterval { get; set; }

        [Option('t', "tree", Default = false, HelpText = "Output the parse tree of the input.")]
        public bool ShowParseTree { get; set; }

        [Usage( ApplicationAlias = "HeyNineteen.TuringMachine.ConsoleApp.exe" )]
        public static IEnumerable<Example> Examples =>
             new List<Example>
             {
                new ("Show state of machine defined in file after 1000 steps", new Options { InputFile = "my.machine" }),
                new ("Show state of machine defined in file after 500 steps", new Options { InputFile = "my.machine", StepCount = 500}),
                new ("Have machine pause for 500ms after each step", new Options { InputFile = "my.machine", PauseInterval = 500 }),
                new ("Have machine wait for Enter key between each step", new Options { InputFile = "my.machine", StepThrough = true }),
                new ("Maintain history of machine state", new Options { InputFile = "my.machine", KeepHistory = true }),
                new ("Output the parse tree of the input.", new Options { InputFile = "my.machine", ShowParseTree= true }),
            };
    }
}