// Generated from /Users/amjad/IdeaProjects/ANTLR-demo/src/main/java/antlr/CalculatorParser.g4 by ANTLR 4.10.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParserParser}.
 */
public interface CalculatorParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code main_rule}
	 * labeled alternative in {@link CalculatorParserParser#calculator}.
	 * @param ctx the parse tree
	 */
	void enterMain_rule(CalculatorParserParser.Main_ruleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code main_rule}
	 * labeled alternative in {@link CalculatorParserParser#calculator}.
	 * @param ctx the parse tree
	 */
	void exitMain_rule(CalculatorParserParser.Main_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParserParser#first_number}.
	 * @param ctx the parse tree
	 */
	void enterFirst_number(CalculatorParserParser.First_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParserParser#first_number}.
	 * @param ctx the parse tree
	 */
	void exitFirst_number(CalculatorParserParser.First_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParserParser#second_number}.
	 * @param ctx the parse tree
	 */
	void enterSecond_number(CalculatorParserParser.Second_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParserParser#second_number}.
	 * @param ctx the parse tree
	 */
	void exitSecond_number(CalculatorParserParser.Second_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParserParser#number_rule}.
	 * @param ctx the parse tree
	 */
	void enterNumber_rule(CalculatorParserParser.Number_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParserParser#number_rule}.
	 * @param ctx the parse tree
	 */
	void exitNumber_rule(CalculatorParserParser.Number_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParserParser#number1}.
	 * @param ctx the parse tree
	 */
	void enterNumber1(CalculatorParserParser.Number1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParserParser#number1}.
	 * @param ctx the parse tree
	 */
	void exitNumber1(CalculatorParserParser.Number1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParserParser#number2}.
	 * @param ctx the parse tree
	 */
	void enterNumber2(CalculatorParserParser.Number2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParserParser#number2}.
	 * @param ctx the parse tree
	 */
	void exitNumber2(CalculatorParserParser.Number2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParserParser#process}.
	 * @param ctx the parse tree
	 */
	void enterProcess(CalculatorParserParser.ProcessContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParserParser#process}.
	 * @param ctx the parse tree
	 */
	void exitProcess(CalculatorParserParser.ProcessContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParserParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(CalculatorParserParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParserParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(CalculatorParserParser.NumContext ctx);
}