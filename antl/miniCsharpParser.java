// Generated from D:\Documentos\github\MiniCSharp\antl\miniCsharp.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class miniCsharpParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAIN=1, READ=2, WHITE=3, INT=4, FLOAT=5, DOUBLE=6, CHAR=7, STRING=8, BOOL=9, 
		SOMA=10, SUB=11, DIV=12, MULT=13, REST=14, E=15, OU=16, IF=17, ELSE=18, 
		VAR=19, TEXTO=20, NUM=21, SEP=22, EOL=23;
	public static final String[] tokenNames = {
		"<INVALID>", "'Main'", "'read'", "'white'", "'int'", "'FLOAT'", "'double'", 
		"'char'", "'string'", "'bool'", "SOMA", "SUB", "DIV", "MULT", "REST", 
		"E", "OU", "'if'", "'else'", "VAR", "TEXTO", "NUM", "SEP", "EOL"
	};
	public static final int
		RULE_mcSHARP = 0, RULE_codigo = 1, RULE_cmd = 2, RULE_ler = 3, RULE_escrever = 4, 
		RULE_inteiro = 5, RULE_ptflut = 6, RULE_dptflut = 7, RULE_char = 8, RULE_string = 9, 
		RULE_bool = 10, RULE_op = 11, RULE_opl = 12, RULE_cf = 13, RULE_texto = 14, 
		RULE_num = 15;
	public static final String[] ruleNames = {
		"mcSHARP", "codigo", "cmd", "ler", "escrever", "inteiro", "ptflut", "dptflut", 
		"char", "string", "bool", "op", "opl", "cf", "texto", "num"
	};

	@Override
	public String getGrammarFileName() { return "miniCsharp.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public miniCsharpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class McSHARPContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(miniCsharpParser.MAIN, 0); }
		public McSHARPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mcSHARP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).enterMcSHARP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).exitMcSHARP(this);
		}
	}

	public final McSHARPContext mcSHARP() throws RecognitionException {
		McSHARPContext _localctx = new McSHARPContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mcSHARP);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32); match(MAIN);
			codigo
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

	public static class CodigoContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(miniCsharpParser.EOL, 0); }
		public CodigoContext codigo() {
			return getRuleContext(CodigoContext.class,0);
		}
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public CodigoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codigo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).enterCodigo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).exitCodigo(this);
		}
	}

	public final CodigoContext codigo() throws RecognitionException {
		CodigoContext _localctx = new CodigoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_codigo);
		try {
			setState(40);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35); cmd();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36); cmd();
				setState(37); match(EOL);
				setState(38); codigo();
				}
				break;
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

	public static class CmdContext extends ParserRuleContext {
		public DptflutContext dptflut() {
			return getRuleContext(DptflutContext.class,0);
		}
		public InteiroContext inteiro() {
			return getRuleContext(InteiroContext.class,0);
		}
		public CfContext cf() {
			return getRuleContext(CfContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public LerContext ler() {
			return getRuleContext(LerContext.class,0);
		}
		public OplContext opl() {
			return getRuleContext(OplContext.class,0);
		}
		public CharContext char() {
			return getRuleContext(CharContext.class,0);
		}
		public PtflutContext ptflut() {
			return getRuleContext(PtflutContext.class,0);
		}
		public EscreverContext escrever() {
			return getRuleContext(EscreverContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cmd);
		try {
			setState(53);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42); ler();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43); escrever();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(44); inteiro();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(45); ptflut();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(46); dptflut();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(47); char();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(48); string();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(49); bool();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(50); op();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(51); opl();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(52); cf();
				}
				break;
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

	public static class LerContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(miniCsharpParser.VAR, 0); }
		public TerminalNode READ() { return getToken(miniCsharpParser.READ, 0); }
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public LerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).enterLer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).exitLer(this);
		}
	}

	public final LerContext ler() throws RecognitionException {
		LerContext _localctx = new LerContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ler);
		try {
			setState(61);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55); match(READ);
				{
				setState(56); num();
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57); match(READ);
				{
				setState(58); texto();
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59); match(READ);
				{
				setState(60); match(VAR);
				}
				}
				break;
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

	public static class EscreverContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(miniCsharpParser.VAR, 0); }
		public TerminalNode WHITE() { return getToken(miniCsharpParser.WHITE, 0); }
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public EscreverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escrever; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).enterEscrever(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).exitEscrever(this);
		}
	}

	public final EscreverContext escrever() throws RecognitionException {
		EscreverContext _localctx = new EscreverContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_escrever);
		try {
			setState(69);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63); match(WHITE);
				{
				setState(64); num();
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65); match(WHITE);
				{
				setState(66); texto();
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(67); match(WHITE);
				{
				setState(68); match(VAR);
				}
				}
				break;
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

	public static class InteiroContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(miniCsharpParser.INT, 0); }
		public TerminalNode VAR() { return getToken(miniCsharpParser.VAR, 0); }
		public InteiroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inteiro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).enterInteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).exitInteiro(this);
		}
	}

	public final InteiroContext inteiro() throws RecognitionException {
		InteiroContext _localctx = new InteiroContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_inteiro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); match(INT);
			setState(72); match(VAR);
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

	public static class PtflutContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(miniCsharpParser.FLOAT, 0); }
		public TerminalNode VAR() { return getToken(miniCsharpParser.VAR, 0); }
		public PtflutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptflut; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).enterPtflut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).exitPtflut(this);
		}
	}

	public final PtflutContext ptflut() throws RecognitionException {
		PtflutContext _localctx = new PtflutContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ptflut);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); match(FLOAT);
			setState(75); match(VAR);
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

	public static class DptflutContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(miniCsharpParser.VAR, 0); }
		public TerminalNode DOUBLE() { return getToken(miniCsharpParser.DOUBLE, 0); }
		public DptflutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dptflut; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).enterDptflut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).exitDptflut(this);
		}
	}

	public final DptflutContext dptflut() throws RecognitionException {
		DptflutContext _localctx = new DptflutContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dptflut);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); match(DOUBLE);
			setState(78); match(VAR);
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

	public static class CharContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(miniCsharpParser.VAR, 0); }
		public TerminalNode CHAR() { return getToken(miniCsharpParser.CHAR, 0); }
		public CharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).enterChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).exitChar(this);
		}
	}

	public final CharContext char() throws RecognitionException {
		CharContext _localctx = new CharContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); match(CHAR);
			setState(81); match(VAR);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(miniCsharpParser.VAR, 0); }
		public TerminalNode STRING() { return getToken(miniCsharpParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); match(STRING);
			setState(84); match(VAR);
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(miniCsharpParser.BOOL, 0); }
		public TerminalNode VAR() { return getToken(miniCsharpParser.VAR, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(BOOL);
			setState(87); match(VAR);
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

	public static class OpContext extends ParserRuleContext {
		public TerminalNode VAR(int i) {
			return getToken(miniCsharpParser.VAR, i);
		}
		public TerminalNode DIV() { return getToken(miniCsharpParser.DIV, 0); }
		public TerminalNode MULT() { return getToken(miniCsharpParser.MULT, 0); }
		public TerminalNode REST() { return getToken(miniCsharpParser.REST, 0); }
		public List<TerminalNode> VAR() { return getTokens(miniCsharpParser.VAR); }
		public TerminalNode SOMA() { return getToken(miniCsharpParser.SOMA, 0); }
		public TerminalNode SUB() { return getToken(miniCsharpParser.SUB, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_op);
		try {
			setState(104);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89); match(VAR);
				setState(90); match(SOMA);
				setState(91); match(VAR);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92); match(VAR);
				setState(93); match(SUB);
				setState(94); match(VAR);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95); match(VAR);
				setState(96); match(DIV);
				setState(97); match(VAR);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(98); match(VAR);
				setState(99); match(MULT);
				setState(100); match(VAR);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(101); match(VAR);
				setState(102); match(REST);
				setState(103); match(VAR);
				}
				break;
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

	public static class OplContext extends ParserRuleContext {
		public TerminalNode VAR(int i) {
			return getToken(miniCsharpParser.VAR, i);
		}
		public TerminalNode OU() { return getToken(miniCsharpParser.OU, 0); }
		public List<TerminalNode> VAR() { return getTokens(miniCsharpParser.VAR); }
		public TerminalNode E() { return getToken(miniCsharpParser.E, 0); }
		public OplContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).enterOpl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).exitOpl(this);
		}
	}

	public final OplContext opl() throws RecognitionException {
		OplContext _localctx = new OplContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_opl);
		try {
			setState(112);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106); match(VAR);
				setState(107); match(E);
				setState(108); match(VAR);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109); match(VAR);
				setState(110); match(OU);
				setState(111); match(VAR);
				}
				break;
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

	public static class CfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(miniCsharpParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(miniCsharpParser.ELSE, 0); }
		public OplContext opl() {
			return getRuleContext(OplContext.class,0);
		}
		public CfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).enterCf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).exitCf(this);
		}
	}

	public final CfContext cf() throws RecognitionException {
		CfContext _localctx = new CfContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cf);
		try {
			setState(124);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114); match(IF);
				{
				setState(115); opl();
				}
				codigo
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118); match(IF);
				{
				setState(119); opl();
				}
				codigo
				setState(121); match(ELSE);
				codigo
				}
				break;
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

	public static class TextoContext extends ParserRuleContext {
		public TerminalNode TEXTO() { return getToken(miniCsharpParser.TEXTO, 0); }
		public TextoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).enterTexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).exitTexto(this);
		}
	}

	public final TextoContext texto() throws RecognitionException {
		TextoContext _localctx = new TextoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_texto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); match(TEXTO);
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

	public static class NumContext extends ParserRuleContext {
		public TerminalNode NUM(int i) {
			return getToken(miniCsharpParser.NUM, i);
		}
		public TerminalNode SEP() { return getToken(miniCsharpParser.SEP, 0); }
		public List<TerminalNode> NUM() { return getTokens(miniCsharpParser.NUM); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).exitNum(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_num);
		try {
			setState(132);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128); match(NUM);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129); match(NUM);
				setState(130); match(SEP);
				setState(131); match(NUM);
				}
				break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\31\u0089\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\5\3+\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\48\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5@\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6H\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\5\rk\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16s\n\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\177\n\17\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\5\21\u0087\n\21\3\21\2\22\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \2\2\u008e\2\"\3\2\2\2\4*\3\2\2\2\6\67\3\2\2\2\b?\3\2\2\2\n"+
		"G\3\2\2\2\fI\3\2\2\2\16L\3\2\2\2\20O\3\2\2\2\22R\3\2\2\2\24U\3\2\2\2\26"+
		"X\3\2\2\2\30j\3\2\2\2\32r\3\2\2\2\34~\3\2\2\2\36\u0080\3\2\2\2 \u0086"+
		"\3\2\2\2\"#\7\3\2\2#$\b\2\1\2$\3\3\2\2\2%+\5\6\4\2&\'\5\6\4\2\'(\7\31"+
		"\2\2()\5\4\3\2)+\3\2\2\2*%\3\2\2\2*&\3\2\2\2+\5\3\2\2\2,8\5\b\5\2-8\5"+
		"\n\6\2.8\5\f\7\2/8\5\16\b\2\608\5\20\t\2\618\5\22\n\2\628\5\24\13\2\63"+
		"8\5\26\f\2\648\5\30\r\2\658\5\32\16\2\668\5\34\17\2\67,\3\2\2\2\67-\3"+
		"\2\2\2\67.\3\2\2\2\67/\3\2\2\2\67\60\3\2\2\2\67\61\3\2\2\2\67\62\3\2\2"+
		"\2\67\63\3\2\2\2\67\64\3\2\2\2\67\65\3\2\2\2\67\66\3\2\2\28\7\3\2\2\2"+
		"9:\7\4\2\2:@\5 \21\2;<\7\4\2\2<@\5\36\20\2=>\7\4\2\2>@\7\25\2\2?9\3\2"+
		"\2\2?;\3\2\2\2?=\3\2\2\2@\t\3\2\2\2AB\7\5\2\2BH\5 \21\2CD\7\5\2\2DH\5"+
		"\36\20\2EF\7\5\2\2FH\7\25\2\2GA\3\2\2\2GC\3\2\2\2GE\3\2\2\2H\13\3\2\2"+
		"\2IJ\7\6\2\2JK\7\25\2\2K\r\3\2\2\2LM\7\7\2\2MN\7\25\2\2N\17\3\2\2\2OP"+
		"\7\b\2\2PQ\7\25\2\2Q\21\3\2\2\2RS\7\t\2\2ST\7\25\2\2T\23\3\2\2\2UV\7\n"+
		"\2\2VW\7\25\2\2W\25\3\2\2\2XY\7\13\2\2YZ\7\25\2\2Z\27\3\2\2\2[\\\7\25"+
		"\2\2\\]\7\f\2\2]k\7\25\2\2^_\7\25\2\2_`\7\r\2\2`k\7\25\2\2ab\7\25\2\2"+
		"bc\7\16\2\2ck\7\25\2\2de\7\25\2\2ef\7\17\2\2fk\7\25\2\2gh\7\25\2\2hi\7"+
		"\20\2\2ik\7\25\2\2j[\3\2\2\2j^\3\2\2\2ja\3\2\2\2jd\3\2\2\2jg\3\2\2\2k"+
		"\31\3\2\2\2lm\7\25\2\2mn\7\21\2\2ns\7\25\2\2op\7\25\2\2pq\7\22\2\2qs\7"+
		"\25\2\2rl\3\2\2\2ro\3\2\2\2s\33\3\2\2\2tu\7\23\2\2uv\5\32\16\2vw\b\17"+
		"\1\2w\177\3\2\2\2xy\7\23\2\2yz\5\32\16\2z{\b\17\1\2{|\7\24\2\2|}\b\17"+
		"\1\2}\177\3\2\2\2~t\3\2\2\2~x\3\2\2\2\177\35\3\2\2\2\u0080\u0081\7\26"+
		"\2\2\u0081\37\3\2\2\2\u0082\u0087\7\27\2\2\u0083\u0084\7\27\2\2\u0084"+
		"\u0085\7\30\2\2\u0085\u0087\7\27\2\2\u0086\u0082\3\2\2\2\u0086\u0083\3"+
		"\2\2\2\u0087!\3\2\2\2\n*\67?Gjr~\u0086";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}