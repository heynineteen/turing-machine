// Generated from TuringMachine.g4 by ANTLR 4.13.0

#pragma warning disable 3021

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TuringMachineParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, VALID_CHAR=11, BLOCK_COMMENT=12, LINE_COMMENT=13, WS=14;
	public static final int
		RULE_file = 0, RULE_machine = 1, RULE_step = 2, RULE_finalMConfiguration = 3, 
		RULE_operations = 4, RULE_operation = 5, RULE_moveLeft = 6, RULE_moveRight = 7, 
		RULE_erase = 8, RULE_print = 9, RULE_symbolSpecification = 10, RULE_mConfiguration = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "machine", "step", "finalMConfiguration", "operations", "operation", 
			"moveLeft", "moveRight", "erase", "print", "symbolSpecification", "mConfiguration"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'->'", "';'", "','", "'L'", "'R'", "'E'", "'P'", "'none'", "'any'", 
			"'anyOrNone'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "VALID_CHAR", 
			"BLOCK_COMMENT", "LINE_COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TuringMachine.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TuringMachineParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FileContext extends ParserRuleContext {
		public MachineContext machine() {
			return getRuleContext(MachineContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TuringMachineParser.EOF, 0); }
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TuringMachineVisitor ) return ((TuringMachineVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			machine();
			setState(25);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MachineContext extends ParserRuleContext {
		public List<StepContext> step() {
			return getRuleContexts(StepContext.class);
		}
		public StepContext step(int i) {
			return getRuleContext(StepContext.class,i);
		}
		public MachineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_machine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).enterMachine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).exitMachine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TuringMachineVisitor ) return ((TuringMachineVisitor<? extends T>)visitor).visitMachine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MachineContext machine() throws RecognitionException {
		MachineContext _localctx = new MachineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_machine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			step();
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VALID_CHAR) {
				{
				{
				setState(28);
				step();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StepContext extends ParserRuleContext {
		public MConfigurationContext mConfiguration() {
			return getRuleContext(MConfigurationContext.class,0);
		}
		public OperationsContext operations() {
			return getRuleContext(OperationsContext.class,0);
		}
		public FinalMConfigurationContext finalMConfiguration() {
			return getRuleContext(FinalMConfigurationContext.class,0);
		}
		public SymbolSpecificationContext symbolSpecification() {
			return getRuleContext(SymbolSpecificationContext.class,0);
		}
		public StepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).enterStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).exitStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TuringMachineVisitor ) return ((TuringMachineVisitor<? extends T>)visitor).visitStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_step);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			mConfiguration();
			setState(35);
			match(T__0);
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3840L) != 0)) {
				{
				setState(36);
				symbolSpecification();
				}
			}

			setState(39);
			match(T__0);
			setState(40);
			operations();
			setState(41);
			match(T__0);
			setState(42);
			finalMConfiguration();
			setState(43);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FinalMConfigurationContext extends ParserRuleContext {
		public List<TerminalNode> VALID_CHAR() { return getTokens(TuringMachineParser.VALID_CHAR); }
		public TerminalNode VALID_CHAR(int i) {
			return getToken(TuringMachineParser.VALID_CHAR, i);
		}
		public FinalMConfigurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalMConfiguration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).enterFinalMConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).exitFinalMConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TuringMachineVisitor ) return ((TuringMachineVisitor<? extends T>)visitor).visitFinalMConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinalMConfigurationContext finalMConfiguration() throws RecognitionException {
		FinalMConfigurationContext _localctx = new FinalMConfigurationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_finalMConfiguration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(45);
				match(VALID_CHAR);
				}
				}
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VALID_CHAR );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperationsContext extends ParserRuleContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public OperationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).enterOperations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).exitOperations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TuringMachineVisitor ) return ((TuringMachineVisitor<? extends T>)visitor).visitOperations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationsContext operations() throws RecognitionException {
		OperationsContext _localctx = new OperationsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 240L) != 0)) {
				{
				setState(50);
				operation();
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(51);
					match(T__2);
					setState(52);
					operation();
					}
					}
					setState(57);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperationContext extends ParserRuleContext {
		public MoveLeftContext moveLeft() {
			return getRuleContext(MoveLeftContext.class,0);
		}
		public MoveRightContext moveRight() {
			return getRuleContext(MoveRightContext.class,0);
		}
		public EraseContext erase() {
			return getRuleContext(EraseContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TuringMachineVisitor ) return ((TuringMachineVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operation);
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				moveLeft();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				moveRight();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				erase();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				print();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MoveLeftContext extends ParserRuleContext {
		public MoveLeftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveLeft; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).enterMoveLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).exitMoveLeft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TuringMachineVisitor ) return ((TuringMachineVisitor<? extends T>)visitor).visitMoveLeft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoveLeftContext moveLeft() throws RecognitionException {
		MoveLeftContext _localctx = new MoveLeftContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_moveLeft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MoveRightContext extends ParserRuleContext {
		public MoveRightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveRight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).enterMoveRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).exitMoveRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TuringMachineVisitor ) return ((TuringMachineVisitor<? extends T>)visitor).visitMoveRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoveRightContext moveRight() throws RecognitionException {
		MoveRightContext _localctx = new MoveRightContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_moveRight);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EraseContext extends ParserRuleContext {
		public EraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_erase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).enterErase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).exitErase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TuringMachineVisitor ) return ((TuringMachineVisitor<? extends T>)visitor).visitErase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EraseContext erase() throws RecognitionException {
		EraseContext _localctx = new EraseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_erase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public TerminalNode VALID_CHAR() { return getToken(TuringMachineParser.VALID_CHAR, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TuringMachineVisitor ) return ((TuringMachineVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__6);
			setState(73);
			match(VALID_CHAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SymbolSpecificationContext extends ParserRuleContext {
		public SymbolSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbolSpecification; }
	 
		public SymbolSpecificationContext() { }
		public void copyFrom(SymbolSpecificationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SymbolSymbolSpecificationContext extends SymbolSpecificationContext {
		public TerminalNode VALID_CHAR() { return getToken(TuringMachineParser.VALID_CHAR, 0); }
		public SymbolSymbolSpecificationContext(SymbolSpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).enterSymbolSymbolSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).exitSymbolSymbolSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TuringMachineVisitor ) return ((TuringMachineVisitor<? extends T>)visitor).visitSymbolSymbolSpecification(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NoneSymbolSpecificationContext extends SymbolSpecificationContext {
		public NoneSymbolSpecificationContext(SymbolSpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).enterNoneSymbolSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).exitNoneSymbolSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TuringMachineVisitor ) return ((TuringMachineVisitor<? extends T>)visitor).visitNoneSymbolSpecification(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnySymbolSpecificationContext extends SymbolSpecificationContext {
		public AnySymbolSpecificationContext(SymbolSpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).enterAnySymbolSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).exitAnySymbolSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TuringMachineVisitor ) return ((TuringMachineVisitor<? extends T>)visitor).visitAnySymbolSpecification(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnyOrNoneSymbolSpecificationContext extends SymbolSpecificationContext {
		public AnyOrNoneSymbolSpecificationContext(SymbolSpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).enterAnyOrNoneSymbolSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).exitAnyOrNoneSymbolSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TuringMachineVisitor ) return ((TuringMachineVisitor<? extends T>)visitor).visitAnyOrNoneSymbolSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolSpecificationContext symbolSpecification() throws RecognitionException {
		SymbolSpecificationContext _localctx = new SymbolSpecificationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_symbolSpecification);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				_localctx = new NoneSymbolSpecificationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(T__7);
				}
				break;
			case T__8:
				_localctx = new AnySymbolSpecificationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(T__8);
				}
				break;
			case T__9:
				_localctx = new AnyOrNoneSymbolSpecificationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				match(T__9);
				}
				break;
			case VALID_CHAR:
				_localctx = new SymbolSymbolSpecificationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				match(VALID_CHAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MConfigurationContext extends ParserRuleContext {
		public List<TerminalNode> VALID_CHAR() { return getTokens(TuringMachineParser.VALID_CHAR); }
		public TerminalNode VALID_CHAR(int i) {
			return getToken(TuringMachineParser.VALID_CHAR, i);
		}
		public MConfigurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mConfiguration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).enterMConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).exitMConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TuringMachineVisitor ) return ((TuringMachineVisitor<? extends T>)visitor).visitMConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MConfigurationContext mConfiguration() throws RecognitionException {
		MConfigurationContext _localctx = new MConfigurationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mConfiguration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(81);
				match(VALID_CHAR);
				}
				}
				setState(84); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VALID_CHAR );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000eW\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001\u001e"+
		"\b\u0001\n\u0001\f\u0001!\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002&\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0004\u0003/\b\u0003\u000b\u0003"+
		"\f\u00030\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u00046\b\u0004\n\u0004"+
		"\f\u00049\t\u0004\u0003\u0004;\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005A\b\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\nP\b\n\u0001\u000b\u0004\u000bS\b\u000b\u000b\u000b\f"+
		"\u000bT\u0001\u000b\u0000\u0000\f\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0000\u0000V\u0000\u0018\u0001\u0000\u0000\u0000"+
		"\u0002\u001b\u0001\u0000\u0000\u0000\u0004\"\u0001\u0000\u0000\u0000\u0006"+
		".\u0001\u0000\u0000\u0000\b:\u0001\u0000\u0000\u0000\n@\u0001\u0000\u0000"+
		"\u0000\fB\u0001\u0000\u0000\u0000\u000eD\u0001\u0000\u0000\u0000\u0010"+
		"F\u0001\u0000\u0000\u0000\u0012H\u0001\u0000\u0000\u0000\u0014O\u0001"+
		"\u0000\u0000\u0000\u0016R\u0001\u0000\u0000\u0000\u0018\u0019\u0003\u0002"+
		"\u0001\u0000\u0019\u001a\u0005\u0000\u0000\u0001\u001a\u0001\u0001\u0000"+
		"\u0000\u0000\u001b\u001f\u0003\u0004\u0002\u0000\u001c\u001e\u0003\u0004"+
		"\u0002\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e!\u0001\u0000\u0000"+
		"\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000"+
		" \u0003\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\"#\u0003"+
		"\u0016\u000b\u0000#%\u0005\u0001\u0000\u0000$&\u0003\u0014\n\u0000%$\u0001"+
		"\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000"+
		"\'(\u0005\u0001\u0000\u0000()\u0003\b\u0004\u0000)*\u0005\u0001\u0000"+
		"\u0000*+\u0003\u0006\u0003\u0000+,\u0005\u0002\u0000\u0000,\u0005\u0001"+
		"\u0000\u0000\u0000-/\u0005\u000b\u0000\u0000.-\u0001\u0000\u0000\u0000"+
		"/0\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000"+
		"\u00001\u0007\u0001\u0000\u0000\u000027\u0003\n\u0005\u000034\u0005\u0003"+
		"\u0000\u000046\u0003\n\u0005\u000053\u0001\u0000\u0000\u000069\u0001\u0000"+
		"\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008;\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u0000:2\u0001\u0000\u0000\u0000"+
		":;\u0001\u0000\u0000\u0000;\t\u0001\u0000\u0000\u0000<A\u0003\f\u0006"+
		"\u0000=A\u0003\u000e\u0007\u0000>A\u0003\u0010\b\u0000?A\u0003\u0012\t"+
		"\u0000@<\u0001\u0000\u0000\u0000@=\u0001\u0000\u0000\u0000@>\u0001\u0000"+
		"\u0000\u0000@?\u0001\u0000\u0000\u0000A\u000b\u0001\u0000\u0000\u0000"+
		"BC\u0005\u0004\u0000\u0000C\r\u0001\u0000\u0000\u0000DE\u0005\u0005\u0000"+
		"\u0000E\u000f\u0001\u0000\u0000\u0000FG\u0005\u0006\u0000\u0000G\u0011"+
		"\u0001\u0000\u0000\u0000HI\u0005\u0007\u0000\u0000IJ\u0005\u000b\u0000"+
		"\u0000J\u0013\u0001\u0000\u0000\u0000KP\u0005\b\u0000\u0000LP\u0005\t"+
		"\u0000\u0000MP\u0005\n\u0000\u0000NP\u0005\u000b\u0000\u0000OK\u0001\u0000"+
		"\u0000\u0000OL\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000ON\u0001"+
		"\u0000\u0000\u0000P\u0015\u0001\u0000\u0000\u0000QS\u0005\u000b\u0000"+
		"\u0000RQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TR\u0001\u0000"+
		"\u0000\u0000TU\u0001\u0000\u0000\u0000U\u0017\u0001\u0000\u0000\u0000"+
		"\b\u001f%07:@OT";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}