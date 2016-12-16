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
		MAIN=1, READ=2, WHITE=3, INT=4, FLOAT=5, DOUBLE=6, STRING=7, BOOL=8, NUM=9, 
		VAR=10, SOMA=11, SUB=12, DIV=13, MULT=14, REST=15, E=16, OU=17, IF=18, 
		ELSE=19, CHA=20, CHF=21, PAA=22, PAF=23, EDL=24, EQL=25, EQLEQL=26, DIF=27, 
		MAI=28, MEN=29, MENEQL=30, MAIEQL=31, ACR=32, DEC=33, TEXTO=34, SEP=35, 
		EOL=36;
	public static final String[] tokenNames = {
		"<INVALID>", "'Main'", "'read'", "'white'", "'int'", "'float'", "'double'", 
		"'string'", "'bool'", "NUM", "VAR", "'+'", "'-'", "'/'", "'*'", "'%'", 
		"'&&'", "'||'", "'if'", "'else'", "'{'", "'}'", "'('", "')'", "';'", "'='", 
		"'=='", "'!='", "'>'", "'<'", "'<='", "'>='", "'++'", "'--'", "TEXTO", 
		"','", "EOL"
	};
	public static final int
		RULE_mcSHARP = 0, RULE_codigo = 1, RULE_cmd = 2, RULE_declaracao = 3, 
		RULE_ler = 4, RULE_escrever = 5, RULE_inteiro = 6, RULE_ptflut = 7, RULE_dptflut = 8, 
		RULE_string = 9, RULE_bool = 10, RULE_op = 11, RULE_atr = 12, RULE_opl = 13, 
		RULE_cmp = 14, RULE_cf = 15, RULE_texto = 16, RULE_num = 17;
	public static final String[] ruleNames = {
		"mcSHARP", "codigo", "cmd", "declaracao", "ler", "escrever", "inteiro", 
		"ptflut", "dptflut", "string", "bool", "op", "atr", "opl", "cmp", "cf", 
		"texto", "num"
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
		public CodigoContext codigo() {
			return getRuleContext(CodigoContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCsharpVisitor ) return ((miniCsharpVisitor<? extends T>)visitor).visitMcSHARP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final McSHARPContext mcSHARP() throws RecognitionException {
		McSHARPContext _localctx = new McSHARPContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mcSHARP);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36); match(MAIN);
			setState(37); match(CHA);
			setState(38); codigo();
			setState(39); match(CHF);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCsharpVisitor ) return ((miniCsharpVisitor<? extends T>)visitor).visitCodigo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodigoContext codigo() throws RecognitionException {
		CodigoContext _localctx = new CodigoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_codigo);
		try {
			setState(49);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41); cmd();
				setState(42); match(EDL);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44); cmd();
				setState(45); match(EDL);
				setState(46); match(EOL);
				setState(47); codigo();
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
		public CfContext cf() {
			return getRuleContext(CfContext.class,0);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public LerContext ler() {
			return getRuleContext(LerContext.class,0);
		}
		public AtrContext atr() {
			return getRuleContext(AtrContext.class,0);
		}
		public OplContext opl() {
			return getRuleContext(OplContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCsharpVisitor ) return ((miniCsharpVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cmd);
		try {
			setState(58);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51); ler();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52); escrever();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(53); declaracao();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(54); op();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(55); opl();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(56); cf();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(57); atr();
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

	public static class DeclaracaoContext extends ParserRuleContext {
		public DptflutContext dptflut() {
			return getRuleContext(DptflutContext.class,0);
		}
		public InteiroContext inteiro() {
			return getRuleContext(InteiroContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public PtflutContext ptflut() {
			return getRuleContext(PtflutContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).exitDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCsharpVisitor ) return ((miniCsharpVisitor<? extends T>)visitor).visitDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao);
		try {
			setState(66);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61); inteiro();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62); ptflut();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(63); dptflut();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(64); string();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(65); bool();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCsharpVisitor ) return ((miniCsharpVisitor<? extends T>)visitor).visitLer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LerContext ler() throws RecognitionException {
		LerContext _localctx = new LerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ler);
		try {
			setState(82);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68); match(READ);
				setState(69); match(PAA);
				setState(70); num();
				setState(71); match(PAF);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73); match(READ);
				setState(74); match(PAA);
				setState(75); texto();
				setState(76); match(PAF);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(78); match(READ);
				setState(79); match(PAA);
				setState(80); match(VAR);
				setState(81); match(PAF);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCsharpVisitor ) return ((miniCsharpVisitor<? extends T>)visitor).visitEscrever(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscreverContext escrever() throws RecognitionException {
		EscreverContext _localctx = new EscreverContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_escrever);
		try {
			setState(98);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84); match(WHITE);
				setState(85); match(PAA);
				setState(86); num();
				setState(87); match(PAF);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89); match(WHITE);
				setState(90); match(PAA);
				setState(91); texto();
				setState(92); match(PAF);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94); match(WHITE);
				setState(95); match(PAA);
				setState(96); match(VAR);
				setState(97); match(PAF);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCsharpVisitor ) return ((miniCsharpVisitor<? extends T>)visitor).visitInteiro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InteiroContext inteiro() throws RecognitionException {
		InteiroContext _localctx = new InteiroContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_inteiro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100); match(INT);
			setState(101); match(VAR);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCsharpVisitor ) return ((miniCsharpVisitor<? extends T>)visitor).visitPtflut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PtflutContext ptflut() throws RecognitionException {
		PtflutContext _localctx = new PtflutContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ptflut);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); match(FLOAT);
			setState(104); match(VAR);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCsharpVisitor ) return ((miniCsharpVisitor<? extends T>)visitor).visitDptflut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DptflutContext dptflut() throws RecognitionException {
		DptflutContext _localctx = new DptflutContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dptflut);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); match(DOUBLE);
			setState(107); match(VAR);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCsharpVisitor ) return ((miniCsharpVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); match(STRING);
			setState(110); match(VAR);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCsharpVisitor ) return ((miniCsharpVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); match(BOOL);
			setState(113); match(VAR);
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
		public List<TerminalNode> VAR() { return getTokens(miniCsharpParser.VAR); }
		public TerminalNode NUM(int i) {
			return getToken(miniCsharpParser.NUM, i);
		}
		public List<TerminalNode> NUM() { return getTokens(miniCsharpParser.NUM); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCsharpVisitor ) return ((miniCsharpVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_op);
		try {
			setState(165);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115); match(VAR);
				setState(116); match(EQL);
				setState(117); match(VAR);
				setState(118); match(SOMA);
				setState(119); match(VAR);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120); match(VAR);
				setState(121); match(EQL);
				setState(122); match(VAR);
				setState(123); match(SUB);
				setState(124); match(VAR);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(125); match(VAR);
				setState(126); match(EQL);
				setState(127); match(VAR);
				setState(128); match(DIV);
				setState(129); match(VAR);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(130); match(VAR);
				setState(131); match(EQL);
				setState(132); match(VAR);
				setState(133); match(MULT);
				setState(134); match(VAR);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(135); match(VAR);
				setState(136); match(EQL);
				setState(137); match(VAR);
				setState(138); match(REST);
				setState(139); match(VAR);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(140); match(VAR);
				setState(141); match(EQL);
				setState(142); match(NUM);
				setState(143); match(SOMA);
				setState(144); match(NUM);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(145); match(VAR);
				setState(146); match(EQL);
				setState(147); match(NUM);
				setState(148); match(SUB);
				setState(149); match(NUM);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(150); match(VAR);
				setState(151); match(EQL);
				setState(152); match(NUM);
				setState(153); match(DIV);
				setState(154); match(NUM);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(155); match(VAR);
				setState(156); match(EQL);
				setState(157); match(NUM);
				setState(158); match(MULT);
				setState(159); match(NUM);
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(160); match(VAR);
				setState(161); match(EQL);
				setState(162); match(NUM);
				setState(163); match(REST);
				setState(164); match(NUM);
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

	public static class AtrContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(miniCsharpParser.VAR, 0); }
		public AtrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).enterAtr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).exitAtr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCsharpVisitor ) return ((miniCsharpVisitor<? extends T>)visitor).visitAtr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtrContext atr() throws RecognitionException {
		AtrContext _localctx = new AtrContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_atr);
		try {
			setState(171);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167); match(VAR);
				setState(168); match(ACR);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169); match(VAR);
				setState(170); match(DEC);
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
		public TerminalNode VAR() { return getToken(miniCsharpParser.VAR, 0); }
		public OplContext opl() {
			return getRuleContext(OplContext.class,0);
		}
		public CmpContext cmp() {
			return getRuleContext(CmpContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCsharpVisitor ) return ((miniCsharpVisitor<? extends T>)visitor).visitOpl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OplContext opl() throws RecognitionException {
		OplContext _localctx = new OplContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_opl);
		try {
			setState(183);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173); match(VAR);
				setState(174); match(E);
				setState(175); opl();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176); match(VAR);
				setState(177); match(OU);
				setState(178); opl();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179); cmp();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(180); cmp();
				setState(181); opl();
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

	public static class CmpContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(miniCsharpParser.VAR, 0); }
		public TerminalNode NUM() { return getToken(miniCsharpParser.NUM, 0); }
		public CmpContext cmp() {
			return getRuleContext(CmpContext.class,0);
		}
		public CmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).enterCmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).exitCmp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCsharpVisitor ) return ((miniCsharpVisitor<? extends T>)visitor).visitCmp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmpContext cmp() throws RecognitionException {
		CmpContext _localctx = new CmpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cmp);
		try {
			setState(223);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185); match(VAR);
				setState(186); match(EQLEQL);
				setState(187); cmp();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188); match(VAR);
				setState(189); match(DIF);
				setState(190); cmp();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(191); match(VAR);
				setState(192); match(MAI);
				setState(193); cmp();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(194); match(VAR);
				setState(195); match(MEN);
				setState(196); cmp();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(197); match(VAR);
				setState(198); match(MENEQL);
				setState(199); cmp();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(200); match(VAR);
				setState(201); match(MAIEQL);
				setState(202); cmp();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(203); match(NUM);
				setState(204); match(EQLEQL);
				setState(205); cmp();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(206); match(NUM);
				setState(207); match(DIF);
				setState(208); cmp();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(209); match(NUM);
				setState(210); match(MAI);
				setState(211); cmp();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(212); match(NUM);
				setState(213); match(MEN);
				setState(214); cmp();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(215); match(NUM);
				setState(216); match(MENEQL);
				setState(217); cmp();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(218); match(NUM);
				setState(219); match(MAIEQL);
				setState(220); cmp();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(221); match(NUM);
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(222); match(VAR);
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
		public CodigoContext codigo(int i) {
			return getRuleContext(CodigoContext.class,i);
		}
		public TerminalNode IF() { return getToken(miniCsharpParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(miniCsharpParser.ELSE, 0); }
		public OplContext opl() {
			return getRuleContext(OplContext.class,0);
		}
		public List<CodigoContext> codigo() {
			return getRuleContexts(CodigoContext.class);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCsharpVisitor ) return ((miniCsharpVisitor<? extends T>)visitor).visitCf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CfContext cf() throws RecognitionException {
		CfContext _localctx = new CfContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cf);
		try {
			setState(241);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225); match(IF);
				{
				setState(226); opl();
				}
				setState(227); match(CHA);
				setState(228); codigo();
				setState(229); match(CHF);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231); match(IF);
				{
				setState(232); opl();
				}
				setState(233); match(CHA);
				setState(234); codigo();
				setState(235); match(CHF);
				setState(236); match(ELSE);
				setState(237); match(CHA);
				setState(238); codigo();
				setState(239); match(CHF);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCsharpVisitor ) return ((miniCsharpVisitor<? extends T>)visitor).visitTexto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextoContext texto() throws RecognitionException {
		TextoContext _localctx = new TextoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_texto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243); match(TEXTO);
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
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public TerminalNode NUM() { return getToken(miniCsharpParser.NUM, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCsharpVisitor ) return ((miniCsharpVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_num);
		try {
			setState(249);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245); match(NUM);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246); match(NUM);
				setState(247); match(SEP);
				setState(248); num();
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3&\u00fe\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\64"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4=\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"E\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6U\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7e\n\7\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a8\n\r\3\16"+
		"\3\16\3\16\3\16\5\16\u00ae\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u00ba\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00e2\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00f4\n\21\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\5\23\u00fc\n\23\3\23\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$\2\2\u0117\2&\3\2\2\2\4\63\3\2\2\2\6<\3\2\2\2\bD\3\2\2\2\nT\3\2\2"+
		"\2\fd\3\2\2\2\16f\3\2\2\2\20i\3\2\2\2\22l\3\2\2\2\24o\3\2\2\2\26r\3\2"+
		"\2\2\30\u00a7\3\2\2\2\32\u00ad\3\2\2\2\34\u00b9\3\2\2\2\36\u00e1\3\2\2"+
		"\2 \u00f3\3\2\2\2\"\u00f5\3\2\2\2$\u00fb\3\2\2\2&\'\7\3\2\2\'(\7\26\2"+
		"\2()\5\4\3\2)*\7\27\2\2*\3\3\2\2\2+,\5\6\4\2,-\7\32\2\2-\64\3\2\2\2./"+
		"\5\6\4\2/\60\7\32\2\2\60\61\7&\2\2\61\62\5\4\3\2\62\64\3\2\2\2\63+\3\2"+
		"\2\2\63.\3\2\2\2\64\5\3\2\2\2\65=\5\n\6\2\66=\5\f\7\2\67=\5\b\5\28=\5"+
		"\30\r\29=\5\34\17\2:=\5 \21\2;=\5\32\16\2<\65\3\2\2\2<\66\3\2\2\2<\67"+
		"\3\2\2\2<8\3\2\2\2<9\3\2\2\2<:\3\2\2\2<;\3\2\2\2=\7\3\2\2\2>E\3\2\2\2"+
		"?E\5\16\b\2@E\5\20\t\2AE\5\22\n\2BE\5\24\13\2CE\5\26\f\2D>\3\2\2\2D?\3"+
		"\2\2\2D@\3\2\2\2DA\3\2\2\2DB\3\2\2\2DC\3\2\2\2E\t\3\2\2\2FG\7\4\2\2GH"+
		"\7\30\2\2HI\5$\23\2IJ\7\31\2\2JU\3\2\2\2KL\7\4\2\2LM\7\30\2\2MN\5\"\22"+
		"\2NO\7\31\2\2OU\3\2\2\2PQ\7\4\2\2QR\7\30\2\2RS\7\f\2\2SU\7\31\2\2TF\3"+
		"\2\2\2TK\3\2\2\2TP\3\2\2\2U\13\3\2\2\2VW\7\5\2\2WX\7\30\2\2XY\5$\23\2"+
		"YZ\7\31\2\2Ze\3\2\2\2[\\\7\5\2\2\\]\7\30\2\2]^\5\"\22\2^_\7\31\2\2_e\3"+
		"\2\2\2`a\7\5\2\2ab\7\30\2\2bc\7\f\2\2ce\7\31\2\2dV\3\2\2\2d[\3\2\2\2d"+
		"`\3\2\2\2e\r\3\2\2\2fg\7\6\2\2gh\7\f\2\2h\17\3\2\2\2ij\7\7\2\2jk\7\f\2"+
		"\2k\21\3\2\2\2lm\7\b\2\2mn\7\f\2\2n\23\3\2\2\2op\7\t\2\2pq\7\f\2\2q\25"+
		"\3\2\2\2rs\7\n\2\2st\7\f\2\2t\27\3\2\2\2uv\7\f\2\2vw\7\33\2\2wx\7\f\2"+
		"\2xy\7\r\2\2y\u00a8\7\f\2\2z{\7\f\2\2{|\7\33\2\2|}\7\f\2\2}~\7\16\2\2"+
		"~\u00a8\7\f\2\2\177\u0080\7\f\2\2\u0080\u0081\7\33\2\2\u0081\u0082\7\f"+
		"\2\2\u0082\u0083\7\17\2\2\u0083\u00a8\7\f\2\2\u0084\u0085\7\f\2\2\u0085"+
		"\u0086\7\33\2\2\u0086\u0087\7\f\2\2\u0087\u0088\7\20\2\2\u0088\u00a8\7"+
		"\f\2\2\u0089\u008a\7\f\2\2\u008a\u008b\7\33\2\2\u008b\u008c\7\f\2\2\u008c"+
		"\u008d\7\21\2\2\u008d\u00a8\7\f\2\2\u008e\u008f\7\f\2\2\u008f\u0090\7"+
		"\33\2\2\u0090\u0091\7\13\2\2\u0091\u0092\7\r\2\2\u0092\u00a8\7\13\2\2"+
		"\u0093\u0094\7\f\2\2\u0094\u0095\7\33\2\2\u0095\u0096\7\13\2\2\u0096\u0097"+
		"\7\16\2\2\u0097\u00a8\7\13\2\2\u0098\u0099\7\f\2\2\u0099\u009a\7\33\2"+
		"\2\u009a\u009b\7\13\2\2\u009b\u009c\7\17\2\2\u009c\u00a8\7\13\2\2\u009d"+
		"\u009e\7\f\2\2\u009e\u009f\7\33\2\2\u009f\u00a0\7\13\2\2\u00a0\u00a1\7"+
		"\20\2\2\u00a1\u00a8\7\13\2\2\u00a2\u00a3\7\f\2\2\u00a3\u00a4\7\33\2\2"+
		"\u00a4\u00a5\7\13\2\2\u00a5\u00a6\7\21\2\2\u00a6\u00a8\7\13\2\2\u00a7"+
		"u\3\2\2\2\u00a7z\3\2\2\2\u00a7\177\3\2\2\2\u00a7\u0084\3\2\2\2\u00a7\u0089"+
		"\3\2\2\2\u00a7\u008e\3\2\2\2\u00a7\u0093\3\2\2\2\u00a7\u0098\3\2\2\2\u00a7"+
		"\u009d\3\2\2\2\u00a7\u00a2\3\2\2\2\u00a8\31\3\2\2\2\u00a9\u00aa\7\f\2"+
		"\2\u00aa\u00ae\7\"\2\2\u00ab\u00ac\7\f\2\2\u00ac\u00ae\7#\2\2\u00ad\u00a9"+
		"\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\33\3\2\2\2\u00af\u00b0\7\f\2\2\u00b0"+
		"\u00b1\7\22\2\2\u00b1\u00ba\5\34\17\2\u00b2\u00b3\7\f\2\2\u00b3\u00b4"+
		"\7\23\2\2\u00b4\u00ba\5\34\17\2\u00b5\u00ba\5\36\20\2\u00b6\u00b7\5\36"+
		"\20\2\u00b7\u00b8\5\34\17\2\u00b8\u00ba\3\2\2\2\u00b9\u00af\3\2\2\2\u00b9"+
		"\u00b2\3\2\2\2\u00b9\u00b5\3\2\2\2\u00b9\u00b6\3\2\2\2\u00ba\35\3\2\2"+
		"\2\u00bb\u00bc\7\f\2\2\u00bc\u00bd\7\34\2\2\u00bd\u00e2\5\36\20\2\u00be"+
		"\u00bf\7\f\2\2\u00bf\u00c0\7\35\2\2\u00c0\u00e2\5\36\20\2\u00c1\u00c2"+
		"\7\f\2\2\u00c2\u00c3\7\36\2\2\u00c3\u00e2\5\36\20\2\u00c4\u00c5\7\f\2"+
		"\2\u00c5\u00c6\7\37\2\2\u00c6\u00e2\5\36\20\2\u00c7\u00c8\7\f\2\2\u00c8"+
		"\u00c9\7 \2\2\u00c9\u00e2\5\36\20\2\u00ca\u00cb\7\f\2\2\u00cb\u00cc\7"+
		"!\2\2\u00cc\u00e2\5\36\20\2\u00cd\u00ce\7\13\2\2\u00ce\u00cf\7\34\2\2"+
		"\u00cf\u00e2\5\36\20\2\u00d0\u00d1\7\13\2\2\u00d1\u00d2\7\35\2\2\u00d2"+
		"\u00e2\5\36\20\2\u00d3\u00d4\7\13\2\2\u00d4\u00d5\7\36\2\2\u00d5\u00e2"+
		"\5\36\20\2\u00d6\u00d7\7\13\2\2\u00d7\u00d8\7\37\2\2\u00d8\u00e2\5\36"+
		"\20\2\u00d9\u00da\7\13\2\2\u00da\u00db\7 \2\2\u00db\u00e2\5\36\20\2\u00dc"+
		"\u00dd\7\13\2\2\u00dd\u00de\7!\2\2\u00de\u00e2\5\36\20\2\u00df\u00e2\7"+
		"\13\2\2\u00e0\u00e2\7\f\2\2\u00e1\u00bb\3\2\2\2\u00e1\u00be\3\2\2\2\u00e1"+
		"\u00c1\3\2\2\2\u00e1\u00c4\3\2\2\2\u00e1\u00c7\3\2\2\2\u00e1\u00ca\3\2"+
		"\2\2\u00e1\u00cd\3\2\2\2\u00e1\u00d0\3\2\2\2\u00e1\u00d3\3\2\2\2\u00e1"+
		"\u00d6\3\2\2\2\u00e1\u00d9\3\2\2\2\u00e1\u00dc\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e1\u00e0\3\2\2\2\u00e2\37\3\2\2\2\u00e3\u00e4\7\24\2\2\u00e4\u00e5"+
		"\5\34\17\2\u00e5\u00e6\7\26\2\2\u00e6\u00e7\5\4\3\2\u00e7\u00e8\7\27\2"+
		"\2\u00e8\u00f4\3\2\2\2\u00e9\u00ea\7\24\2\2\u00ea\u00eb\5\34\17\2\u00eb"+
		"\u00ec\7\26\2\2\u00ec\u00ed\5\4\3\2\u00ed\u00ee\7\27\2\2\u00ee\u00ef\7"+
		"\25\2\2\u00ef\u00f0\7\26\2\2\u00f0\u00f1\5\4\3\2\u00f1\u00f2\7\27\2\2"+
		"\u00f2\u00f4\3\2\2\2\u00f3\u00e3\3\2\2\2\u00f3\u00e9\3\2\2\2\u00f4!\3"+
		"\2\2\2\u00f5\u00f6\7$\2\2\u00f6#\3\2\2\2\u00f7\u00fc\7\13\2\2\u00f8\u00f9"+
		"\7\13\2\2\u00f9\u00fa\7%\2\2\u00fa\u00fc\5$\23\2\u00fb\u00f7\3\2\2\2\u00fb"+
		"\u00f8\3\2\2\2\u00fc%\3\2\2\2\r\63<DTd\u00a7\u00ad\u00b9\u00e1\u00f3\u00fb";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}