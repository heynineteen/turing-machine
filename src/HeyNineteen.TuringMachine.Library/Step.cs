namespace HeyNineteen.TuringMachine.Library;

using System;
using System.Diagnostics;

[DebuggerDisplay("{ConfigurationSpecification}:{Behavior}")]
public class Step
{
    public Step(ConfigurationSpecification configurationSpecification, Behavior behavior)
    {
        ConfigurationSpecification = configurationSpecification ?? throw new ArgumentNullException(nameof(configurationSpecification));
        Behavior = behavior ?? throw new ArgumentNullException(nameof(behavior));
    }

    public ConfigurationSpecification ConfigurationSpecification { get; }

    public Behavior Behavior { get; }
}