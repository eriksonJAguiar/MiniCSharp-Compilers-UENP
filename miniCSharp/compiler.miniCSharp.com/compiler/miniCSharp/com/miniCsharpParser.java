// Generated from C:\Users\erikson\Desktop\MiniCSharp\miniCSharp\compiler.miniCSharp.com\compiler\miniCSharp\com\miniCsharp.g4 by ANTLR 4.1
package compiler.miniCSharp.com;
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
		public NumContext n;
		public Token t;
		public Token v;
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
				setState(55); ((LerContext)_localctx).n = num();
				setState(56); match(PAF);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58); match(READ);
				setState(59); match(PAA);
				setState(60); ((LerContext)_localctx).t = match(TEXTO);
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
				setState(68); ((LerContext)_localctx).t = match(TEXTO);
				setState(69); match(SEP);
				setState(70); ((LerContext)_localctx).v = match(VAR);
				setState(71); match(PAF);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(72); match(READ);
				setState(73); match(PAA);
				setState(74); ((LerContext)_localctx).t = match(TEXTO);
				setState(75); match(SEP);
				setState(76); ((LerContext)_localctx).n = num();
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
			setState(89);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81); match(WRITE);
				setState(82); match(PAA);
				setState(83); match(VAR);
				setState(84); match(PAF);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85); match(WRITE);
				setState(86); match(PAA);
				setState(87); match(TEXTO);
				setState(88); match(PAF);
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
			setState(111);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91); match(IF);
				setState(92); match(PAA);
				setState(93); cond();
				setState(94); match(PAF);
				setState(95); match(CHA);
				setState(96); codigo();
				setState(97); match(CHF);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99); match(IF);
				setState(100); match(PAA);
				setState(101); cond();
				setState(102); match(PAF);
				setState(103); match(CHA);
				setState(104); codigo();
				setState(105); match(CHF);
				setState(106); match(ELSE);
				setState(107); match(CHA);
				setState(108); codigo();
				setState(109); match(CHF);
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
		public Token v;
		public OperacaoContext op;
		public Token b;
		public Token t;
		public Token c;
		public TerminalNode VAR() { return getToken(miniCsharpParser.VAR, 0); }
		public TerminalNode CARACTER() { return getToken(miniCsharpParser.CARACTER, 0); }
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
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
			setState(128);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113); ((AtrContext)_localctx).v = match(VAR);
				setState(114); match(EQL);
				setState(115); ((AtrContext)_localctx).op = operacao();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116); ((AtrContext)_localctx).v = match(VAR);
				setState(117); match(EQL);
				setState(118); ((AtrContext)_localctx).b = match(B);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(119); ((AtrContext)_localctx).v = match(VAR);
				setState(120); match(EQL);
				setState(121); ((AtrContext)_localctx).t = match(TEXTO);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(122); ((AtrContext)_localctx).v = match(VAR);
				setState(123); match(EQL);
				setState(124); ((AtrContext)_localctx).c = match(CARACTER);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(125); match(VAR);
				setState(126); match(EQL);
				setState(127); num();
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
		public OperacaoAuxContext op1;
		public OperacaoAuxContext op2;
		public OperacaoContext opr;
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
			setState(134);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130); ((OperacaoContext)_localctx).op1 = operacaoAux();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131); ((OperacaoContext)_localctx).op2 = operacaoAux();
				setState(132); ((OperacaoContext)_localctx).opr = operacao();
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
		public Token v1;
		public OperadoresContext op;
		public Token v2;
		public NumContext n1;
		public NumContext n2;
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
			setState(148);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136); ((OperacaoAuxContext)_localctx).v1 = match(VAR);
				setState(137); ((OperacaoAuxContext)_localctx).op = operadores();
				setState(138); ((OperacaoAuxContext)_localctx).v2 = match(VAR);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140); ((OperacaoAuxContext)_localctx).n1 = num();
				setState(141); ((OperacaoAuxContext)_localctx).op = operadores();
				setState(142); ((OperacaoAuxContext)_localctx).v2 = match(VAR);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(144); ((OperacaoAuxContext)_localctx).n1 = num();
				setState(145); ((OperacaoAuxContext)_localctx).op = operadores();
				setState(146); ((OperacaoAuxContext)_localctx).n2 = num();
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
		public Token o1;
		public Token o2;
		public Token o3;
		public Token o4;
		public Token o5;
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
		try {
			setState(155);
			switch (_input.LA(1)) {
			case SOMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(150); ((OperadoresContext)_localctx).o1 = match(SOMA);
				}
				break;
			case MULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(151); ((OperadoresContext)_localctx).o2 = match(MULT);
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 3);
				{
				setState(152); ((OperadoresContext)_localctx).o3 = match(DIV);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(153); ((OperadoresContext)_localctx).o4 = match(SUB);
				}
				break;
			case REST:
				enterOuterAlt(_localctx, 5);
				{
				setState(154); ((OperadoresContext)_localctx).o5 = match(REST);
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
			setState(175);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157); comp();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158); comp();
				setState(159); opComp();
				setState(160); cond();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162); match(PAA);
				setState(163); comp();
				setState(164); match(PAF);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(166); match(PAA);
				setState(167); comp();
				setState(168); match(PAF);
				setState(169); opComp();
				setState(170); cond();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(172); match(NEG);
				setState(173); comp();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(174); match(VAR);
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
		public Boolean valor;
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
			setState(193);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177); match(VAR);
				setState(178); opComp();
				setState(179); match(VAR);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181); match(VAR);
				setState(182); opComp();
				setState(183); num();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(185); num();
				setState(186); opComp();
				setState(187); match(VAR);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(189); num();
				setState(190); opComp();
				setState(191); num();
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
			setState(195);
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
		public Token n1;
		public Token n2;
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
		try {
			setState(199);
			switch (_input.LA(1)) {
			case NUMF:
				enterOuterAlt(_localctx, 1);
				{
				setState(197); ((NumContext)_localctx).n1 = match(NUMF);
				}
				break;
			case NUMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(198); ((NumContext)_localctx).n2 = match(NUMI);
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3*\u00cc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\61\n\3\3\4\3\4\3\4\5\4"+
		"\66\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5R\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6\\\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7r\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0083\n\b\3\t\3\t\3\t\3\t\5\t\u0089"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0097\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u009e\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b2\n\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c4\n\r\3\16\3\16"+
		"\3\17\3\17\5\17\u00ca\n\17\3\17\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\2\3\4\2\22\23\32 \u00dc\2\36\3\2\2\2\4\60\3\2\2\2\6\65\3\2\2\2\bQ"+
		"\3\2\2\2\n[\3\2\2\2\fq\3\2\2\2\16\u0082\3\2\2\2\20\u0088\3\2\2\2\22\u0096"+
		"\3\2\2\2\24\u009d\3\2\2\2\26\u00b1\3\2\2\2\30\u00c3\3\2\2\2\32\u00c5\3"+
		"\2\2\2\34\u00c9\3\2\2\2\36\37\7\3\2\2\37 \7\26\2\2 !\7\27\2\2!\"\7\24"+
		"\2\2\"#\5\4\3\2#$\7\25\2\2$\3\3\2\2\2%&\5\6\4\2&\'\7\30\2\2\'\61\3\2\2"+
		"\2()\5\6\4\2)*\7\30\2\2*+\5\4\3\2+\61\3\2\2\2,\61\5\f\7\2-.\5\f\7\2./"+
		"\5\4\3\2/\61\3\2\2\2\60%\3\2\2\2\60(\3\2\2\2\60,\3\2\2\2\60-\3\2\2\2\61"+
		"\5\3\2\2\2\62\66\5\b\5\2\63\66\5\n\6\2\64\66\5\16\b\2\65\62\3\2\2\2\65"+
		"\63\3\2\2\2\65\64\3\2\2\2\66\7\3\2\2\2\678\7\4\2\289\7\26\2\29:\5\34\17"+
		"\2:;\7\27\2\2;R\3\2\2\2<=\7\4\2\2=>\7\26\2\2>?\7\'\2\2?R\7\27\2\2@A\7"+
		"\4\2\2AB\7\26\2\2BC\7\f\2\2CR\7\27\2\2DE\7\4\2\2EF\7\26\2\2FG\7\'\2\2"+
		"GH\7%\2\2HI\7\f\2\2IR\7\27\2\2JK\7\4\2\2KL\7\26\2\2LM\7\'\2\2MN\7%\2\2"+
		"NO\5\34\17\2OP\7\27\2\2PR\3\2\2\2Q\67\3\2\2\2Q<\3\2\2\2Q@\3\2\2\2QD\3"+
		"\2\2\2QJ\3\2\2\2R\t\3\2\2\2ST\7\5\2\2TU\7\26\2\2UV\7\f\2\2V\\\7\27\2\2"+
		"WX\7\5\2\2XY\7\26\2\2YZ\7\'\2\2Z\\\7\27\2\2[S\3\2\2\2[W\3\2\2\2\\\13\3"+
		"\2\2\2]^\7\6\2\2^_\7\26\2\2_`\5\26\f\2`a\7\27\2\2ab\7\24\2\2bc\5\4\3\2"+
		"cd\7\25\2\2dr\3\2\2\2ef\7\6\2\2fg\7\26\2\2gh\5\26\f\2hi\7\27\2\2ij\7\24"+
		"\2\2jk\5\4\3\2kl\7\25\2\2lm\7\7\2\2mn\7\24\2\2no\5\4\3\2op\7\25\2\2pr"+
		"\3\2\2\2q]\3\2\2\2qe\3\2\2\2r\r\3\2\2\2st\7\f\2\2tu\7\31\2\2u\u0083\5"+
		"\20\t\2vw\7\f\2\2wx\7\31\2\2x\u0083\7\t\2\2yz\7\f\2\2z{\7\31\2\2{\u0083"+
		"\7\'\2\2|}\7\f\2\2}~\7\31\2\2~\u0083\7&\2\2\177\u0080\7\f\2\2\u0080\u0081"+
		"\7\31\2\2\u0081\u0083\5\34\17\2\u0082s\3\2\2\2\u0082v\3\2\2\2\u0082y\3"+
		"\2\2\2\u0082|\3\2\2\2\u0082\177\3\2\2\2\u0083\17\3\2\2\2\u0084\u0089\5"+
		"\22\n\2\u0085\u0086\5\22\n\2\u0086\u0087\5\20\t\2\u0087\u0089\3\2\2\2"+
		"\u0088\u0084\3\2\2\2\u0088\u0085\3\2\2\2\u0089\21\3\2\2\2\u008a\u008b"+
		"\7\f\2\2\u008b\u008c\5\24\13\2\u008c\u008d\7\f\2\2\u008d\u0097\3\2\2\2"+
		"\u008e\u008f\5\34\17\2\u008f\u0090\5\24\13\2\u0090\u0091\7\f\2\2\u0091"+
		"\u0097\3\2\2\2\u0092\u0093\5\34\17\2\u0093\u0094\5\24\13\2\u0094\u0095"+
		"\5\34\17\2\u0095\u0097\3\2\2\2\u0096\u008a\3\2\2\2\u0096\u008e\3\2\2\2"+
		"\u0096\u0092\3\2\2\2\u0097\23\3\2\2\2\u0098\u009e\7\r\2\2\u0099\u009e"+
		"\7\20\2\2\u009a\u009e\7\17\2\2\u009b\u009e\7\16\2\2\u009c\u009e\7\21\2"+
		"\2\u009d\u0098\3\2\2\2\u009d\u0099\3\2\2\2\u009d\u009a\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009d\u009c\3\2\2\2\u009e\25\3\2\2\2\u009f\u00b2\5\30\r\2\u00a0"+
		"\u00a1\5\30\r\2\u00a1\u00a2\5\32\16\2\u00a2\u00a3\5\26\f\2\u00a3\u00b2"+
		"\3\2\2\2\u00a4\u00a5\7\26\2\2\u00a5\u00a6\5\30\r\2\u00a6\u00a7\7\27\2"+
		"\2\u00a7\u00b2\3\2\2\2\u00a8\u00a9\7\26\2\2\u00a9\u00aa\5\30\r\2\u00aa"+
		"\u00ab\7\27\2\2\u00ab\u00ac\5\32\16\2\u00ac\u00ad\5\26\f\2\u00ad\u00b2"+
		"\3\2\2\2\u00ae\u00af\7 \2\2\u00af\u00b2\5\30\r\2\u00b0\u00b2\7\f\2\2\u00b1"+
		"\u009f\3\2\2\2\u00b1\u00a0\3\2\2\2\u00b1\u00a4\3\2\2\2\u00b1\u00a8\3\2"+
		"\2\2\u00b1\u00ae\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\27\3\2\2\2\u00b3\u00b4"+
		"\7\f\2\2\u00b4\u00b5\5\32\16\2\u00b5\u00b6\7\f\2\2\u00b6\u00c4\3\2\2\2"+
		"\u00b7\u00b8\7\f\2\2\u00b8\u00b9\5\32\16\2\u00b9\u00ba\5\34\17\2\u00ba"+
		"\u00c4\3\2\2\2\u00bb\u00bc\5\34\17\2\u00bc\u00bd\5\32\16\2\u00bd\u00be"+
		"\7\f\2\2\u00be\u00c4\3\2\2\2\u00bf\u00c0\5\34\17\2\u00c0\u00c1\5\32\16"+
		"\2\u00c1\u00c2\5\34\17\2\u00c2\u00c4\3\2\2\2\u00c3\u00b3\3\2\2\2\u00c3"+
		"\u00b7\3\2\2\2\u00c3\u00bb\3\2\2\2\u00c3\u00bf\3\2\2\2\u00c4\31\3\2\2"+
		"\2\u00c5\u00c6\t\2\2\2\u00c6\33\3\2\2\2\u00c7\u00ca\7\n\2\2\u00c8\u00ca"+
		"\7\13\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\35\3\2\2\2\16"+
		"\60\65Q[q\u0082\u0088\u0096\u009d\u00b1\u00c3\u00c9";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}