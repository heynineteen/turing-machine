// Generated from TuringMachine.g4 by ANTLR 4.9.2

#pragma warning disable 3021

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TuringMachineParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TuringMachineVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TuringMachineParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(TuringMachineParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link TuringMachineParser#machine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMachine(TuringMachineParser.MachineContext ctx);
	/**
	 * Visit a parse tree produced by {@link TuringMachineParser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStep(TuringMachineParser.StepContext ctx);
	/**
	 * Visit a parse tree produced by {@link TuringMachineParser#finalMConfiguration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalMConfiguration(TuringMachineParser.FinalMConfigurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TuringMachineParser#operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperations(TuringMachineParser.OperationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TuringMachineParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(TuringMachineParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TuringMachineParser#moveLeft}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveLeft(TuringMachineParser.MoveLeftContext ctx);
	/**
	 * Visit a parse tree produced by {@link TuringMachineParser#moveRight}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveRight(TuringMachineParser.MoveRightContext ctx);
	/**
	 * Visit a parse tree produced by {@link TuringMachineParser#erase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErase(TuringMachineParser.EraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TuringMachineParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(TuringMachineParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NoneSymbolSpecification}
	 * labeled alternative in {@link TuringMachineParser#symbolSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoneSymbolSpecification(TuringMachineParser.NoneSymbolSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnySymbolSpecification}
	 * labeled alternative in {@link TuringMachineParser#symbolSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnySymbolSpecification(TuringMachineParser.AnySymbolSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnyOrNoneSymbolSpecification}
	 * labeled alternative in {@link TuringMachineParser#symbolSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyOrNoneSymbolSpecification(TuringMachineParser.AnyOrNoneSymbolSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SymbolSymbolSpecification}
	 * labeled alternative in {@link TuringMachineParser#symbolSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolSymbolSpecification(TuringMachineParser.SymbolSymbolSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TuringMachineParser#mConfiguration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMConfiguration(TuringMachineParser.MConfigurationContext ctx);
}