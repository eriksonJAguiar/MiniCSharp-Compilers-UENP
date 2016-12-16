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
		MAIN=1, READ=2, WHITE=3, INT=4, FLOAT=5, DOUBLE=6, STRING=7, BOOL=8, NUM=9, 
		VAR=10, SOMA=11, SUB=12, DIV=13, MULT=14, REST=15, E=16, OU=17, IF=18, 
		ELSE=19, CHA=20, CHF=21, PAA=22, PAF=23, EDL=24, EQL=25, EQLEQL=26, DIF=27, 
		MAI=28, MEN=29, MENEQL=30, MAIEQL=31, ACR=32, DEC=33, TEXTO=34, SEP=35, 
		EOL=36;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'Main'", "'read'", "'white'", "'int'", "'float'", "'double'", "'string'", 
		"'bool'", "NUM", "VAR", "'+'", "'-'", "'/'", "'*'", "'%'", "'&&'", "'||'", 
		"'if'", "'else'", "'{'", "'}'", "'('", "')'", "';'", "'='", "'=='", "'!='", 
		"'>'", "'<'", "'<='", "'>='", "'++'", "'--'", "TEXTO", "','", "EOL"
	};
	public static final String[] ruleNames = {
		"MAIN", "READ", "WHITE", "INT", "FLOAT", "DOUBLE", "STRING", "BOOL", "NUM", 
		"VAR", "SOMA", "SUB", "DIV", "MULT", "REST", "E", "OU", "IF", "ELSE", 
		"CHA", "CHF", "PAA", "PAF", "EDL", "EQL", "EQLEQL", "DIF", "MAI", "MEN", 
		"MENEQL", "MAIEQL", "ACR", "DEC", "TEXTO", "SEP", "EOL"
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2&\u00c8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\6\nz\n\n\r\n\16\n{\3\13\6\13\177\n\13\r\13\16\13\u0080\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\6#\u00be\n#\r#\16"+
		"#\u00bf\3$\3$\3%\6%\u00c5\n%\r%\16%\u00c6\2&\3\3\1\5\4\1\7\5\1\t\6\1\13"+
		"\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1"+
		"\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33"+
		"\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1\3\2\6\3\2"+
		"\62;\5\2C\\aac|\5\2\61\61YYyy\5\2\13\f^^uu\u00cb\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2"+
		"\2\5P\3\2\2\2\7U\3\2\2\2\t[\3\2\2\2\13_\3\2\2\2\re\3\2\2\2\17l\3\2\2\2"+
		"\21s\3\2\2\2\23y\3\2\2\2\25~\3\2\2\2\27\u0082\3\2\2\2\31\u0084\3\2\2\2"+
		"\33\u0086\3\2\2\2\35\u0088\3\2\2\2\37\u008a\3\2\2\2!\u008c\3\2\2\2#\u008f"+
		"\3\2\2\2%\u0092\3\2\2\2\'\u0095\3\2\2\2)\u009a\3\2\2\2+\u009c\3\2\2\2"+
		"-\u009e\3\2\2\2/\u00a0\3\2\2\2\61\u00a2\3\2\2\2\63\u00a4\3\2\2\2\65\u00a6"+
		"\3\2\2\2\67\u00a9\3\2\2\29\u00ac\3\2\2\2;\u00ae\3\2\2\2=\u00b0\3\2\2\2"+
		"?\u00b3\3\2\2\2A\u00b6\3\2\2\2C\u00b9\3\2\2\2E\u00bd\3\2\2\2G\u00c1\3"+
		"\2\2\2I\u00c4\3\2\2\2KL\7O\2\2LM\7c\2\2MN\7k\2\2NO\7p\2\2O\4\3\2\2\2P"+
		"Q\7t\2\2QR\7g\2\2RS\7c\2\2ST\7f\2\2T\6\3\2\2\2UV\7y\2\2VW\7j\2\2WX\7k"+
		"\2\2XY\7v\2\2YZ\7g\2\2Z\b\3\2\2\2[\\\7k\2\2\\]\7p\2\2]^\7v\2\2^\n\3\2"+
		"\2\2_`\7h\2\2`a\7n\2\2ab\7q\2\2bc\7c\2\2cd\7v\2\2d\f\3\2\2\2ef\7f\2\2"+
		"fg\7q\2\2gh\7w\2\2hi\7d\2\2ij\7n\2\2jk\7g\2\2k\16\3\2\2\2lm\7u\2\2mn\7"+
		"v\2\2no\7t\2\2op\7k\2\2pq\7p\2\2qr\7i\2\2r\20\3\2\2\2st\7d\2\2tu\7q\2"+
		"\2uv\7q\2\2vw\7n\2\2w\22\3\2\2\2xz\t\2\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2"+
		"\2{|\3\2\2\2|\24\3\2\2\2}\177\t\3\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\26\3\2\2\2\u0082\u0083\7-\2\2\u0083"+
		"\30\3\2\2\2\u0084\u0085\7/\2\2\u0085\32\3\2\2\2\u0086\u0087\7\61\2\2\u0087"+
		"\34\3\2\2\2\u0088\u0089\7,\2\2\u0089\36\3\2\2\2\u008a\u008b\7\'\2\2\u008b"+
		" \3\2\2\2\u008c\u008d\7(\2\2\u008d\u008e\7(\2\2\u008e\"\3\2\2\2\u008f"+
		"\u0090\7~\2\2\u0090\u0091\7~\2\2\u0091$\3\2\2\2\u0092\u0093\7k\2\2\u0093"+
		"\u0094\7h\2\2\u0094&\3\2\2\2\u0095\u0096\7g\2\2\u0096\u0097\7n\2\2\u0097"+
		"\u0098\7u\2\2\u0098\u0099\7g\2\2\u0099(\3\2\2\2\u009a\u009b\7}\2\2\u009b"+
		"*\3\2\2\2\u009c\u009d\7\177\2\2\u009d,\3\2\2\2\u009e\u009f\7*\2\2\u009f"+
		".\3\2\2\2\u00a0\u00a1\7+\2\2\u00a1\60\3\2\2\2\u00a2\u00a3\7=\2\2\u00a3"+
		"\62\3\2\2\2\u00a4\u00a5\7?\2\2\u00a5\64\3\2\2\2\u00a6\u00a7\7?\2\2\u00a7"+
		"\u00a8\7?\2\2\u00a8\66\3\2\2\2\u00a9\u00aa\7#\2\2\u00aa\u00ab\7?\2\2\u00ab"+
		"8\3\2\2\2\u00ac\u00ad\7@\2\2\u00ad:\3\2\2\2\u00ae\u00af\7>\2\2\u00af<"+
		"\3\2\2\2\u00b0\u00b1\7>\2\2\u00b1\u00b2\7?\2\2\u00b2>\3\2\2\2\u00b3\u00b4"+
		"\7@\2\2\u00b4\u00b5\7?\2\2\u00b5@\3\2\2\2\u00b6\u00b7\7-\2\2\u00b7\u00b8"+
		"\7-\2\2\u00b8B\3\2\2\2\u00b9\u00ba\7/\2\2\u00ba\u00bb\7/\2\2\u00bbD\3"+
		"\2\2\2\u00bc\u00be\t\4\2\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0F\3\2\2\2\u00c1\u00c2\7.\2\2\u00c2"+
		"H\3\2\2\2\u00c3\u00c5\t\5\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2"+
		"\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7J\3\2\2\2\7\2{\u0080\u00bf"+
		"\u00c6";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}