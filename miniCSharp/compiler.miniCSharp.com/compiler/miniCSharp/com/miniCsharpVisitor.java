// Generated from C:\Users\erikson\Desktop\MiniCSharp\miniCSharp\compiler.miniCSharp.com\compiler\miniCSharp\com\miniCsharp.g4 by ANTLR 4.1
package compiler.miniCSharp.com;
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
	 * Visit a parse tree produced by {@link miniCsharpParser#operacaoAux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacaoAux(@NotNull miniCsharpParser.OperacaoAuxContext ctx);

	/**
	 * Visit a parse tree produced by {@link miniCsharpParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(@NotNull miniCsharpParser.CompContext ctx);

	/**
	 * Visit a parse tree produced by {@link miniCsharpParser#codigo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodigo(@NotNull miniCsharpParser.CodigoContext ctx);

	/**
	 * Visit a parse tree produced by {@link miniCsharpParser#cf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCf(@NotNull miniCsharpParser.CfContext ctx);

	/**
	 * Visit a parse tree produced by {@link miniCsharpParser#operadores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadores(@NotNull miniCsharpParser.OperadoresContext ctx);

	/**
	 * Visit a parse tree produced by {@link miniCsharpParser#opComp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpComp(@NotNull miniCsharpParser.OpCompContext ctx);

	/**
	 * Visit a parse tree produced by {@link miniCsharpParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(@NotNull miniCsharpParser.NumContext ctx);

	/**
	 * Visit a parse tree produced by {@link miniCsharpParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(@NotNull miniCsharpParser.CondContext ctx);

	/**
	 * Visit a parse tree produced by {@link miniCsharpParser#escrever}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscrever(@NotNull miniCsharpParser.EscreverContext ctx);

	/**
	 * Visit a parse tree produced by {@link miniCsharpParser#operacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacao(@NotNull miniCsharpParser.OperacaoContext ctx);

	/**
	 * Visit a parse tree produced by {@link miniCsharpParser#ler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLer(@NotNull miniCsharpParser.LerContext ctx);

	/**
	 * Visit a parse tree produced by {@link miniCsharpParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(@NotNull miniCsharpParser.CmdContext ctx);

	/**
	 * Visit a parse tree produced by {@link miniCsharpParser#mcSHARP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMcSHARP(@NotNull miniCsharpParser.McSHARPContext ctx);

	/**
	 * Visit a parse tree produced by {@link miniCsharpParser#atr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtr(@NotNull miniCsharpParser.AtrContext ctx);
}