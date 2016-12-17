// Generated from D:\Documentos\github\MiniCSharp\antl\miniCsharp.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link miniCsharpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface miniCsharpVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link miniCsharpParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(@NotNull miniCsharpParser.OpContext ctx);

	/**
	 * Visit a parse tree produced by {@link miniCsharpParser#texto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexto(@NotNull miniCsharpParser.TextoContext ctx);

	/**
	 * Visit a parse tree produced by {@link miniCsharpParser#ler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLer(@NotNull miniCsharpParser.LerContext ctx);

	/**
	 * Visit a parse tree produced by {@link miniCsharpParser#opl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpl(@NotNull miniCsharpParser.OplContext ctx);

	/**
	 * Visit a parse tree produced by {@link miniCsharpParser#cmp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmp(@NotNull miniCsharpParser.CmpContext ctx);

	/**
	 * Visit a parse tree produced by {@link miniCsharpParser#codigo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodigo(@NotNull miniCsharpParser.CodigoContext ctx);

	/**
	 * Visit a parse tree produced by {@link miniCsharpParser#mcSHARP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMcSHARP(@NotNull miniCsharpParser.McSHARPContext ctx);

	/**
	 * Visit a parse tree produced by {@link miniCsharpParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(@NotNull miniCsharpParser.NumContext ctx);

	/**
	 * Visit a parse tree produced by {@link miniCsharpParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(@NotNull miniCsharpParser.CmdContext ctx);

	/**
	 * Visit a parse tree produced by {@link miniCsharpParser#atr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtr(@NotNull miniCsharpParser.AtrContext ctx);

	/**
	 * Visit a parse tree produced by {@link miniCsharpParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(@NotNull miniCsharpParser.DeclaracaoContext ctx);

	/**
	 * Visit a parse tree produced by {@link miniCsharpParser#escrever}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscrever(@NotNull miniCsharpParser.EscreverContext ctx);

	/**
	 * Visit a parse tree produced by {@link miniCsharpParser#cf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCf(@NotNull miniCsharpParser.CfContext ctx);
}