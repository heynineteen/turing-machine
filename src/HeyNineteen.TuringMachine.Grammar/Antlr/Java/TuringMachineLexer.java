// Generated from TuringMachine.g4 by ANTLR 4.13.0

#pragma warning disable 3021

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TuringMachineLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, VALID_CHAR=11, BLOCK_COMMENT=12, LINE_COMMENT=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "VALID_CHAR", "BLOCK_COMMENT", "LINE_COMMENT", "WS"
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


	public TuringMachineLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TuringMachine.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u000ea\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000bF\b\u000b\n\u000b\f\u000bI\t\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\fT\b\f\n\f\f\fW\t\f\u0001\f\u0001\f\u0001\r\u0004"+
		"\r\\\b\r\u000b\r\f\r]\u0001\r\u0001\r\u0001G\u0000\u000e\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u0001\u0000\u0003\u0005"+
		"\u0000--09@Z__az\u0002\u0000\n\n\r\r\u0003\u0000\t\n\f\r  c\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0001\u001d\u0001\u0000"+
		"\u0000\u0000\u0003 \u0001\u0000\u0000\u0000\u0005\"\u0001\u0000\u0000"+
		"\u0000\u0007$\u0001\u0000\u0000\u0000\t&\u0001\u0000\u0000\u0000\u000b"+
		"(\u0001\u0000\u0000\u0000\r*\u0001\u0000\u0000\u0000\u000f,\u0001\u0000"+
		"\u0000\u0000\u00111\u0001\u0000\u0000\u0000\u00135\u0001\u0000\u0000\u0000"+
		"\u0015?\u0001\u0000\u0000\u0000\u0017A\u0001\u0000\u0000\u0000\u0019O"+
		"\u0001\u0000\u0000\u0000\u001b[\u0001\u0000\u0000\u0000\u001d\u001e\u0005"+
		"-\u0000\u0000\u001e\u001f\u0005>\u0000\u0000\u001f\u0002\u0001\u0000\u0000"+
		"\u0000 !\u0005;\u0000\u0000!\u0004\u0001\u0000\u0000\u0000\"#\u0005,\u0000"+
		"\u0000#\u0006\u0001\u0000\u0000\u0000$%\u0005L\u0000\u0000%\b\u0001\u0000"+
		"\u0000\u0000&\'\u0005R\u0000\u0000\'\n\u0001\u0000\u0000\u0000()\u0005"+
		"E\u0000\u0000)\f\u0001\u0000\u0000\u0000*+\u0005P\u0000\u0000+\u000e\u0001"+
		"\u0000\u0000\u0000,-\u0005n\u0000\u0000-.\u0005o\u0000\u0000./\u0005n"+
		"\u0000\u0000/0\u0005e\u0000\u00000\u0010\u0001\u0000\u0000\u000012\u0005"+
		"a\u0000\u000023\u0005n\u0000\u000034\u0005y\u0000\u00004\u0012\u0001\u0000"+
		"\u0000\u000056\u0005a\u0000\u000067\u0005n\u0000\u000078\u0005y\u0000"+
		"\u000089\u0005O\u0000\u00009:\u0005r\u0000\u0000:;\u0005N\u0000\u0000"+
		";<\u0005o\u0000\u0000<=\u0005n\u0000\u0000=>\u0005e\u0000\u0000>\u0014"+
		"\u0001\u0000\u0000\u0000?@\u0007\u0000\u0000\u0000@\u0016\u0001\u0000"+
		"\u0000\u0000AB\u0005/\u0000\u0000BC\u0005*\u0000\u0000CG\u0001\u0000\u0000"+
		"\u0000DF\t\u0000\u0000\u0000ED\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000"+
		"\u0000GH\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HJ\u0001\u0000"+
		"\u0000\u0000IG\u0001\u0000\u0000\u0000JK\u0005*\u0000\u0000KL\u0005/\u0000"+
		"\u0000LM\u0001\u0000\u0000\u0000MN\u0006\u000b\u0000\u0000N\u0018\u0001"+
		"\u0000\u0000\u0000OP\u0005/\u0000\u0000PQ\u0005/\u0000\u0000QU\u0001\u0000"+
		"\u0000\u0000RT\b\u0001\u0000\u0000SR\u0001\u0000\u0000\u0000TW\u0001\u0000"+
		"\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VX\u0001"+
		"\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000XY\u0006\f\u0000\u0000Y\u001a"+
		"\u0001\u0000\u0000\u0000Z\\\u0007\u0002\u0000\u0000[Z\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000"+
		"\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0006\r\u0000\u0000`\u001c\u0001"+
		"\u0000\u0000\u0000\u0004\u0000GU]\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}