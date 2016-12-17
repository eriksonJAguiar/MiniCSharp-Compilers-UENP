// Generated from D:\Documentos\github\MiniCSharp\antl\miniCsharp.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link miniCsharpParser}.
 */
public interface miniCsharpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link miniCsharpParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(@NotNull miniCsharpParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCsharpParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(@NotNull miniCsharpParser.OpContext ctx);

	/**
	 * Enter a parse tree produced by {@link miniCsharpParser#texto}.
	 * @param ctx the parse tree
	 */
	void enterTexto(@NotNull miniCsharpParser.TextoContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCsharpParser#texto}.
	 * @param ctx the parse tree
	 */
	void exitTexto(@NotNull miniCsharpParser.TextoContext ctx);

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
	 * Enter a parse tree produced by {@link miniCsharpParser#opl}.
	 * @param ctx the parse tree
	 */
	void enterOpl(@NotNull miniCsharpParser.OplContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCsharpParser#opl}.
	 * @param ctx the parse tree
	 */
	void exitOpl(@NotNull miniCsharpParser.OplContext ctx);

	/**
	 * Enter a parse tree produced by {@link miniCsharpParser#cmp}.
	 * @param ctx the parse tree
	 */
	void enterCmp(@NotNull miniCsharpParser.CmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCsharpParser#cmp}.
	 * @param ctx the parse tree
	 */
	void exitCmp(@NotNull miniCsharpParser.CmpContext ctx);

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
	 * Enter a parse tree produced by {@link miniCsharpParser#atr}.
	 * @param ctx the parse tree
	 */
	void enterAtr(@NotNull miniCsharpParser.AtrContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCsharpParser#atr}.
	 * @param ctx the parse tree
	 */
	void exitAtr(@NotNull miniCsharpParser.AtrContext ctx);

	/**
	 * Enter a parse tree produced by {@link miniCsharpParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(@NotNull miniCsharpParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCsharpParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(@NotNull miniCsharpParser.DeclaracaoContext ctx);

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
	 * Enter a parse tree produced by {@link miniCsharpParser#cf}.
	 * @param ctx the parse tree
	 */
	void enterCf(@NotNull miniCsharpParser.CfContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCsharpParser#cf}.
	 * @param ctx the parse tree
	 */
	void exitCf(@NotNull miniCsharpParser.CfContext ctx);
}