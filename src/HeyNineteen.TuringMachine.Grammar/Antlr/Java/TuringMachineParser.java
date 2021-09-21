// Generated from TuringMachine.g4 by ANTLR 4.9.2

#pragma warning disable 3021

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TuringMachineParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
			null, "'->'", "';'", "','", "'L'", "'R'", "'E'", "'P'", "'none'", "'notNone'", 
			"'any'"
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

	public static class StepContext extends ParserRuleContext {
		public MConfigurationContext mConfiguration() {
			return getRuleContext(MConfigurationContext.class,0);
		}
		public SymbolSpecificationContext symbolSpecification() {
			return getRuleContext(SymbolSpecificationContext.class,0);
		}
		public OperationsContext operations() {
			return getRuleContext(OperationsContext.class,0);
		}
		public FinalMConfigurationContext finalMConfiguration() {
			return getRuleContext(FinalMConfigurationContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			mConfiguration();
			setState(35);
			match(T__0);
			setState(36);
			symbolSpecification();
			setState(37);
			match(T__0);
			setState(38);
			operations();
			setState(39);
			match(T__0);
			setState(40);
			finalMConfiguration();
			setState(41);
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
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(43);
				match(VALID_CHAR);
				}
				}
				setState(46); 
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
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) {
				{
				setState(48);
				operation();
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(49);
					match(T__2);
					setState(50);
					operation();
					}
					}
					setState(55);
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
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				moveLeft();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				moveRight();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				erase();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
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
			setState(64);
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
			setState(66);
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
			setState(68);
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
			setState(70);
			match(T__6);
			setState(71);
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
	public static class NotNoneSymbolSpecificationContext extends SymbolSpecificationContext {
		public NotNoneSymbolSpecificationContext(SymbolSpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).enterNotNoneSymbolSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringMachineListener ) ((TuringMachineListener)listener).exitNotNoneSymbolSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TuringMachineVisitor ) return ((TuringMachineVisitor<? extends T>)visitor).visitNotNoneSymbolSpecification(this);
			else return visitor.visitChildren(this);
		}
	}
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

	public final SymbolSpecificationContext symbolSpecification() throws RecognitionException {
		SymbolSpecificationContext _localctx = new SymbolSpecificationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_symbolSpecification);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				_localctx = new NoneSymbolSpecificationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(T__7);
				}
				break;
			case T__8:
				_localctx = new NotNoneSymbolSpecificationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(T__8);
				}
				break;
			case T__9:
				_localctx = new AnySymbolSpecificationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				match(T__9);
				}
				break;
			case VALID_CHAR:
				_localctx = new SymbolSymbolSpecificationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
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
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(79);
				match(VALID_CHAR);
				}
				}
				setState(82); 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20W\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\3\3\7\3 \n\3\f\3\16\3#\13\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\6\5/\n\5\r\5\16\5\60\3\6\3\6\3\6\7\6\66\n"+
		"\6\f\6\16\69\13\6\5\6;\n\6\3\7\3\7\3\7\3\7\5\7A\n\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\fP\n\f\3\r\6\rS\n\r\r\r\16\rT"+
		"\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2\2U\2\32\3\2\2\2\4\35\3\2"+
		"\2\2\6$\3\2\2\2\b.\3\2\2\2\n:\3\2\2\2\f@\3\2\2\2\16B\3\2\2\2\20D\3\2\2"+
		"\2\22F\3\2\2\2\24H\3\2\2\2\26O\3\2\2\2\30R\3\2\2\2\32\33\5\4\3\2\33\34"+
		"\7\2\2\3\34\3\3\2\2\2\35!\5\6\4\2\36 \5\6\4\2\37\36\3\2\2\2 #\3\2\2\2"+
		"!\37\3\2\2\2!\"\3\2\2\2\"\5\3\2\2\2#!\3\2\2\2$%\5\30\r\2%&\7\3\2\2&\'"+
		"\5\26\f\2\'(\7\3\2\2()\5\n\6\2)*\7\3\2\2*+\5\b\5\2+,\7\4\2\2,\7\3\2\2"+
		"\2-/\7\r\2\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\t\3\2"+
		"\2\2\62\67\5\f\7\2\63\64\7\5\2\2\64\66\5\f\7\2\65\63\3\2\2\2\669\3\2\2"+
		"\2\67\65\3\2\2\2\678\3\2\2\28;\3\2\2\29\67\3\2\2\2:\62\3\2\2\2:;\3\2\2"+
		"\2;\13\3\2\2\2<A\5\16\b\2=A\5\20\t\2>A\5\22\n\2?A\5\24\13\2@<\3\2\2\2"+
		"@=\3\2\2\2@>\3\2\2\2@?\3\2\2\2A\r\3\2\2\2BC\7\6\2\2C\17\3\2\2\2DE\7\7"+
		"\2\2E\21\3\2\2\2FG\7\b\2\2G\23\3\2\2\2HI\7\t\2\2IJ\7\r\2\2J\25\3\2\2\2"+
		"KP\7\n\2\2LP\7\13\2\2MP\7\f\2\2NP\7\r\2\2OK\3\2\2\2OL\3\2\2\2OM\3\2\2"+
		"\2ON\3\2\2\2P\27\3\2\2\2QS\7\r\2\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2"+
		"\2\2U\31\3\2\2\2\t!\60\67:@OT";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}