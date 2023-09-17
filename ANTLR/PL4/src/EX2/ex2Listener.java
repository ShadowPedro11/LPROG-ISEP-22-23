// Generated from C:/Users/0941p/OneDrive/Ambiente de Trabalho/ISEP/ISEP_2�ano/2�Semestre/LPROG/ANTLR/PL4/src/EX2\ex2.g4 by ANTLR 4.12.0
package EX2;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ex2Parser}.
 */
public interface ex2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ex2Parser#ex}.
	 * @param ctx the parse tree
	 */
	void enterEx(ex2Parser.ExContext ctx);
	/**
	 * Exit a parse tree produced by {@link ex2Parser#ex}.
	 * @param ctx the parse tree
	 */
	void exitEx(ex2Parser.ExContext ctx);
	/**
	 * Enter a parse tree produced by {@link ex2Parser#coisas}.
	 * @param ctx the parse tree
	 */
	void enterCoisas(ex2Parser.CoisasContext ctx);
	/**
	 * Exit a parse tree produced by {@link ex2Parser#coisas}.
	 * @param ctx the parse tree
	 */
	void exitCoisas(ex2Parser.CoisasContext ctx);
}