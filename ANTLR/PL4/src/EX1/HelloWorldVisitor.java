package EX1;// Generated from C:/Users/0941p/OneDrive/Ambiente de Trabalho/ISEP/ISEP_2�ano/2�Semestre/LPROG/ANTLR/PL4/src/EX1\HelloWorld.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HelloWorldParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HelloWorldVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HelloWorldParser#helloWorld}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHelloWorld(HelloWorldParser.HelloWorldContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloWorldParser#sentences}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentences(HelloWorldParser.SentencesContext ctx);
}