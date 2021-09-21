namespace HeyNineteen.TuringMachine.Library
{
    using System.Diagnostics;

    [DebuggerDisplay( "E" )]
    public class Erase : Operation
    {
        public override void Execute( Tape tape ) => tape.Erase();
    }
}