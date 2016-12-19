// Generated from C:\Users\erikson\Desktop\MiniCSharp\antl\miniCsharp.g4 by ANTLR 4.1
package compiler.miniCSharp.com;

import java.util.HashMap;

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
		MAIN=1, READ=2, WRITE=3, IF=4, ELSE=5, CHAR=6, B=7, NUMF=8, NUMI=9, VAR=10, 
		SOMA=11, SUB=12, DIV=13, MULT=14, REST=15, E=16, OU=17, CHA=18, CHF=19, 
		PAA=20, PAF=21, EDL=22, EQL=23, EQLEQL=24, DIF=25, MAI=26, MEN=27, MENEQL=28, 
		MAIEQL=29, NEG=30, ACR=31, DEC=32, ACRMORE=33, DECMORE=34, SEP=35, CARACTER=36, 
		TEXTO=37, WS=38, COMMENT=39, COMMENTBLOCK=40;
	public static final String[] tokenNames = {
		"<INVALID>", "'Main'", "'read'", "'write'", "'if'", "'else'", "'char'", 
		"B", "NUMF", "NUMI", "VAR", "'+'", "'-'", "'/'", "'*'", "'%'", "'&&'", 
		"'||'", "'{'", "'}'", "'('", "')'", "';'", "'='", "'=='", "'!='", "'>'", 
		"'<'", "'<='", "'>='", "'!'", "'++'", "'--'", "'+='", "'-='", "','", "CARACTER", 
		"TEXTO", "WS", "COMMENT", "COMMENTBLOCK"
	};
	public static final int
		RULE_mcSHARP = 0, RULE_codigo = 1, RULE_cmd = 2, RULE_ler = 3, RULE_escrever = 4, 
		RULE_cf = 5, RULE_atr = 6, RULE_operacao = 7, RULE_operacaoAux = 8, RULE_operadores = 9, 
		RULE_cond = 10, RULE_comp = 11, RULE_opComp = 12, RULE_num = 13;
	public static final String[] ruleNames = {
		"mcSHARP", "codigo", "cmd", "ler", "escrever", "cf", "atr", "operacao", 
		"operacaoAux", "operadores", "cond", "comp", "opComp", "num"
	};

	@Override
	public String getGrammarFileName() { return "miniCsharp.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


	public HashMap<String,Integer> symbolTab = new HashMap<String,Integer>();

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
			setState(28); match(MAIN);
			setState(29); match(PAA);
			setState(30); match(PAF);
			setState(31); match(CHA);
			setState(32); codigo();
			setState(33); match(CHF);
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
		public CodigoContext codigo() {
			return getRuleContext(CodigoContext.class,0);
		}
		public CfContext cf() {
			return getRuleContext(CfContext.class,0);
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
			setState(46);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35); cmd();
				setState(36); match(EDL);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38); cmd();
				setState(39); match(EDL);
				setState(40); codigo();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(42); cf();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(43); cf();
				setState(44); codigo();
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
		public LerContext ler() {
			return getRuleContext(LerContext.class,0);
		}
		public EscreverContext escrever() {
			return getRuleContext(EscreverContext.class,0);
		}
		public AtrContext atr() {
			return getRuleContext(AtrContext.class,0);
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
			setState(51);
			switch (_input.LA(1)) {
			case READ:
				enterOuterAlt(_localctx, 1);
				{
				setState(48); ler();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 2);
				{
				setState(49); escrever();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(50); atr();
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

	public static class LerContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(miniCsharpParser.VAR, 0); }
		public TerminalNode READ() { return getToken(miniCsharpParser.READ, 0); }
		public TerminalNode TEXTO() { return getToken(miniCsharpParser.TEXTO, 0); }
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
		enterRule(_localctx, 6, RULE_ler);
		try {
			setState(79);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53); match(READ);
				setState(54); match(PAA);
				setState(55); num();
				setState(56); match(PAF);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58); match(READ);
				setState(59); match(PAA);
				setState(60); match(TEXTO);
				setState(61); match(PAF);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62); match(READ);
				setState(63); match(PAA);
				setState(64); match(VAR);
				setState(65); match(PAF);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(66); match(READ);
				setState(67); match(PAA);
				setState(68); match(TEXTO);
				setState(69); match(SEP);
				setState(70); match(VAR);
				setState(71); match(PAF);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(72); match(READ);
				setState(73); match(PAA);
				setState(74); match(TEXTO);
				setState(75); match(SEP);
				setState(76); num();
				setState(77); match(PAF);
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
		public TerminalNode WRITE() { return getToken(miniCsharpParser.WRITE, 0); }
		public TerminalNode TEXTO() { return getToken(miniCsharpParser.TEXTO, 0); }
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
		enterRule(_localctx, 8, RULE_escrever);
		try {
			setState(94);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81); match(WRITE);
				setState(82); match(PAA);
				setState(83); num();
				setState(84); match(PAF);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86); match(WRITE);
				setState(87); match(PAA);
				setState(88); match(TEXTO);
				setState(89); match(PAF);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90); match(WRITE);
				setState(91); match(PAA);
				setState(92); match(VAR);
				setState(93); match(PAF);
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
		public TerminalNode ELSE() { return getToken(miniCsharpParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(miniCsharpParser.IF, 0); }
		public CodigoContext codigo(int i) {
			return getRuleContext(CodigoContext.class,i);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
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
		enterRule(_localctx, 10, RULE_cf);
		try {
			setState(116);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96); match(IF);
				setState(97); match(PAA);
				setState(98); cond();
				setState(99); match(PAF);
				setState(100); match(CHA);
				setState(101); codigo();
				setState(102); match(CHF);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104); match(IF);
				setState(105); match(PAA);
				setState(106); cond();
				setState(107); match(PAF);
				setState(108); match(CHA);
				setState(109); codigo();
				setState(110); match(CHF);
				setState(111); match(ELSE);
				setState(112); match(CHA);
				setState(113); codigo();
				setState(114); match(CHF);
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
		public TerminalNode CARACTER() { return getToken(miniCsharpParser.CARACTER, 0); }
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public TerminalNode NUMI() { return getToken(miniCsharpParser.NUMI, 0); }
		public TerminalNode TEXTO() { return getToken(miniCsharpParser.TEXTO, 0); }
		public TerminalNode B() { return getToken(miniCsharpParser.B, 0); }
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
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
		enterRule(_localctx, 12, RULE_atr);
		try {
			setState(143);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118); match(VAR);
				setState(119); match(EQL);
				setState(120); operacao();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121); match(VAR);
				setState(122); match(EQL);
				setState(123); num();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(124); match(VAR);
				setState(125); match(EQL);
				setState(126); match(B);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127); match(VAR);
				setState(128); match(EQL);
				setState(129); match(TEXTO);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(130); match(VAR);
				setState(131); match(EQL);
				setState(132); match(CARACTER);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(133); match(VAR);
				setState(134); match(ACR);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(135); match(VAR);
				setState(136); match(DEC);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(137); match(VAR);
				setState(138); match(ACRMORE);
				setState(139); match(NUMI);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(140); match(VAR);
				setState(141); match(DECMORE);
				setState(142); match(NUMI);
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

	public static class OperacaoContext extends ParserRuleContext {
		public OperacaoAuxContext operacaoAux() {
			return getRuleContext(OperacaoAuxContext.class,0);
		}
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public OperacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).enterOperacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).exitOperacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCsharpVisitor ) return ((miniCsharpVisitor<? extends T>)visitor).visitOperacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacaoContext operacao() throws RecognitionException {
		OperacaoContext _localctx = new OperacaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_operacao);
		try {
			setState(149);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145); operacaoAux();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146); operacaoAux();
				setState(147); operacao();
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

	public static class OperacaoAuxContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(miniCsharpParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(miniCsharpParser.VAR, i);
		}
		public OperadoresContext operadores() {
			return getRuleContext(OperadoresContext.class,0);
		}
		public List<NumContext> num() {
			return getRuleContexts(NumContext.class);
		}
		public NumContext num(int i) {
			return getRuleContext(NumContext.class,i);
		}
		public OperacaoAuxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacaoAux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).enterOperacaoAux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).exitOperacaoAux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCsharpVisitor ) return ((miniCsharpVisitor<? extends T>)visitor).visitOperacaoAux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacaoAuxContext operacaoAux() throws RecognitionException {
		OperacaoAuxContext _localctx = new OperacaoAuxContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operacaoAux);
		try {
			setState(167);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151); match(VAR);
				setState(152); operadores();
				setState(153); match(VAR);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155); num();
				setState(156); operadores();
				setState(157); match(VAR);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(159); match(VAR);
				setState(160); operadores();
				setState(161); num();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(163); num();
				setState(164); operadores();
				setState(165); num();
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

	public static class OperadoresContext extends ParserRuleContext {
		public OperadoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).enterOperadores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).exitOperadores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCsharpVisitor ) return ((miniCsharpVisitor<? extends T>)visitor).visitOperadores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadoresContext operadores() throws RecognitionException {
		OperadoresContext _localctx = new OperadoresContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operadores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SOMA) | (1L << SUB) | (1L << DIV) | (1L << MULT) | (1L << REST))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class CondContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(miniCsharpParser.VAR, 0); }
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public OpCompContext opComp() {
			return getRuleContext(OpCompContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCsharpVisitor ) return ((miniCsharpVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cond);
		try {
			setState(189);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171); comp();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172); comp();
				setState(173); opComp();
				setState(174); cond();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(176); match(PAA);
				setState(177); comp();
				setState(178); match(PAF);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(180); match(PAA);
				setState(181); comp();
				setState(182); match(PAF);
				setState(183); opComp();
				setState(184); cond();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(186); match(NEG);
				setState(187); comp();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(188); match(VAR);
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

	public static class CompContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(miniCsharpParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(miniCsharpParser.VAR, i);
		}
		public OpCompContext opComp() {
			return getRuleContext(OpCompContext.class,0);
		}
		public List<NumContext> num() {
			return getRuleContexts(NumContext.class);
		}
		public NumContext num(int i) {
			return getRuleContext(NumContext.class,i);
		}
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).exitComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCsharpVisitor ) return ((miniCsharpVisitor<? extends T>)visitor).visitComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comp);
		try {
			setState(207);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191); match(VAR);
				setState(192); opComp();
				setState(193); match(VAR);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195); match(VAR);
				setState(196); opComp();
				setState(197); num();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(199); num();
				setState(200); opComp();
				setState(201); match(VAR);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(203); num();
				setState(204); opComp();
				setState(205); num();
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

	public static class OpCompContext extends ParserRuleContext {
		public OpCompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opComp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).enterOpComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCsharpListener ) ((miniCsharpListener)listener).exitOpComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniCsharpVisitor ) return ((miniCsharpVisitor<? extends T>)visitor).visitOpComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpCompContext opComp() throws RecognitionException {
		OpCompContext _localctx = new OpCompContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_opComp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << E) | (1L << OU) | (1L << EQLEQL) | (1L << DIF) | (1L << MAI) | (1L << MEN) | (1L << MENEQL) | (1L << MAIEQL) | (1L << NEG))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		public TerminalNode NUMF() { return getToken(miniCsharpParser.NUMF, 0); }
		public TerminalNode NUMI() { return getToken(miniCsharpParser.NUMI, 0); }
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
		enterRule(_localctx, 26, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_la = _input.LA(1);
			if ( !(_la==NUMF || _la==NUMI) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3*\u00d8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\61\n\3\3\4\3\4\3\4\5\4"+
		"\66\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5R\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6a\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7w\n\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0092\n\b\3\t\3\t\3\t\3\t\5\t\u0098\n\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00aa"+
		"\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\5\f\u00c0\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d2\n\r\3\16\3\16\3\17\3\17\3\17\2\20\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\2\5\3\2\r\21\4\2\22\23\32 \3\2\n\13"+
		"\u00e9\2\36\3\2\2\2\4\60\3\2\2\2\6\65\3\2\2\2\bQ\3\2\2\2\n`\3\2\2\2\f"+
		"v\3\2\2\2\16\u0091\3\2\2\2\20\u0097\3\2\2\2\22\u00a9\3\2\2\2\24\u00ab"+
		"\3\2\2\2\26\u00bf\3\2\2\2\30\u00d1\3\2\2\2\32\u00d3\3\2\2\2\34\u00d5\3"+
		"\2\2\2\36\37\7\3\2\2\37 \7\26\2\2 !\7\27\2\2!\"\7\24\2\2\"#\5\4\3\2#$"+
		"\7\25\2\2$\3\3\2\2\2%&\5\6\4\2&\'\7\30\2\2\'\61\3\2\2\2()\5\6\4\2)*\7"+
		"\30\2\2*+\5\4\3\2+\61\3\2\2\2,\61\5\f\7\2-.\5\f\7\2./\5\4\3\2/\61\3\2"+
		"\2\2\60%\3\2\2\2\60(\3\2\2\2\60,\3\2\2\2\60-\3\2\2\2\61\5\3\2\2\2\62\66"+
		"\5\b\5\2\63\66\5\n\6\2\64\66\5\16\b\2\65\62\3\2\2\2\65\63\3\2\2\2\65\64"+
		"\3\2\2\2\66\7\3\2\2\2\678\7\4\2\289\7\26\2\29:\5\34\17\2:;\7\27\2\2;R"+
		"\3\2\2\2<=\7\4\2\2=>\7\26\2\2>?\7\'\2\2?R\7\27\2\2@A\7\4\2\2AB\7\26\2"+
		"\2BC\7\f\2\2CR\7\27\2\2DE\7\4\2\2EF\7\26\2\2FG\7\'\2\2GH\7%\2\2HI\7\f"+
		"\2\2IR\7\27\2\2JK\7\4\2\2KL\7\26\2\2LM\7\'\2\2MN\7%\2\2NO\5\34\17\2OP"+
		"\7\27\2\2PR\3\2\2\2Q\67\3\2\2\2Q<\3\2\2\2Q@\3\2\2\2QD\3\2\2\2QJ\3\2\2"+
		"\2R\t\3\2\2\2ST\7\5\2\2TU\7\26\2\2UV\5\34\17\2VW\7\27\2\2Wa\3\2\2\2XY"+
		"\7\5\2\2YZ\7\26\2\2Z[\7\'\2\2[a\7\27\2\2\\]\7\5\2\2]^\7\26\2\2^_\7\f\2"+
		"\2_a\7\27\2\2`S\3\2\2\2`X\3\2\2\2`\\\3\2\2\2a\13\3\2\2\2bc\7\6\2\2cd\7"+
		"\26\2\2de\5\26\f\2ef\7\27\2\2fg\7\24\2\2gh\5\4\3\2hi\7\25\2\2iw\3\2\2"+
		"\2jk\7\6\2\2kl\7\26\2\2lm\5\26\f\2mn\7\27\2\2no\7\24\2\2op\5\4\3\2pq\7"+
		"\25\2\2qr\7\7\2\2rs\7\24\2\2st\5\4\3\2tu\7\25\2\2uw\3\2\2\2vb\3\2\2\2"+
		"vj\3\2\2\2w\r\3\2\2\2xy\7\f\2\2yz\7\31\2\2z\u0092\5\20\t\2{|\7\f\2\2|"+
		"}\7\31\2\2}\u0092\5\34\17\2~\177\7\f\2\2\177\u0080\7\31\2\2\u0080\u0092"+
		"\7\t\2\2\u0081\u0082\7\f\2\2\u0082\u0083\7\31\2\2\u0083\u0092\7\'\2\2"+
		"\u0084\u0085\7\f\2\2\u0085\u0086\7\31\2\2\u0086\u0092\7&\2\2\u0087\u0088"+
		"\7\f\2\2\u0088\u0092\7!\2\2\u0089\u008a\7\f\2\2\u008a\u0092\7\"\2\2\u008b"+
		"\u008c\7\f\2\2\u008c\u008d\7#\2\2\u008d\u0092\7\13\2\2\u008e\u008f\7\f"+
		"\2\2\u008f\u0090\7$\2\2\u0090\u0092\7\13\2\2\u0091x\3\2\2\2\u0091{\3\2"+
		"\2\2\u0091~\3\2\2\2\u0091\u0081\3\2\2\2\u0091\u0084\3\2\2\2\u0091\u0087"+
		"\3\2\2\2\u0091\u0089\3\2\2\2\u0091\u008b\3\2\2\2\u0091\u008e\3\2\2\2\u0092"+
		"\17\3\2\2\2\u0093\u0098\5\22\n\2\u0094\u0095\5\22\n\2\u0095\u0096\5\20"+
		"\t\2\u0096\u0098\3\2\2\2\u0097\u0093\3\2\2\2\u0097\u0094\3\2\2\2\u0098"+
		"\21\3\2\2\2\u0099\u009a\7\f\2\2\u009a\u009b\5\24\13\2\u009b\u009c\7\f"+
		"\2\2\u009c\u00aa\3\2\2\2\u009d\u009e\5\34\17\2\u009e\u009f\5\24\13\2\u009f"+
		"\u00a0\7\f\2\2\u00a0\u00aa\3\2\2\2\u00a1\u00a2\7\f\2\2\u00a2\u00a3\5\24"+
		"\13\2\u00a3\u00a4\5\34\17\2\u00a4\u00aa\3\2\2\2\u00a5\u00a6\5\34\17\2"+
		"\u00a6\u00a7\5\24\13\2\u00a7\u00a8\5\34\17\2\u00a8\u00aa\3\2\2\2\u00a9"+
		"\u0099\3\2\2\2\u00a9\u009d\3\2\2\2\u00a9\u00a1\3\2\2\2\u00a9\u00a5\3\2"+
		"\2\2\u00aa\23\3\2\2\2\u00ab\u00ac\t\2\2\2\u00ac\25\3\2\2\2\u00ad\u00c0"+
		"\5\30\r\2\u00ae\u00af\5\30\r\2\u00af\u00b0\5\32\16\2\u00b0\u00b1\5\26"+
		"\f\2\u00b1\u00c0\3\2\2\2\u00b2\u00b3\7\26\2\2\u00b3\u00b4\5\30\r\2\u00b4"+
		"\u00b5\7\27\2\2\u00b5\u00c0\3\2\2\2\u00b6\u00b7\7\26\2\2\u00b7\u00b8\5"+
		"\30\r\2\u00b8\u00b9\7\27\2\2\u00b9\u00ba\5\32\16\2\u00ba\u00bb\5\26\f"+
		"\2\u00bb\u00c0\3\2\2\2\u00bc\u00bd\7 \2\2\u00bd\u00c0\5\30\r\2\u00be\u00c0"+
		"\7\f\2\2\u00bf\u00ad\3\2\2\2\u00bf\u00ae\3\2\2\2\u00bf\u00b2\3\2\2\2\u00bf"+
		"\u00b6\3\2\2\2\u00bf\u00bc\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\27\3\2\2"+
		"\2\u00c1\u00c2\7\f\2\2\u00c2\u00c3\5\32\16\2\u00c3\u00c4\7\f\2\2\u00c4"+
		"\u00d2\3\2\2\2\u00c5\u00c6\7\f\2\2\u00c6\u00c7\5\32\16\2\u00c7\u00c8\5"+
		"\34\17\2\u00c8\u00d2\3\2\2\2\u00c9\u00ca\5\34\17\2\u00ca\u00cb\5\32\16"+
		"\2\u00cb\u00cc\7\f\2\2\u00cc\u00d2\3\2\2\2\u00cd\u00ce\5\34\17\2\u00ce"+
		"\u00cf\5\32\16\2\u00cf\u00d0\5\34\17\2\u00d0\u00d2\3\2\2\2\u00d1\u00c1"+
		"\3\2\2\2\u00d1\u00c5\3\2\2\2\u00d1\u00c9\3\2\2\2\u00d1\u00cd\3\2\2\2\u00d2"+
		"\31\3\2\2\2\u00d3\u00d4\t\3\2\2\u00d4\33\3\2\2\2\u00d5\u00d6\t\4\2\2\u00d6"+
		"\35\3\2\2\2\f\60\65Q`v\u0091\u0097\u00a9\u00bf\u00d1";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}