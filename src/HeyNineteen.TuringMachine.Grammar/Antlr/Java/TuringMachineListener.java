// Generated from TuringMachine.g4 by ANTLR 4.13.0

#pragma warning disable 3021

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TuringMachineParser}.
 */
public interface TuringMachineListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TuringMachineParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(TuringMachineParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringMachineParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(TuringMachineParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link TuringMachineParser#machine}.
	 * @param ctx the parse tree
	 */
	void enterMachine(TuringMachineParser.MachineContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringMachineParser#machine}.
	 * @param ctx the parse tree
	 */
	void exitMachine(TuringMachineParser.MachineContext ctx);
	/**
	 * Enter a parse tree produced by {@link TuringMachineParser#step}.
	 * @param ctx the parse tree
	 */
	void enterStep(TuringMachineParser.StepContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringMachineParser#step}.
	 * @param ctx the parse tree
	 */
	void exitStep(TuringMachineParser.StepContext ctx);
	/**
	 * Enter a parse tree produced by {@link TuringMachineParser#finalMConfiguration}.
	 * @param ctx the parse tree
	 */
	void enterFinalMConfiguration(TuringMachineParser.FinalMConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringMachineParser#finalMConfiguration}.
	 * @param ctx the parse tree
	 */
	void exitFinalMConfiguration(TuringMachineParser.FinalMConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TuringMachineParser#operations}.
	 * @param ctx the parse tree
	 */
	void enterOperations(TuringMachineParser.OperationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringMachineParser#operations}.
	 * @param ctx the parse tree
	 */
	void exitOperations(TuringMachineParser.OperationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TuringMachineParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(TuringMachineParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringMachineParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(TuringMachineParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TuringMachineParser#moveLeft}.
	 * @param ctx the parse tree
	 */
	void enterMoveLeft(TuringMachineParser.MoveLeftContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringMachineParser#moveLeft}.
	 * @param ctx the parse tree
	 */
	void exitMoveLeft(TuringMachineParser.MoveLeftContext ctx);
	/**
	 * Enter a parse tree produced by {@link TuringMachineParser#moveRight}.
	 * @param ctx the parse tree
	 */
	void enterMoveRight(TuringMachineParser.MoveRightContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringMachineParser#moveRight}.
	 * @param ctx the parse tree
	 */
	void exitMoveRight(TuringMachineParser.MoveRightContext ctx);
	/**
	 * Enter a parse tree produced by {@link TuringMachineParser#erase}.
	 * @param ctx the parse tree
	 */
	void enterErase(TuringMachineParser.EraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringMachineParser#erase}.
	 * @param ctx the parse tree
	 */
	void exitErase(TuringMachineParser.EraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TuringMachineParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(TuringMachineParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringMachineParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(TuringMachineParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NoneSymbolSpecification}
	 * labeled alternative in {@link TuringMachineParser#symbolSpecification}.
	 * @param ctx the parse tree
	 */
	void enterNoneSymbolSpecification(TuringMachineParser.NoneSymbolSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NoneSymbolSpecification}
	 * labeled alternative in {@link TuringMachineParser#symbolSpecification}.
	 * @param ctx the parse tree
	 */
	void exitNoneSymbolSpecification(TuringMachineParser.NoneSymbolSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnySymbolSpecification}
	 * labeled alternative in {@link TuringMachineParser#symbolSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAnySymbolSpecification(TuringMachineParser.AnySymbolSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnySymbolSpecification}
	 * labeled alternative in {@link TuringMachineParser#symbolSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAnySymbolSpecification(TuringMachineParser.AnySymbolSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnyOrNoneSymbolSpecification}
	 * labeled alternative in {@link TuringMachineParser#symbolSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAnyOrNoneSymbolSpecification(TuringMachineParser.AnyOrNoneSymbolSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnyOrNoneSymbolSpecification}
	 * labeled alternative in {@link TuringMachineParser#symbolSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAnyOrNoneSymbolSpecification(TuringMachineParser.AnyOrNoneSymbolSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SymbolSymbolSpecification}
	 * labeled alternative in {@link TuringMachineParser#symbolSpecification}.
	 * @param ctx the parse tree
	 */
	void enterSymbolSymbolSpecification(TuringMachineParser.SymbolSymbolSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SymbolSymbolSpecification}
	 * labeled alternative in {@link TuringMachineParser#symbolSpecification}.
	 * @param ctx the parse tree
	 */
	void exitSymbolSymbolSpecification(TuringMachineParser.SymbolSymbolSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TuringMachineParser#mConfiguration}.
	 * @param ctx the parse tree
	 */
	void enterMConfiguration(TuringMachineParser.MConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringMachineParser#mConfiguration}.
	 * @param ctx the parse tree
	 */
	void exitMConfiguration(TuringMachineParser.MConfigurationContext ctx);
}