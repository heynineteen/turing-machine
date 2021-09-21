namespace HeyNineteen.TuringMachine.Library
{
    using Antlr4.Runtime;
    using System;

    public class MachineBuilder
    {
        public Machine Build(string input)
        {
            try
            {
                var inputStream = new AntlrInputStream(input);
                var lexer = new TuringMachineLexer(inputStream);
                var commonTokenStream = new CommonTokenStream(lexer);
                var parser = new TuringMachineParser(commonTokenStream);
                TuringMachineParser.FileContext fileContext = parser.file();

                WriteDebug(input, fileContext.ToStringTree(parser));

                var visitor = new TuringMachineVisitor();
                return visitor.Visit( fileContext );
            }
            catch (Exception e)
            {
                throw new BuildException(input, e);
            }
        }

        [System.Diagnostics.Conditional("DEBUG")]
        private void WriteDebug(string input, string tree)
        {
            System.Diagnostics.Debug.WriteLine($"INPUT: {input} PARSED AS {tree}");
        }
    }
}