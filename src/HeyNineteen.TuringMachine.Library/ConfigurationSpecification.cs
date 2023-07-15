namespace HeyNineteen.TuringMachine.Library;

using System;
using System.Diagnostics;

[DebuggerDisplay("{MConfiguration.Value} : {SymbolSpecification}")]
public class ConfigurationSpecification
{
    public ConfigurationSpecification(MConfiguration mConfiguration, SymbolSpecification symbolSpecification)
    {
        MConfiguration = mConfiguration ?? throw new ArgumentNullException(nameof(mConfiguration));
        SymbolSpecification = symbolSpecification;
    }

    public SymbolSpecification SymbolSpecification { get; }

    public MConfiguration MConfiguration { get; }

    public bool IsSatisfiedBy(Configuration configuration)
    {
        _ = configuration ?? throw new ArgumentNullException(nameof(configuration));

        return configuration.MConfiguration == MConfiguration
               && SymbolSpecification.IsSatisfiedBy(configuration.Symbol);
    }
}