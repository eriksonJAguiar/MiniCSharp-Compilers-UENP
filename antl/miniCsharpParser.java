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
		MAIN=1, READ=2, WHITE=3, INT=4, FLOAT=5, DOUBLE=6, STRING=7, BOOL=8, B=9, 
		NUM=10, VAR=11, SOMA=12, SUB=13, DIV=14, MULT=15, REST=16, E=17, OU=18, 
		IF=19, ELSE=20, TRUE=21, CHA=22, CHF=23, PAA=24, PAF=25, EDL=26, EQL=27, 
		EQLEQL=28, DIF=29, MAI=30, MEN=31, MENEQL=32, MAIEQL=33, NEG=34, ACR=35, 
		DEC=36, SEP=37, TEXTO=38, WS=39;
	public static final String[] tokenNames = {
		"<INVALID>", "'Main'", "'read'", "'white'", "'int'", "'float'", "'double'", 
		"'string'", "'bool'", "B", "NUM", "VAR", "'+'", "'-'", "'/'", "'*'", "'%'", 
		"'&&'", "'||'", "'if'", "'else'", "'true'", "'{'", "'}'", "'('", "')'", 
		"';'", "'='", "'=='", "'!='", "'>'", "'<'", "'<='", "'>='", "'!'", "'++'", 
		"'--'", "','", "TEXTO", "WS"
	};
	public static final int
		RULE_mcSHARP = 0, RULE_codigo = 1, RULE_cmd = 2, RULE_declaracao = 3, 
		RULE_ler = 4, RULE_escrever = 5, RULE_cf = 6, RULE_op = 7, RULE_atr = 8, 
		RULE_opl = 9, RULE_cmp = 10, RULE_texto = 11, RULE_num = 12;
	public static final String[] ruleNames = {
		"mcSHARP", "codigo", "cmd", "declaracao", "ler", "escrever", "cf", "op", 
		"atr", "opl", "cmp", "texto", "num"
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
			setState(26); match(MAIN);
			setState(27); match(CHA);
			setState(28); codigo();
			setState(29); match(CHF);
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
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CodigoContext codigo() {
			return getRuleContext(CodigoContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
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
			setState(45);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31); cmd();
				setState(32); match(EDL);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34); cmd();
				setState(35); match(EDL);
				setState(36); cmd();
				setState(37); match(EDL);
				setState(38); codigo();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40); cmd();
				setState(41); match(EDL);
				setState(42); cmd();
				setState(43); match(EDL);
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
			setState(54);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47); ler();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(48); escrever();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(49); declaracao();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(50); cf();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(51); atr();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(52); opl();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(53); op();
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
		public TerminalNode BOOL() { return getToken(miniCsharpParser.BOOL, 0); }
		public TerminalNode FLOAT() { return getToken(miniCsharpParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(miniCsharpParser.INT, 0); }
		public TerminalNode VAR() { return getToken(miniCsharpParser.VAR, 0); }
		public TerminalNode DOUBLE() { return getToken(miniCsharpParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(miniCsharpParser.STRING, 0); }
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
			setState(81);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56); match(INT);
				setState(57); match(VAR);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58); match(FLOAT);
				setState(59); match(VAR);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60); match(DOUBLE);
				setState(61); match(VAR);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(62); match(STRING);
				setState(63); match(VAR);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(64); match(BOOL);
				setState(65); match(VAR);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(66); match(INT);
				setState(67); match(VAR);
				setState(68); match(EQL);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(69); match(FLOAT);
				setState(70); match(VAR);
				setState(71); match(EQL);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(72); match(DOUBLE);
				setState(73); match(VAR);
				setState(74); match(EQL);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(75); match(STRING);
				setState(76); match(VAR);
				setState(77); match(EQL);
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(78); match(BOOL);
				setState(79); match(VAR);
				setState(80); match(EQL);
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
		public TerminalNode NUM() { return getToken(miniCsharpParser.NUM, 0); }
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
			setState(111);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83); match(READ);
				setState(84); match(PAA);
				setState(85); num();
				setState(86); match(PAF);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88); match(READ);
				setState(89); match(PAA);
				setState(90); texto();
				setState(91); match(PAF);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(93); match(READ);
				setState(94); match(PAA);
				setState(95); match(VAR);
				setState(96); match(PAF);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(97); match(READ);
				setState(98); match(PAA);
				setState(99); texto();
				setState(100); match(SEP);
				setState(101); match(VAR);
				setState(102); match(PAF);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(104); match(READ);
				setState(105); match(PAA);
				setState(106); texto();
				setState(107); match(SEP);
				setState(108); match(NUM);
				setState(109); match(PAF);
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
			setState(127);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113); match(WHITE);
				setState(114); match(PAA);
				setState(115); num();
				setState(116); match(PAF);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118); match(WHITE);
				setState(119); match(PAA);
				setState(120); texto();
				setState(121); match(PAF);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123); match(WHITE);
				setState(124); match(PAA);
				setState(125); match(VAR);
				setState(126); match(PAF);
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
		enterRule(_localctx, 12, RULE_cf);
		try {
			setState(145);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129); match(IF);
				{
				setState(130); opl();
				}
				setState(131); match(CHA);
				setState(132); codigo();
				setState(133); match(CHF);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135); match(IF);
				{
				setState(136); opl();
				}
				setState(137); match(CHA);
				setState(138); codigo();
				setState(139); match(CHF);
				setState(140); match(ELSE);
				setState(141); match(CHA);
				setState(142); codigo();
				setState(143); match(CHF);
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

	public static class OpContext extends ParserRuleContext {
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public TerminalNode VAR() { return getToken(miniCsharpParser.VAR, 0); }
		public TerminalNode NUM() { return getToken(miniCsharpParser.NUM, 0); }
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
		enterRule(_localctx, 14, RULE_op);
		try {
			setState(179);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147); match(VAR);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148); match(NUM);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(149); match(VAR);
				setState(150); match(SOMA);
				setState(151); op();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(152); match(VAR);
				setState(153); match(SUB);
				setState(154); op();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(155); match(VAR);
				setState(156); match(DIV);
				setState(157); op();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(158); match(VAR);
				setState(159); match(MULT);
				setState(160); op();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(161); match(VAR);
				setState(162); match(REST);
				setState(163); op();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(164); match(NUM);
				setState(165); match(SOMA);
				setState(166); op();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(167); match(NUM);
				setState(168); match(SUB);
				setState(169); op();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(170); match(NUM);
				setState(171); match(DIV);
				setState(172); op();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(173); match(NUM);
				setState(174); match(MULT);
				setState(175); op();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(176); match(NUM);
				setState(177); match(REST);
				setState(178); op();
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
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
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
		enterRule(_localctx, 16, RULE_atr);
		try {
			setState(188);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181); match(VAR);
				setState(182); match(EQL);
				setState(183); op();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184); match(VAR);
				setState(185); match(ACR);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(186); match(VAR);
				setState(187); match(DEC);
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
		enterRule(_localctx, 18, RULE_opl);
		try {
			setState(200);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190); match(VAR);
				setState(191); match(E);
				setState(192); opl();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193); match(VAR);
				setState(194); match(OU);
				setState(195); opl();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(196); cmp();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(197); cmp();
				setState(198); opl();
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
		enterRule(_localctx, 20, RULE_cmp);
		try {
			setState(242);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202); match(VAR);
				setState(203); match(EQLEQL);
				setState(204); cmp();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205); match(VAR);
				setState(206); match(DIF);
				setState(207); cmp();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(208); match(VAR);
				setState(209); match(MAI);
				setState(210); cmp();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(211); match(VAR);
				setState(212); match(MEN);
				setState(213); cmp();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(214); match(VAR);
				setState(215); match(MENEQL);
				setState(216); cmp();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(217); match(VAR);
				setState(218); match(MAIEQL);
				setState(219); cmp();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(220); match(NUM);
				setState(221); match(EQLEQL);
				setState(222); cmp();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(223); match(NUM);
				setState(224); match(DIF);
				setState(225); cmp();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(226); match(NUM);
				setState(227); match(MAI);
				setState(228); cmp();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(229); match(NUM);
				setState(230); match(MEN);
				setState(231); cmp();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(232); match(NUM);
				setState(233); match(MENEQL);
				setState(234); cmp();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(235); match(NUM);
				setState(236); match(MAIEQL);
				setState(237); cmp();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(238); match(NEG);
				setState(239); match(VAR);
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(240); match(NUM);
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(241); match(VAR);
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
		enterRule(_localctx, 22, RULE_texto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244); match(TEXTO);
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
		enterRule(_localctx, 24, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246); match(NUM);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3)\u00fb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\60\n\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\49\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5T\n\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6r\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0082\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0094\n\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b6\n\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u00bf\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00cb\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00f5\n\f\3\r\3\r\3\16\3\16\3"+
		"\16\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\2\u0123\2\34\3\2\2\2\4/\3"+
		"\2\2\2\68\3\2\2\2\bS\3\2\2\2\nq\3\2\2\2\f\u0081\3\2\2\2\16\u0093\3\2\2"+
		"\2\20\u00b5\3\2\2\2\22\u00be\3\2\2\2\24\u00ca\3\2\2\2\26\u00f4\3\2\2\2"+
		"\30\u00f6\3\2\2\2\32\u00f8\3\2\2\2\34\35\7\3\2\2\35\36\7\30\2\2\36\37"+
		"\5\4\3\2\37 \7\31\2\2 \3\3\2\2\2!\"\5\6\4\2\"#\7\34\2\2#\60\3\2\2\2$%"+
		"\5\6\4\2%&\7\34\2\2&\'\5\6\4\2\'(\7\34\2\2()\5\4\3\2)\60\3\2\2\2*+\5\6"+
		"\4\2+,\7\34\2\2,-\5\6\4\2-.\7\34\2\2.\60\3\2\2\2/!\3\2\2\2/$\3\2\2\2/"+
		"*\3\2\2\2\60\5\3\2\2\2\619\5\n\6\2\629\5\f\7\2\639\5\b\5\2\649\5\16\b"+
		"\2\659\5\22\n\2\669\5\24\13\2\679\5\20\t\28\61\3\2\2\28\62\3\2\2\28\63"+
		"\3\2\2\28\64\3\2\2\28\65\3\2\2\28\66\3\2\2\28\67\3\2\2\29\7\3\2\2\2:;"+
		"\7\6\2\2;T\7\r\2\2<=\7\7\2\2=T\7\r\2\2>?\7\b\2\2?T\7\r\2\2@A\7\t\2\2A"+
		"T\7\r\2\2BC\7\n\2\2CT\7\r\2\2DE\7\6\2\2EF\7\r\2\2FT\7\35\2\2GH\7\7\2\2"+
		"HI\7\r\2\2IT\7\35\2\2JK\7\b\2\2KL\7\r\2\2LT\7\35\2\2MN\7\t\2\2NO\7\r\2"+
		"\2OT\7\35\2\2PQ\7\n\2\2QR\7\r\2\2RT\7\35\2\2S:\3\2\2\2S<\3\2\2\2S>\3\2"+
		"\2\2S@\3\2\2\2SB\3\2\2\2SD\3\2\2\2SG\3\2\2\2SJ\3\2\2\2SM\3\2\2\2SP\3\2"+
		"\2\2T\t\3\2\2\2UV\7\4\2\2VW\7\32\2\2WX\5\32\16\2XY\7\33\2\2Yr\3\2\2\2"+
		"Z[\7\4\2\2[\\\7\32\2\2\\]\5\30\r\2]^\7\33\2\2^r\3\2\2\2_`\7\4\2\2`a\7"+
		"\32\2\2ab\7\r\2\2br\7\33\2\2cd\7\4\2\2de\7\32\2\2ef\5\30\r\2fg\7\'\2\2"+
		"gh\7\r\2\2hi\7\33\2\2ir\3\2\2\2jk\7\4\2\2kl\7\32\2\2lm\5\30\r\2mn\7\'"+
		"\2\2no\7\f\2\2op\7\33\2\2pr\3\2\2\2qU\3\2\2\2qZ\3\2\2\2q_\3\2\2\2qc\3"+
		"\2\2\2qj\3\2\2\2r\13\3\2\2\2st\7\5\2\2tu\7\32\2\2uv\5\32\16\2vw\7\33\2"+
		"\2w\u0082\3\2\2\2xy\7\5\2\2yz\7\32\2\2z{\5\30\r\2{|\7\33\2\2|\u0082\3"+
		"\2\2\2}~\7\5\2\2~\177\7\32\2\2\177\u0080\7\r\2\2\u0080\u0082\7\33\2\2"+
		"\u0081s\3\2\2\2\u0081x\3\2\2\2\u0081}\3\2\2\2\u0082\r\3\2\2\2\u0083\u0084"+
		"\7\25\2\2\u0084\u0085\5\24\13\2\u0085\u0086\7\30\2\2\u0086\u0087\5\4\3"+
		"\2\u0087\u0088\7\31\2\2\u0088\u0094\3\2\2\2\u0089\u008a\7\25\2\2\u008a"+
		"\u008b\5\24\13\2\u008b\u008c\7\30\2\2\u008c\u008d\5\4\3\2\u008d\u008e"+
		"\7\31\2\2\u008e\u008f\7\26\2\2\u008f\u0090\7\30\2\2\u0090\u0091\5\4\3"+
		"\2\u0091\u0092\7\31\2\2\u0092\u0094\3\2\2\2\u0093\u0083\3\2\2\2\u0093"+
		"\u0089\3\2\2\2\u0094\17\3\2\2\2\u0095\u00b6\7\r\2\2\u0096\u00b6\7\f\2"+
		"\2\u0097\u0098\7\r\2\2\u0098\u0099\7\16\2\2\u0099\u00b6\5\20\t\2\u009a"+
		"\u009b\7\r\2\2\u009b\u009c\7\17\2\2\u009c\u00b6\5\20\t\2\u009d\u009e\7"+
		"\r\2\2\u009e\u009f\7\20\2\2\u009f\u00b6\5\20\t\2\u00a0\u00a1\7\r\2\2\u00a1"+
		"\u00a2\7\21\2\2\u00a2\u00b6\5\20\t\2\u00a3\u00a4\7\r\2\2\u00a4\u00a5\7"+
		"\22\2\2\u00a5\u00b6\5\20\t\2\u00a6\u00a7\7\f\2\2\u00a7\u00a8\7\16\2\2"+
		"\u00a8\u00b6\5\20\t\2\u00a9\u00aa\7\f\2\2\u00aa\u00ab\7\17\2\2\u00ab\u00b6"+
		"\5\20\t\2\u00ac\u00ad\7\f\2\2\u00ad\u00ae\7\20\2\2\u00ae\u00b6\5\20\t"+
		"\2\u00af\u00b0\7\f\2\2\u00b0\u00b1\7\21\2\2\u00b1\u00b6\5\20\t\2\u00b2"+
		"\u00b3\7\f\2\2\u00b3\u00b4\7\22\2\2\u00b4\u00b6\5\20\t\2\u00b5\u0095\3"+
		"\2\2\2\u00b5\u0096\3\2\2\2\u00b5\u0097\3\2\2\2\u00b5\u009a\3\2\2\2\u00b5"+
		"\u009d\3\2\2\2\u00b5\u00a0\3\2\2\2\u00b5\u00a3\3\2\2\2\u00b5\u00a6\3\2"+
		"\2\2\u00b5\u00a9\3\2\2\2\u00b5\u00ac\3\2\2\2\u00b5\u00af\3\2\2\2\u00b5"+
		"\u00b2\3\2\2\2\u00b6\21\3\2\2\2\u00b7\u00b8\7\r\2\2\u00b8\u00b9\7\35\2"+
		"\2\u00b9\u00bf\5\20\t\2\u00ba\u00bb\7\r\2\2\u00bb\u00bf\7%\2\2\u00bc\u00bd"+
		"\7\r\2\2\u00bd\u00bf\7&\2\2\u00be\u00b7\3\2\2\2\u00be\u00ba\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00bf\23\3\2\2\2\u00c0\u00c1\7\r\2\2\u00c1\u00c2\7\23\2"+
		"\2\u00c2\u00cb\5\24\13\2\u00c3\u00c4\7\r\2\2\u00c4\u00c5\7\24\2\2\u00c5"+
		"\u00cb\5\24\13\2\u00c6\u00cb\5\26\f\2\u00c7\u00c8\5\26\f\2\u00c8\u00c9"+
		"\5\24\13\2\u00c9\u00cb\3\2\2\2\u00ca\u00c0\3\2\2\2\u00ca\u00c3\3\2\2\2"+
		"\u00ca\u00c6\3\2\2\2\u00ca\u00c7\3\2\2\2\u00cb\25\3\2\2\2\u00cc\u00cd"+
		"\7\r\2\2\u00cd\u00ce\7\36\2\2\u00ce\u00f5\5\26\f\2\u00cf\u00d0\7\r\2\2"+
		"\u00d0\u00d1\7\37\2\2\u00d1\u00f5\5\26\f\2\u00d2\u00d3\7\r\2\2\u00d3\u00d4"+
		"\7 \2\2\u00d4\u00f5\5\26\f\2\u00d5\u00d6\7\r\2\2\u00d6\u00d7\7!\2\2\u00d7"+
		"\u00f5\5\26\f\2\u00d8\u00d9\7\r\2\2\u00d9\u00da\7\"\2\2\u00da\u00f5\5"+
		"\26\f\2\u00db\u00dc\7\r\2\2\u00dc\u00dd\7#\2\2\u00dd\u00f5\5\26\f\2\u00de"+
		"\u00df\7\f\2\2\u00df\u00e0\7\36\2\2\u00e0\u00f5\5\26\f\2\u00e1\u00e2\7"+
		"\f\2\2\u00e2\u00e3\7\37\2\2\u00e3\u00f5\5\26\f\2\u00e4\u00e5\7\f\2\2\u00e5"+
		"\u00e6\7 \2\2\u00e6\u00f5\5\26\f\2\u00e7\u00e8\7\f\2\2\u00e8\u00e9\7!"+
		"\2\2\u00e9\u00f5\5\26\f\2\u00ea\u00eb\7\f\2\2\u00eb\u00ec\7\"\2\2\u00ec"+
		"\u00f5\5\26\f\2\u00ed\u00ee\7\f\2\2\u00ee\u00ef\7#\2\2\u00ef\u00f5\5\26"+
		"\f\2\u00f0\u00f1\7$\2\2\u00f1\u00f5\7\r\2\2\u00f2\u00f5\7\f\2\2\u00f3"+
		"\u00f5\7\r\2\2\u00f4\u00cc\3\2\2\2\u00f4\u00cf\3\2\2\2\u00f4\u00d2\3\2"+
		"\2\2\u00f4\u00d5\3\2\2\2\u00f4\u00d8\3\2\2\2\u00f4\u00db\3\2\2\2\u00f4"+
		"\u00de\3\2\2\2\u00f4\u00e1\3\2\2\2\u00f4\u00e4\3\2\2\2\u00f4\u00e7\3\2"+
		"\2\2\u00f4\u00ea\3\2\2\2\u00f4\u00ed\3\2\2\2\u00f4\u00f0\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5\27\3\2\2\2\u00f6\u00f7\7(\2\2"+
		"\u00f7\31\3\2\2\2\u00f8\u00f9\7\f\2\2\u00f9\33\3\2\2\2\f/8Sq\u0081\u0093"+
		"\u00b5\u00be\u00ca\u00f4";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}