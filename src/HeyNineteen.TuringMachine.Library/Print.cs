namespace HeyNineteen.TuringMachine.Library;

using System.Diagnostics;

[DebuggerDisplay("P{_symbol}")]
public class Print : Operation
{
    private readonly char _symbol;

    public Print(char symbol)
    {
        _symbol = symbol;
    }

    public override void Execute(Tape tape) => tape.Print(_symbol);
}