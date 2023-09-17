package EX1;// Generated from C:/Users/0941p/OneDrive/Ambiente de Trabalho/ISEP/ISEP_2�ano/2�Semestre/LPROG/ANTLR/PL4/src/EX1\HelloWorld.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloWorldParser}.
 */
public interface HelloWorldListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloWorldParser#helloWorld}.
	 * @param ctx the parse tree
	 */
	void enterHelloWorld(HelloWorldParser.HelloWorldContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloWorldParser#helloWorld}.
	 * @param ctx the parse tree
	 */
	void exitHelloWorld(HelloWorldParser.HelloWorldContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloWorldParser#sentences}.
	 * @param ctx the parse tree
	 */
	void enterSentences(HelloWorldParser.SentencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloWorldParser#sentences}.
	 * @param ctx the parse tree
	 */
	void exitSentences(HelloWorldParser.SentencesContext ctx);
}