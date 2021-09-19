//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.9.2
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from TuringMachine.g4 by ANTLR 4.9.2

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419


using Antlr4.Runtime.Misc;
using IErrorNode = Antlr4.Runtime.Tree.IErrorNode;
using ITerminalNode = Antlr4.Runtime.Tree.ITerminalNode;
using IToken = Antlr4.Runtime.IToken;
using ParserRuleContext = Antlr4.Runtime.ParserRuleContext;

/// <summary>
/// This class provides an empty implementation of <see cref="ITuringMachineListener"/>,
/// which can be extended to create a listener which only needs to handle a subset
/// of the available methods.
/// </summary>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.9.2")]
[System.Diagnostics.DebuggerNonUserCode]
[System.CLSCompliant(false)]
public partial class TuringMachineBaseListener : ITuringMachineListener {
	/// <summary>
	/// Enter a parse tree produced by <see cref="TuringMachineParser.file"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterFile([NotNull] TuringMachineParser.FileContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="TuringMachineParser.file"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitFile([NotNull] TuringMachineParser.FileContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="TuringMachineParser.machine"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterMachine([NotNull] TuringMachineParser.MachineContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="TuringMachineParser.machine"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitMachine([NotNull] TuringMachineParser.MachineContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="TuringMachineParser.line"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterLine([NotNull] TuringMachineParser.LineContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="TuringMachineParser.line"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitLine([NotNull] TuringMachineParser.LineContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="TuringMachineParser.finalMConfiguration"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterFinalMConfiguration([NotNull] TuringMachineParser.FinalMConfigurationContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="TuringMachineParser.finalMConfiguration"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitFinalMConfiguration([NotNull] TuringMachineParser.FinalMConfigurationContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="TuringMachineParser.operations"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterOperations([NotNull] TuringMachineParser.OperationsContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="TuringMachineParser.operations"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitOperations([NotNull] TuringMachineParser.OperationsContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="TuringMachineParser.operation"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterOperation([NotNull] TuringMachineParser.OperationContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="TuringMachineParser.operation"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitOperation([NotNull] TuringMachineParser.OperationContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="TuringMachineParser.moveLeft"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterMoveLeft([NotNull] TuringMachineParser.MoveLeftContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="TuringMachineParser.moveLeft"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitMoveLeft([NotNull] TuringMachineParser.MoveLeftContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="TuringMachineParser.moveRight"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterMoveRight([NotNull] TuringMachineParser.MoveRightContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="TuringMachineParser.moveRight"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitMoveRight([NotNull] TuringMachineParser.MoveRightContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="TuringMachineParser.erase"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterErase([NotNull] TuringMachineParser.EraseContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="TuringMachineParser.erase"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitErase([NotNull] TuringMachineParser.EraseContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="TuringMachineParser.print"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterPrint([NotNull] TuringMachineParser.PrintContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="TuringMachineParser.print"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitPrint([NotNull] TuringMachineParser.PrintContext context) { }
	/// <summary>
	/// Enter a parse tree produced by the <c>None</c>
	/// labeled alternative in <see cref="TuringMachineParser.symbolSpecification"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterNone([NotNull] TuringMachineParser.NoneContext context) { }
	/// <summary>
	/// Exit a parse tree produced by the <c>None</c>
	/// labeled alternative in <see cref="TuringMachineParser.symbolSpecification"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitNone([NotNull] TuringMachineParser.NoneContext context) { }
	/// <summary>
	/// Enter a parse tree produced by the <c>Any</c>
	/// labeled alternative in <see cref="TuringMachineParser.symbolSpecification"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterAny([NotNull] TuringMachineParser.AnyContext context) { }
	/// <summary>
	/// Exit a parse tree produced by the <c>Any</c>
	/// labeled alternative in <see cref="TuringMachineParser.symbolSpecification"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitAny([NotNull] TuringMachineParser.AnyContext context) { }
	/// <summary>
	/// Enter a parse tree produced by the <c>AnyNone</c>
	/// labeled alternative in <see cref="TuringMachineParser.symbolSpecification"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterAnyNone([NotNull] TuringMachineParser.AnyNoneContext context) { }
	/// <summary>
	/// Exit a parse tree produced by the <c>AnyNone</c>
	/// labeled alternative in <see cref="TuringMachineParser.symbolSpecification"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitAnyNone([NotNull] TuringMachineParser.AnyNoneContext context) { }
	/// <summary>
	/// Enter a parse tree produced by the <c>Symbol</c>
	/// labeled alternative in <see cref="TuringMachineParser.symbolSpecification"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterSymbol([NotNull] TuringMachineParser.SymbolContext context) { }
	/// <summary>
	/// Exit a parse tree produced by the <c>Symbol</c>
	/// labeled alternative in <see cref="TuringMachineParser.symbolSpecification"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitSymbol([NotNull] TuringMachineParser.SymbolContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="TuringMachineParser.mConfiguration"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterMConfiguration([NotNull] TuringMachineParser.MConfigurationContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="TuringMachineParser.mConfiguration"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitMConfiguration([NotNull] TuringMachineParser.MConfigurationContext context) { }

	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void EnterEveryRule([NotNull] ParserRuleContext context) { }
	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void ExitEveryRule([NotNull] ParserRuleContext context) { }
	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void VisitTerminal([NotNull] ITerminalNode node) { }
	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void VisitErrorNode([NotNull] IErrorNode node) { }
}
