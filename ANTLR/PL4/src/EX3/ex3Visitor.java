// Generated from C:/Users/0941p/OneDrive/Ambiente de Trabalho/ISEP/ISEP_2ºano/2ºSemestre/LPROG/ANTLR/PL4/src/EX3\ex3.g4 by ANTLR 4.12.0
package EX3;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ex3Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ex3Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ex3Parser#ex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEx(ex3Parser.ExContext ctx);
	/**
	 * Visit a parse tree produced by {@link ex3Parser#coisas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoisas(ex3Parser.CoisasContext ctx);
	/**
	 * Visit a parse tree produced by {@link ex3Parser#other}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther(ex3Parser.OtherContext ctx);
	/**
	 * Visit a parse tree produced by {@link ex3Parser#comparable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparable(ex3Parser.ComparableContext ctx);
}