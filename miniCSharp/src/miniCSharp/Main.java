package miniCSharp;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.TokenSource;
import org.antlr.runtime.tree.TreeWizard.Visitor;
import org.antlr.v4.runtime.TokenStream;

import compiler.miniCSharp.com.miniCsharpBaseVisitor;
import compiler.miniCSharp.com.miniCsharpLexer;
import compiler.miniCSharp.com.miniCsharpParser;
import compiler.miniCSharp.com.miniCsharpVisitor;

public class Main {

	public static void main(String[] args) throws IOException{
			
		ANTLRFileStream input = new ANTLRFileStream("teste.mcs");
		miniCsharpLexer lexer = new miniCsharpLexer((org.antlr.v4.runtime.CharStream) input);
		CommonTokenStream tokens = new CommonTokenStream((TokenSource) lexer);
		miniCsharpParser parser = new miniCsharpParser((TokenStream) tokens);
		try{
			miniCsharpParser.McSHARPContext tree = parser.mcSHARP();
			miniCsharpVisitor<Object> visitor = new miniCsharpBaseVisitor<>();
			visitor.visit(tree);
		
		}catch(Exception e){
			
		}
		
		
	}

}
