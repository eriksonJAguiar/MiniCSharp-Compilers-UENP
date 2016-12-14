// Generated from D:\Documentos\github\MiniCSharp\antl\miniCsharp.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class miniCsharpLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAIN=1, READ=2, WHITE=3, INT=4, FLOAT=5, DOUBLE=6, CHAR=7, STRING=8, BOOL=9, 
		SOMA=10, SUB=11, DIV=12, MULT=13, REST=14, E=15, OU=16, IF=17, ELSE=18, 
		VAR=19, TEXTO=20, NUM=21, SEP=22, EOL=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'Main'", "'read'", "'white'", "'int'", "'FLOAT'", "'double'", "'char'", 
		"'string'", "'bool'", "SOMA", "SUB", "DIV", "MULT", "REST", "E", "OU", 
		"'if'", "'else'", "VAR", "TEXTO", "NUM", "SEP", "EOL"
	};
	public static final String[] ruleNames = {
		"MAIN", "READ", "WHITE", "INT", "FLOAT", "DOUBLE", "CHAR", "STRING", "BOOL", 
		"SOMA", "SUB", "DIV", "MULT", "REST", "E", "OU", "IF", "ELSE", "VAR", 
		"TEXTO", "NUM", "SEP", "EOL"
	};


	public miniCsharpLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "miniCsharp.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\31\u008c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\6\24{\n\24\r\24\16\24|\3\25\6\25\u0080\n"+
		"\25\r\25\16\25\u0081\3\26\6\26\u0085\n\26\r\26\16\26\u0086\3\27\3\27\3"+
		"\30\3\30\2\31\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13"+
		"\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25"+
		"\1)\26\1+\27\1-\30\1/\31\1\3\2\16\3\2--\3\2//\3\2\61\61\3\2,,\3\2\'\'"+
		"\3\2((\3\2~~\3\2C\\\5\2\61\61YYyy\3\2\62;\3\2..\5\2\61\61ppvv\u008e\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\3\61\3\2\2\2\5\66\3\2\2\2\7;\3\2\2\2\tA\3\2\2\2\13E\3\2\2\2\rK\3\2\2"+
		"\2\17R\3\2\2\2\21W\3\2\2\2\23^\3\2\2\2\25c\3\2\2\2\27e\3\2\2\2\31g\3\2"+
		"\2\2\33i\3\2\2\2\35k\3\2\2\2\37m\3\2\2\2!o\3\2\2\2#q\3\2\2\2%t\3\2\2\2"+
		"\'z\3\2\2\2)\177\3\2\2\2+\u0084\3\2\2\2-\u0088\3\2\2\2/\u008a\3\2\2\2"+
		"\61\62\7O\2\2\62\63\7c\2\2\63\64\7k\2\2\64\65\7p\2\2\65\4\3\2\2\2\66\67"+
		"\7t\2\2\678\7g\2\289\7c\2\29:\7f\2\2:\6\3\2\2\2;<\7y\2\2<=\7j\2\2=>\7"+
		"k\2\2>?\7v\2\2?@\7g\2\2@\b\3\2\2\2AB\7k\2\2BC\7p\2\2CD\7v\2\2D\n\3\2\2"+
		"\2EF\7H\2\2FG\7N\2\2GH\7Q\2\2HI\7C\2\2IJ\7V\2\2J\f\3\2\2\2KL\7f\2\2LM"+
		"\7q\2\2MN\7w\2\2NO\7d\2\2OP\7n\2\2PQ\7g\2\2Q\16\3\2\2\2RS\7e\2\2ST\7j"+
		"\2\2TU\7c\2\2UV\7t\2\2V\20\3\2\2\2WX\7u\2\2XY\7v\2\2YZ\7t\2\2Z[\7k\2\2"+
		"[\\\7p\2\2\\]\7i\2\2]\22\3\2\2\2^_\7d\2\2_`\7q\2\2`a\7q\2\2ab\7n\2\2b"+
		"\24\3\2\2\2cd\t\2\2\2d\26\3\2\2\2ef\t\3\2\2f\30\3\2\2\2gh\t\4\2\2h\32"+
		"\3\2\2\2ij\t\5\2\2j\34\3\2\2\2kl\t\6\2\2l\36\3\2\2\2mn\t\7\2\2n \3\2\2"+
		"\2op\t\b\2\2p\"\3\2\2\2qr\7k\2\2rs\7h\2\2s$\3\2\2\2tu\7g\2\2uv\7n\2\2"+
		"vw\7u\2\2wx\7g\2\2x&\3\2\2\2y{\t\t\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|"+
		"}\3\2\2\2}(\3\2\2\2~\u0080\t\n\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082*\3\2\2\2\u0083\u0085\t\13\2\2\u0084"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087,\3\2\2\2\u0088\u0089\t\f\2\2\u0089.\3\2\2\2\u008a\u008b\t\r"+
		"\2\2\u008b\60\3\2\2\2\6\2|\u0081\u0086";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}