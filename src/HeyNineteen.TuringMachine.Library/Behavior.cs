namespace HeyNineteen.TuringMachine.Library;

using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;

[DebuggerDisplay("{Operations}:{FinalMConfiguration}")]
public class Behavior
{
    public Behavior(IEnumerable<Operation> operations, MConfiguration finalMConfiguration)
    {
        Operations = operations?.ToList() ?? throw new ArgumentNullException(nameof(operations));
        FinalMConfiguration = finalMConfiguration ?? throw new ArgumentNullException(nameof(finalMConfiguration));
    }

    public List<Operation> Operations { get; }

    public MConfiguration FinalMConfiguration { get; }
}