// Generated from TuringMachine.g4 by ANTLR 4.9.2

#pragma warning disable 3021

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TuringMachineLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20c\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\7\rH\n\r\f\r\16\rK\13\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16"+
		"V\n\16\f\16\16\16Y\13\16\3\16\3\16\3\17\6\17^\n\17\r\17\16\17_\3\17\3"+
		"\17\3I\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\3\2\5\7\2//\62;B\\aac|\4\2\f\f\17\17\5\2\13\f\16\17\"\"\2e\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5\"\3\2\2\2\7$\3\2"+
		"\2\2\t&\3\2\2\2\13(\3\2\2\2\r*\3\2\2\2\17,\3\2\2\2\21.\3\2\2\2\23\63\3"+
		"\2\2\2\25\67\3\2\2\2\27A\3\2\2\2\31C\3\2\2\2\33Q\3\2\2\2\35]\3\2\2\2\37"+
		" \7/\2\2 !\7@\2\2!\4\3\2\2\2\"#\7=\2\2#\6\3\2\2\2$%\7.\2\2%\b\3\2\2\2"+
		"&\'\7N\2\2\'\n\3\2\2\2()\7T\2\2)\f\3\2\2\2*+\7G\2\2+\16\3\2\2\2,-\7R\2"+
		"\2-\20\3\2\2\2./\7p\2\2/\60\7q\2\2\60\61\7p\2\2\61\62\7g\2\2\62\22\3\2"+
		"\2\2\63\64\7c\2\2\64\65\7p\2\2\65\66\7{\2\2\66\24\3\2\2\2\678\7c\2\28"+
		"9\7p\2\29:\7{\2\2:;\7Q\2\2;<\7t\2\2<=\7P\2\2=>\7q\2\2>?\7p\2\2?@\7g\2"+
		"\2@\26\3\2\2\2AB\t\2\2\2B\30\3\2\2\2CD\7\61\2\2DE\7,\2\2EI\3\2\2\2FH\13"+
		"\2\2\2GF\3\2\2\2HK\3\2\2\2IJ\3\2\2\2IG\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7"+
		",\2\2MN\7\61\2\2NO\3\2\2\2OP\b\r\2\2P\32\3\2\2\2QR\7\61\2\2RS\7\61\2\2"+
		"SW\3\2\2\2TV\n\3\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2"+
		"YW\3\2\2\2Z[\b\16\2\2[\34\3\2\2\2\\^\t\4\2\2]\\\3\2\2\2^_\3\2\2\2_]\3"+
		"\2\2\2_`\3\2\2\2`a\3\2\2\2ab\b\17\2\2b\36\3\2\2\2\6\2IW_\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}