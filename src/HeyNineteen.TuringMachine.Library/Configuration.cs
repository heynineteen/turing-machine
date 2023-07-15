namespace HeyNineteen.TuringMachine.Library;

using System;
using System.Diagnostics;

[DebuggerDisplay("{MConfiguration.Value} : {Symbol}")]
public class Configuration
{
    public Configuration(MConfiguration mConfiguration, char? symbol = null)
    {
        MConfiguration = mConfiguration ?? throw new ArgumentNullException(nameof(mConfiguration));
        Symbol = symbol;
    }

    public MConfiguration MConfiguration { get; }

    public char? Symbol { get; }
}