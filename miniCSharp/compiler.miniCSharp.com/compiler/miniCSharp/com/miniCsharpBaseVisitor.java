// Generated from C:\Users\erikson\Desktop\MiniCSharp\miniCSharp\compiler.miniCSharp.com\compiler\miniCSharp\com\miniCsharp.g4 by ANTLR 4.1
package compiler.miniCSharp.com;
import org.antlr.runtime.tree.TreeWizard.Visitor;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link miniCsharpVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class miniCsharpBaseVisitor<Object> extends AbstractParseTreeVisitor<Object> implements miniCsharpVisitor<Object> {
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public Object visitOperacaoAux(@NotNull miniCsharpParser.OperacaoAuxContext ctx) { 
		return visitChildren(ctx); 
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public Object visitComp(@NotNull miniCsharpParser.CompContext ctx) { 
		return visitChildren(ctx); 
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public Object visitCodigo(@NotNull miniCsharpParser.CodigoContext ctx) { 
		return visitChildren(ctx); 
		
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public Object visitCf(@NotNull miniCsharpParser.CfContext ctx) { 
		return visitChildren(ctx); 
		
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public Object visitOperadores(@NotNull miniCsharpParser.OperadoresContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public Object visitOpComp(@NotNull miniCsharpParser.OpCompContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public Object visitNum(@NotNull miniCsharpParser.NumContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public Object visitCond(@NotNull miniCsharpParser.CondContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public Object visitEscrever(@NotNull miniCsharpParser.EscreverContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public Object visitOperacao(@NotNull miniCsharpParser.OperacaoContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public Object visitLer(@NotNull miniCsharpParser.LerContext ctx) { 
		
		if(ctx.n != null){
			System.out.println(ctx.n.getText());
		}
		else if(ctx.t != null){
			System.out.println(ctx.t.getText());
		}
		else if(ctx.VAR() != null){
			System.out.println(ctx.VAR().getText());
		}
		
		
		
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public Object visitCmd(@NotNull miniCsharpParser.CmdContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public Object visitMcSHARP(@NotNull miniCsharpParser.McSHARPContext ctx) { 
		return this.visitChildren(ctx.codigo()); 
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public Object visitAtr(@NotNull miniCsharpParser.AtrContext ctx) { return visitChildren(ctx); }
}