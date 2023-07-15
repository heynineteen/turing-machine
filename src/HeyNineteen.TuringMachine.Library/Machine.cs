namespace HeyNineteen.TuringMachine.Library;

using System;
using System.Collections.Generic;
using System.Linq;

public class Machine
{
    private readonly List<Step> _steps;
    private readonly Tape _tape = new();
    private readonly CompleteConfiguration _completeConfiguration;
    private MConfiguration _currentMConfiguration;

    public Machine(IEnumerable<Step> steps)
    {
        _steps = steps?.ToList() ?? throw new ArgumentNullException(nameof(steps));

        if (!_steps.Any())
            throw new ArgumentException("Sequence must contain at least one element.", nameof(steps));

        _currentMConfiguration = _steps[0].ConfigurationSpecification.MConfiguration;
        _completeConfiguration = new CompleteConfiguration(_tape, _currentMConfiguration);
    }

    public void Tick()
    {
        var configuration = new Configuration(_currentMConfiguration, _tape.Read());

        var step = _steps.FirstOrDefault(step => step.ConfigurationSpecification.IsSatisfiedBy(configuration));

        if (step == null)
            throw new UnrecognisedConfigurationException(configuration);

        foreach (var operation in step.Behavior.Operations)
        {
            operation.Execute(_tape);
        }

        _currentMConfiguration = step.Behavior.FinalMConfiguration;
    }

    public string State => _completeConfiguration.With(_currentMConfiguration).ToString();
}