// Generated from C:/Users/0941p/OneDrive/Ambiente de Trabalho/ISEP/ISEP_2ºano/2ºSemestre/LPROG/ANTLR/PL4/src/EX3\ex3.g4 by ANTLR 4.12.0
package EX3;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ex3Parser}.
 */
public interface ex3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ex3Parser#ex}.
	 * @param ctx the parse tree
	 */
	void enterEx(ex3Parser.ExContext ctx);
	/**
	 * Exit a parse tree produced by {@link ex3Parser#ex}.
	 * @param ctx the parse tree
	 */
	void exitEx(ex3Parser.ExContext ctx);
	/**
	 * Enter a parse tree produced by {@link ex3Parser#coisas}.
	 * @param ctx the parse tree
	 */
	void enterCoisas(ex3Parser.CoisasContext ctx);
	/**
	 * Exit a parse tree produced by {@link ex3Parser#coisas}.
	 * @param ctx the parse tree
	 */
	void exitCoisas(ex3Parser.CoisasContext ctx);
	/**
	 * Enter a parse tree produced by {@link ex3Parser#other}.
	 * @param ctx the parse tree
	 */
	void enterOther(ex3Parser.OtherContext ctx);
	/**
	 * Exit a parse tree produced by {@link ex3Parser#other}.
	 * @param ctx the parse tree
	 */
	void exitOther(ex3Parser.OtherContext ctx);
	/**
	 * Enter a parse tree produced by {@link ex3Parser#comparable}.
	 * @param ctx the parse tree
	 */
	void enterComparable(ex3Parser.ComparableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ex3Parser#comparable}.
	 * @param ctx the parse tree
	 */
	void exitComparable(ex3Parser.ComparableContext ctx);
}