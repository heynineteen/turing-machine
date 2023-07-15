namespace HeyNineteen.TuringMachine.Library;

using System.Diagnostics;

[DebuggerDisplay("L")]
public class MoveLeft : Operation
{
    public override void Execute(Tape tape) => tape.MoveLeft();
}