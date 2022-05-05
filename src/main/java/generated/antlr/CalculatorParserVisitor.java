// Generated from /Users/amjad/IdeaProjects/ANTLR-demo/src/main/java/antlr/CalculatorParser.g4 by ANTLR 4.10.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculatorParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculatorParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code main_rule}
	 * labeled alternative in {@link CalculatorParserParser#calculator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_rule(CalculatorParserParser.Main_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParserParser#first_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst_number(CalculatorParserParser.First_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParserParser#second_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecond_number(CalculatorParserParser.Second_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParserParser#number_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_rule(CalculatorParserParser.Number_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParserParser#number1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber1(CalculatorParserParser.Number1Context ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParserParser#number2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber2(CalculatorParserParser.Number2Context ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParserParser#process}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcess(CalculatorParserParser.ProcessContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParserParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(CalculatorParserParser.NumContext ctx);
}