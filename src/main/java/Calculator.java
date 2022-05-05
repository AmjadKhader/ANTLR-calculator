import antlr.CalculatorLexer;
import antlr.CalculatorParserParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import Calculator.CalculatorListener;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class Calculator {

    public static Map<String, String> calculate(String statement) throws IOException {
        InputStream stream = new ByteArrayInputStream(statement.getBytes(StandardCharsets.UTF_8));

        CalculatorLexer lexer = new CalculatorLexer(CharStreams.fromStream(stream));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        CalculatorParserParser parser = new CalculatorParserParser(tokens);

        ParseTree tree = parser.calculator();
        CalculatorListener listener = new CalculatorListener();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);

        return listener.getResult();
    }
}
