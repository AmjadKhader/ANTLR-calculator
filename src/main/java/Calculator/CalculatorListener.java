package Calculator;

import antlr.CalculatorParserBaseListener;
import antlr.CalculatorParserParser;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CalculatorListener extends CalculatorParserBaseListener {

    Map<String, String> calculatorMap = new HashMap<>();
    String FIRST_NUM = "FIRST";
    String SECOND_NUM = "SECOND";
    String OPERATION = "OPERATION";

    @Override
    public void exitMain_rule(CalculatorParserParser.Main_ruleContext ctx) {
        if (Objects.nonNull(ctx.first_number()) && Objects.nonNull(ctx.first_number().number_rule())) {
            String first = "";

            if (Objects.nonNull(ctx.first_number().number_rule().number1())) {
                first = CalculatorParserParser.tokenNames[ctx.first_number().number_rule().number1().num().stop.getType()];
            }
            if (Objects.nonNull(ctx.first_number().number_rule().number2())) {
                first += "." + CalculatorParserParser.tokenNames[ctx.first_number().number_rule().number2().num().stop.getType()];
            }
            calculatorMap.put(FIRST_NUM, first);
        }
        if (Objects.nonNull(ctx.second_number()) && Objects.nonNull(ctx.second_number().number_rule())) {
            String second = "";

            if (Objects.nonNull(ctx.second_number().number_rule().number1())) {
                second = CalculatorParserParser.tokenNames[ctx.second_number().number_rule().number1().num().stop.getType()];
            }
            if (Objects.nonNull(ctx.second_number().number_rule().number2())) {
                second += "." + CalculatorParserParser.tokenNames[ctx.second_number().number_rule().number2().num().stop.getType()];
            }

            calculatorMap.put(SECOND_NUM, second);
        }
        if (Objects.nonNull(ctx.process())) {
            calculatorMap.put(OPERATION, CalculatorParserParser.tokenNames[ctx.process().stop.getType()]);
        }
    }


    public Map<String, String> getResult() {
        return calculatorMap;
    }
}
