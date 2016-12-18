// Generated from C:\Users\erikson\Desktop\MiniCSharp\antl\miniCsharp.g4 by ANTLR 4.1
package compiler.miniCSharp.com;
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
		MAIN=1, READ=2, WHITE=3, INT=4, FLOAT=5, DOUBLE=6, STRING=7, BOOL=8, IF=9, 
		ELSE=10, CHAR=11, B=12, NUMF=13, NUMI=14, VAR=15, SOMA=16, SUB=17, DIV=18, 
		MULT=19, REST=20, E=21, OU=22, CHA=23, CHF=24, PAA=25, PAF=26, EDL=27, 
		EQL=28, EQLEQL=29, DIF=30, MAI=31, MEN=32, MENEQL=33, MAIEQL=34, NEG=35, 
		ACR=36, DEC=37, ACRMORE=38, DECMORE=39, SEP=40, CARACTER=41, TEXTO=42, 
		WS=43;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'Main'", "'read'", "'white'", "'int'", "'float'", "'double'", "'string'", 
		"'bool'", "'if'", "'else'", "'char'", "B", "NUMF", "NUMI", "VAR", "'+'", 
		"'-'", "'/'", "'*'", "'%'", "'&&'", "'||'", "'{'", "'}'", "'('", "')'", 
		"';'", "'='", "'=='", "'!='", "'>'", "'<'", "'<='", "'>='", "'!'", "'++'", 
		"'--'", "'+='", "'-='", "','", "CARACTER", "TEXTO", "WS"
	};
	public static final String[] ruleNames = {
		"MAIN", "READ", "WHITE", "INT", "FLOAT", "DOUBLE", "STRING", "BOOL", "IF", 
		"ELSE", "CHAR", "B", "NUMF", "NUMI", "VAR", "SOMA", "SUB", "DIV", "MULT", 
		"REST", "E", "OU", "CHA", "CHF", "PAA", "PAF", "EDL", "EQL", "EQLEQL", 
		"DIF", "MAI", "MEN", "MENEQL", "MAIEQL", "NEG", "ACR", "DEC", "ACRMORE", 
		"DECMORE", "SEP", "CARACTER", "TEXTO", "WS"
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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 42: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2-\u011b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r"+
		"\u009d\n\r\3\16\6\16\u00a0\n\16\r\16\16\16\u00a1\3\16\5\16\u00a5\n\16"+
		"\3\16\6\16\u00a8\n\16\r\16\16\16\u00a9\3\16\7\16\u00ad\n\16\f\16\16\16"+
		"\u00b0\13\16\5\16\u00b2\n\16\3\17\6\17\u00b5\n\17\r\17\16\17\u00b6\3\20"+
		"\5\20\u00ba\n\20\3\20\7\20\u00bd\n\20\f\20\16\20\u00c0\13\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3%\3"+
		"&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3*\3*\5*\u0102\n*\3*\3*\3+\3"+
		"+\3+\3+\7+\u010a\n+\f+\16+\u010d\13+\3+\3+\3,\3,\5,\u0113\n,\3,\6,\u0116"+
		"\n,\r,\16,\u0117\3,\3,\2-\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1"+
		"\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23"+
		"\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35"+
		"\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W"+
		"-\2\3\2\t\3\2\62;\3\2\60\60\5\2C\\aac|\6\2\62;C\\aac|\3\2))\3\2$$\4\2"+
		"\13\13\"\"\u0128\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5^\3\2\2\2\7c\3\2\2\2"+
		"\ti\3\2\2\2\13m\3\2\2\2\rs\3\2\2\2\17z\3\2\2\2\21\u0081\3\2\2\2\23\u0086"+
		"\3\2\2\2\25\u0089\3\2\2\2\27\u008e\3\2\2\2\31\u009c\3\2\2\2\33\u009f\3"+
		"\2\2\2\35\u00b4\3\2\2\2\37\u00b9\3\2\2\2!\u00c1\3\2\2\2#\u00c3\3\2\2\2"+
		"%\u00c5\3\2\2\2\'\u00c7\3\2\2\2)\u00c9\3\2\2\2+\u00cb\3\2\2\2-\u00ce\3"+
		"\2\2\2/\u00d1\3\2\2\2\61\u00d3\3\2\2\2\63\u00d5\3\2\2\2\65\u00d7\3\2\2"+
		"\2\67\u00d9\3\2\2\29\u00db\3\2\2\2;\u00dd\3\2\2\2=\u00e0\3\2\2\2?\u00e3"+
		"\3\2\2\2A\u00e5\3\2\2\2C\u00e7\3\2\2\2E\u00ea\3\2\2\2G\u00ed\3\2\2\2I"+
		"\u00ef\3\2\2\2K\u00f2\3\2\2\2M\u00f5\3\2\2\2O\u00f8\3\2\2\2Q\u00fb\3\2"+
		"\2\2S\u00fd\3\2\2\2U\u0105\3\2\2\2W\u0115\3\2\2\2YZ\7O\2\2Z[\7c\2\2[\\"+
		"\7k\2\2\\]\7p\2\2]\4\3\2\2\2^_\7t\2\2_`\7g\2\2`a\7c\2\2ab\7f\2\2b\6\3"+
		"\2\2\2cd\7y\2\2de\7j\2\2ef\7k\2\2fg\7v\2\2gh\7g\2\2h\b\3\2\2\2ij\7k\2"+
		"\2jk\7p\2\2kl\7v\2\2l\n\3\2\2\2mn\7h\2\2no\7n\2\2op\7q\2\2pq\7c\2\2qr"+
		"\7v\2\2r\f\3\2\2\2st\7f\2\2tu\7q\2\2uv\7w\2\2vw\7d\2\2wx\7n\2\2xy\7g\2"+
		"\2y\16\3\2\2\2z{\7u\2\2{|\7v\2\2|}\7t\2\2}~\7k\2\2~\177\7p\2\2\177\u0080"+
		"\7i\2\2\u0080\20\3\2\2\2\u0081\u0082\7d\2\2\u0082\u0083\7q\2\2\u0083\u0084"+
		"\7q\2\2\u0084\u0085\7n\2\2\u0085\22\3\2\2\2\u0086\u0087\7k\2\2\u0087\u0088"+
		"\7h\2\2\u0088\24\3\2\2\2\u0089\u008a\7g\2\2\u008a\u008b\7n\2\2\u008b\u008c"+
		"\7u\2\2\u008c\u008d\7g\2\2\u008d\26\3\2\2\2\u008e\u008f\7e\2\2\u008f\u0090"+
		"\7j\2\2\u0090\u0091\7c\2\2\u0091\u0092\7t\2\2\u0092\30\3\2\2\2\u0093\u0094"+
		"\7v\2\2\u0094\u0095\7t\2\2\u0095\u0096\7w\2\2\u0096\u009d\7g\2\2\u0097"+
		"\u0098\7h\2\2\u0098\u0099\7c\2\2\u0099\u009a\7n\2\2\u009a\u009b\7u\2\2"+
		"\u009b\u009d\7g\2\2\u009c\u0093\3\2\2\2\u009c\u0097\3\2\2\2\u009d\32\3"+
		"\2\2\2\u009e\u00a0\t\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00b1\3\2\2\2\u00a3\u00a5\t\3"+
		"\2\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6"+
		"\u00a8\t\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2"+
		"\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00b2\3\2\2\2\u00ab\u00ad\t\2\2\2\u00ac"+
		"\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00a4\3\2\2\2\u00b1"+
		"\u00ae\3\2\2\2\u00b2\34\3\2\2\2\u00b3\u00b5\t\2\2\2\u00b4\u00b3\3\2\2"+
		"\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\36"+
		"\3\2\2\2\u00b8\u00ba\t\4\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00be\3\2\2\2\u00bb"+
		"\u00bd\t\5\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf \3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2"+
		"\7-\2\2\u00c2\"\3\2\2\2\u00c3\u00c4\7/\2\2\u00c4$\3\2\2\2\u00c5\u00c6"+
		"\7\61\2\2\u00c6&\3\2\2\2\u00c7\u00c8\7,\2\2\u00c8(\3\2\2\2\u00c9\u00ca"+
		"\7\'\2\2\u00ca*\3\2\2\2\u00cb\u00cc\7(\2\2\u00cc\u00cd\7(\2\2\u00cd,\3"+
		"\2\2\2\u00ce\u00cf\7~\2\2\u00cf\u00d0\7~\2\2\u00d0.\3\2\2\2\u00d1\u00d2"+
		"\7}\2\2\u00d2\60\3\2\2\2\u00d3\u00d4\7\177\2\2\u00d4\62\3\2\2\2\u00d5"+
		"\u00d6\7*\2\2\u00d6\64\3\2\2\2\u00d7\u00d8\7+\2\2\u00d8\66\3\2\2\2\u00d9"+
		"\u00da\7=\2\2\u00da8\3\2\2\2\u00db\u00dc\7?\2\2\u00dc:\3\2\2\2\u00dd\u00de"+
		"\7?\2\2\u00de\u00df\7?\2\2\u00df<\3\2\2\2\u00e0\u00e1\7#\2\2\u00e1\u00e2"+
		"\7?\2\2\u00e2>\3\2\2\2\u00e3\u00e4\7@\2\2\u00e4@\3\2\2\2\u00e5\u00e6\7"+
		">\2\2\u00e6B\3\2\2\2\u00e7\u00e8\7>\2\2\u00e8\u00e9\7?\2\2\u00e9D\3\2"+
		"\2\2\u00ea\u00eb\7@\2\2\u00eb\u00ec\7?\2\2\u00ecF\3\2\2\2\u00ed\u00ee"+
		"\7#\2\2\u00eeH\3\2\2\2\u00ef\u00f0\7-\2\2\u00f0\u00f1\7-\2\2\u00f1J\3"+
		"\2\2\2\u00f2\u00f3\7/\2\2\u00f3\u00f4\7/\2\2\u00f4L\3\2\2\2\u00f5\u00f6"+
		"\7-\2\2\u00f6\u00f7\7?\2\2\u00f7N\3\2\2\2\u00f8\u00f9\7/\2\2\u00f9\u00fa"+
		"\7?\2\2\u00faP\3\2\2\2\u00fb\u00fc\7.\2\2\u00fcR\3\2\2\2\u00fd\u0101\t"+
		"\6\2\2\u00fe\u00ff\7$\2\2\u00ff\u0102\7$\2\2\u0100\u0102\n\7\2\2\u0101"+
		"\u00fe\3\2\2\2\u0101\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\t\6"+
		"\2\2\u0104T\3\2\2\2\u0105\u010b\7$\2\2\u0106\u0107\7$\2\2\u0107\u010a"+
		"\7$\2\2\u0108\u010a\n\7\2\2\u0109\u0106\3\2\2\2\u0109\u0108\3\2\2\2\u010a"+
		"\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2"+
		"\2\2\u010d\u010b\3\2\2\2\u010e\u010f\7$\2\2\u010fV\3\2\2\2\u0110\u0116"+
		"\t\b\2\2\u0111\u0113\7\17\2\2\u0112\u0111\3\2\2\2\u0112\u0113\3\2\2\2"+
		"\u0113\u0114\3\2\2\2\u0114\u0116\7\f\2\2\u0115\u0110\3\2\2\2\u0115\u0112"+
		"\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\u011a\b,\2\2\u011aX\3\2\2\2\23\2\u009c\u00a1\u00a4"+
		"\u00a9\u00ae\u00b1\u00b6\u00b9\u00bc\u00be\u0101\u0109\u010b\u0112\u0115"+
		"\u0117";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}