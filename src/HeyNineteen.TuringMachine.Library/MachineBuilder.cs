namespace HeyNineteen.TuringMachine.Library;

using Antlr4.Runtime;
using System;
using System.Diagnostics;

public class MachineBuilder
{
    public (Machine Machine, string Tree) Build(string input)
    {
        try
        {
            var inputStream = new AntlrInputStream(input);
            var lexer = new TuringMachineLexer(inputStream);
            var commonTokenStream = new CommonTokenStream(lexer);
            var parser = new TuringMachineParser(commonTokenStream);
            var fileContext = parser.file();

            var tree = fileContext.ToStringTree(parser);

            WriteDebug(input, tree);

            var visitor = new TuringMachineVisitor();
            return (visitor.Visit(fileContext), tree);
        }
        catch (Exception e)
        {
            throw new BuildException(input, e);
        }
    }

    [Conditional("DEBUG")]
    private void WriteDebug(string input, string tree)
    {
        Debug.WriteLine($"INPUT: {input} PARSED AS {tree}");
    }
}