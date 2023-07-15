namespace HeyNineteen.TuringMachine.Library;

using Antlr4.Runtime.Tree;
using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;
using System.Linq;

public class TuringMachineVisitor : TuringMachineBaseVisitor<Machine>
{
    private Machine _machine;
    private MConfiguration _currentMConfiguration;
    private SymbolSpecification _currentSymbolSpecification;
    private MConfiguration _currentFinalMConfiguration;
    private readonly List<Operation> _currentOperations = new();
    private readonly List<Step> _steps = new();

    private readonly SymbolSpecification _defaultSymbolSpecification = new(SymbolSpecificationWildcard.AnyOrNone);

    public override Machine VisitMachine(TuringMachineParser.MachineContext context)
    {
        base.VisitMachine(context);
        ValidateSteps();
        return _machine = new Machine(_steps);
    }

    private void ValidateSteps()
    {
        var finalConfigurations = _steps.Select(s => s.Behavior.FinalMConfiguration);
        var mConfigurations = _steps.Select(s => s.ConfigurationSpecification.MConfiguration);

        var orphanFinalConfigurations = finalConfigurations.Except(mConfigurations).ToList();

        if (orphanFinalConfigurations.Any())
            ThrowBuildExceptionFromOrphanFinalConfigurations(orphanFinalConfigurations);
    }

    [DoesNotReturn]
    private void ThrowBuildExceptionFromOrphanFinalConfigurations(List<MConfiguration> orphanFinalConfigurations)
    {
        throw new BuildException(BuildExceptionMessage(orphanFinalConfigurations));

        string BuildExceptionMessage(IEnumerable<MConfiguration> orphans)
        {
            var orphanCsv = string.Join(", ", orphans.Select(o => $"'{o.Value}'"));
            return $"The following FinalConfigurations could not be matched with an MConfiguration: {orphanCsv}.";
        }
    }

    public override Machine VisitStep(TuringMachineParser.StepContext context)
    {
        ClearCurrentState();

        base.VisitStep(context);

        _steps.Add(
            new Step(new ConfigurationSpecification(_currentMConfiguration, _currentSymbolSpecification),
                new Behavior(_currentOperations, _currentFinalMConfiguration)));

        return null;
    }

    private void ClearCurrentState()
    {
        _currentMConfiguration = null;
        _currentOperations.Clear();
        _currentFinalMConfiguration = null;
        _currentSymbolSpecification = _defaultSymbolSpecification;
    }

    public override Machine VisitFinalMConfiguration(TuringMachineParser.FinalMConfigurationContext context)
    {
        _currentFinalMConfiguration = context.GetText();
        return null;
    }

    public override Machine VisitMoveLeft(TuringMachineParser.MoveLeftContext context)
    {
        _currentOperations.Add(new MoveLeft());
        return null;
    }

    public override Machine VisitMoveRight(TuringMachineParser.MoveRightContext context)
    {
        _currentOperations.Add(new MoveRight());
        return null;
    }

    public override Machine VisitErase(TuringMachineParser.EraseContext context)
    {
        _currentOperations.Add(new Erase());
        return null;
    }

    public override Machine VisitPrint(TuringMachineParser.PrintContext context)
    {
        var printChar = context.GetChild(1).GetText()[0];
        _currentOperations.Add(new Print(printChar));
        return null;
    }

    public override Machine VisitNoneSymbolSpecification(TuringMachineParser.NoneSymbolSpecificationContext context)
    {
        _currentSymbolSpecification = SymbolSpecificationWildcard.None;
        return null;
    }

    public override Machine VisitAnySymbolSpecification(TuringMachineParser.AnySymbolSpecificationContext context)
    {
        _currentSymbolSpecification = SymbolSpecificationWildcard.Any;
        return null;
    }

    public override Machine VisitAnyOrNoneSymbolSpecification(TuringMachineParser.AnyOrNoneSymbolSpecificationContext context)
    {
        _currentSymbolSpecification = SymbolSpecificationWildcard.AnyOrNone;
        return null;
    }

    public override Machine VisitSymbolSymbolSpecification(TuringMachineParser.SymbolSymbolSpecificationContext context)
    {
        _currentSymbolSpecification = context.GetText()[0];
        return null;
    }

    public override Machine VisitMConfiguration(TuringMachineParser.MConfigurationContext context)
    {
        _currentMConfiguration = context.GetText();
        return null;
    }

    public override Machine Visit(IParseTree tree)
    {
        base.Visit(tree);

        return _machine;
    }
}