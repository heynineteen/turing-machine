namespace HeyNineteen.TuringMachine.Library
{
    using Antlr4.Runtime;
    using System;
    using System.Collections.Generic;
    using System.Runtime.Serialization;
    using Antlr4.Runtime.Tree;

    public class MachineBuilder
    {
        public Machine Build(string input)
        {
            try
            {
                var inputStream = new AntlrInputStream(input);
                var lexer = new TuringMachineLexer(inputStream);
                var commonTokenStream = new CommonTokenStream(lexer);
                var parser = new TuringMachineParser(commonTokenStream);
                TuringMachineParser.FileContext fileContext = parser.file();

                // Console.WriteLine(fileContext.ToStringTree(parser));

                var visitor = new TuringMachineVisitor();
                return visitor.Visit( fileContext );
            }
            catch (Exception)
            {
                throw;
            }
        }
    }

    public class TuringMachineVisitor : TuringMachineBaseVisitor<Machine>
    {
        private Machine _machine;
        private MConfiguration _currentMConfiguration;
        private SymbolSpecification _currentSymbolSpecification;
        private List<Operation> _currentOperations = new();
        private MConfiguration _currentFinalMConfiguration;
        private List<Step> _steps = new();

        public override Machine VisitFile(TuringMachineParser.FileContext context)
        {
            return base.VisitFile(context);
        }

        public override Machine VisitMachine(TuringMachineParser.MachineContext context)
        {
            var machine = base.VisitMachine(context);

            ValidateMachine(machine);

            return machine;
        }

        private void ValidateMachine(Machine machine)
        {

        }

        public override Machine VisitStep(TuringMachineParser.StepContext context)
        {
            ClearCurrentState();
            
            var machine = base.VisitStep(context);

            _steps.Add(
                new Step(new ConfigurationSpecification(_currentMConfiguration, _currentSymbolSpecification),
                    new Behavior(_currentOperations, _currentFinalMConfiguration)));

            return machine;
        }

        private void ClearCurrentState()
        {
            _currentMConfiguration = null;
            _currentOperations.Clear();
            _currentFinalMConfiguration = null;
            _currentSymbolSpecification = null;
        }

        public override Machine VisitFinalMConfiguration(TuringMachineParser.FinalMConfigurationContext context)
        {
            return base.VisitFinalMConfiguration(context);
        }

        public override Machine VisitOperations(TuringMachineParser.OperationsContext context)
        {
            return base.VisitOperations(context);
        }

        public override Machine VisitOperation(TuringMachineParser.OperationContext context)
        {
            return base.VisitOperation(context);
        }

        public override Machine VisitMoveLeft(TuringMachineParser.MoveLeftContext context)
        {
            return base.VisitMoveLeft(context);
        }

        public override Machine VisitMoveRight(TuringMachineParser.MoveRightContext context)
        {
            return base.VisitMoveRight(context);
        }

        public override Machine VisitErase(TuringMachineParser.EraseContext context)
        {
            return base.VisitErase(context);
        }

        public override Machine VisitPrint(TuringMachineParser.PrintContext context)
        {
            return base.VisitPrint(context);
        }

        public override Machine VisitNoneSymbolSpecification(TuringMachineParser.NoneSymbolSpecificationContext context)
        {
            //return base.VisitNoneSymbolSpecification(context);

            _currentSymbolSpecification = SymbolSpecificationWildcard.None;

            return null;
        }

        public override Machine VisitNotNoneSymbolSpecification(TuringMachineParser.NotNoneSymbolSpecificationContext context)
        {
            //return base.VisitNotNoneSymbolSpecification(context);

            _currentSymbolSpecification = SymbolSpecificationWildcard.NotNone;

            return null;
        }

        public override Machine VisitAnySymbolSpecification(TuringMachineParser.AnySymbolSpecificationContext context)
        {
            //return base.VisitAnySymbolSpecification(context);
            _currentSymbolSpecification = SymbolSpecificationWildcard.Any;

            return null;
        }

        public override Machine VisitSymbolSymbolSpecification(TuringMachineParser.SymbolSymbolSpecificationContext context)
        {
            //return base.VisitSymbolSymbolSpecification(context);

            //_currentSymbolSpecification = context.VALID_CHAR[0];

            return null;
        }

        public override Machine VisitMConfiguration(TuringMachineParser.MConfigurationContext context)
        {
            //return base.VisitMConfiguration(context);
            _currentMConfiguration = context.GetText();

            return null;
        }

        public override Machine Visit(IParseTree tree)
        {
            return base.Visit(tree);
        }

        public override Machine VisitChildren(IRuleNode node)
        {
            return base.VisitChildren(node);
        }

        public override Machine VisitTerminal(ITerminalNode node)
        {
            return base.VisitTerminal(node);
        }

        public override Machine VisitErrorNode(IErrorNode node)
        {
            return base.VisitErrorNode(node);
        }

        protected override Machine AggregateResult( Machine aggregate, Machine nextResult )
        {
            return base.AggregateResult(aggregate, nextResult);
        }

        protected override bool ShouldVisitNextChild(IRuleNode node, Machine currentResult )
        {
            return base.ShouldVisitNextChild(node, currentResult);
        }
    }
}