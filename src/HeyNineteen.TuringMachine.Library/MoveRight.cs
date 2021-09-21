namespace HeyNineteen.TuringMachine.Library
{
    using System.Diagnostics;

    [DebuggerDisplay("R")]
    public class MoveRight : Operation
    {
        public override void Execute( Tape tape ) => tape.MoveRight();
    }
}