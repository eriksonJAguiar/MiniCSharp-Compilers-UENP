// Generated from C:\Users\erikson\Desktop\MiniCSharp\miniCSharp\compiler.miniCSharp.com\compiler\miniCSharp\com\miniCsharp.g4 by ANTLR 4.1
package compiler.miniCSharp.com;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link miniCsharpParser}.
 */
public interface miniCsharpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link miniCsharpParser#operacaoAux}.
	 * @param ctx the parse tree
	 */
	void enterOperacaoAux(@NotNull miniCsharpParser.OperacaoAuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCsharpParser#operacaoAux}.
	 * @param ctx the parse tree
	 */
	void exitOperacaoAux(@NotNull miniCsharpParser.OperacaoAuxContext ctx);

	/**
	 * Enter a parse tree produced by {@link miniCsharpParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(@NotNull miniCsharpParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCsharpParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(@NotNull miniCsharpParser.CompContext ctx);

	/**
	 * Enter a parse tree produced by {@link miniCsharpParser#codigo}.
	 * @param ctx the parse tree
	 */
	void enterCodigo(@NotNull miniCsharpParser.CodigoContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCsharpParser#codigo}.
	 * @param ctx the parse tree
	 */
	void exitCodigo(@NotNull miniCsharpParser.CodigoContext ctx);

	/**
	 * Enter a parse tree produced by {@link miniCsharpParser#cf}.
	 * @param ctx the parse tree
	 */
	void enterCf(@NotNull miniCsharpParser.CfContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCsharpParser#cf}.
	 * @param ctx the parse tree
	 */
	void exitCf(@NotNull miniCsharpParser.CfContext ctx);

	/**
	 * Enter a parse tree produced by {@link miniCsharpParser#operadores}.
	 * @param ctx the parse tree
	 */
	void enterOperadores(@NotNull miniCsharpParser.OperadoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCsharpParser#operadores}.
	 * @param ctx the parse tree
	 */
	void exitOperadores(@NotNull miniCsharpParser.OperadoresContext ctx);

	/**
	 * Enter a parse tree produced by {@link miniCsharpParser#opComp}.
	 * @param ctx the parse tree
	 */
	void enterOpComp(@NotNull miniCsharpParser.OpCompContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCsharpParser#opComp}.
	 * @param ctx the parse tree
	 */
	void exitOpComp(@NotNull miniCsharpParser.OpCompContext ctx);

	/**
	 * Enter a parse tree produced by {@link miniCsharpParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(@NotNull miniCsharpParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCsharpParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(@NotNull miniCsharpParser.NumContext ctx);

	/**
	 * Enter a parse tree produced by {@link miniCsharpParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(@NotNull miniCsharpParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCsharpParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(@NotNull miniCsharpParser.CondContext ctx);

	/**
	 * Enter a parse tree produced by {@link miniCsharpParser#escrever}.
	 * @param ctx the parse tree
	 */
	void enterEscrever(@NotNull miniCsharpParser.EscreverContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCsharpParser#escrever}.
	 * @param ctx the parse tree
	 */
	void exitEscrever(@NotNull miniCsharpParser.EscreverContext ctx);

	/**
	 * Enter a parse tree produced by {@link miniCsharpParser#operacao}.
	 * @param ctx the parse tree
	 */
	void enterOperacao(@NotNull miniCsharpParser.OperacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCsharpParser#operacao}.
	 * @param ctx the parse tree
	 */
	void exitOperacao(@NotNull miniCsharpParser.OperacaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link miniCsharpParser#ler}.
	 * @param ctx the parse tree
	 */
	void enterLer(@NotNull miniCsharpParser.LerContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCsharpParser#ler}.
	 * @param ctx the parse tree
	 */
	void exitLer(@NotNull miniCsharpParser.LerContext ctx);

	/**
	 * Enter a parse tree produced by {@link miniCsharpParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(@NotNull miniCsharpParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCsharpParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(@NotNull miniCsharpParser.CmdContext ctx);

	/**
	 * Enter a parse tree produced by {@link miniCsharpParser#mcSHARP}.
	 * @param ctx the parse tree
	 */
	void enterMcSHARP(@NotNull miniCsharpParser.McSHARPContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCsharpParser#mcSHARP}.
	 * @param ctx the parse tree
	 */
	void exitMcSHARP(@NotNull miniCsharpParser.McSHARPContext ctx);

	/**
	 * Enter a parse tree produced by {@link miniCsharpParser#atr}.
	 * @param ctx the parse tree
	 */
	void enterAtr(@NotNull miniCsharpParser.AtrContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCsharpParser#atr}.
	 * @param ctx the parse tree
	 */
	void exitAtr(@NotNull miniCsharpParser.AtrContext ctx);
}