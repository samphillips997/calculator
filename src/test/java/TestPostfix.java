import calculator.Postfix;
import org.junit.Test;

import java.math.BigInteger;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TestPostfix {
    @Test
    public void testConvertToPostfix() {
        Postfix postfix = new Postfix();

        String postfixExpression = "2 2 10 10 * * + 2 /";
        var expressionArray = Arrays.asList(postfixExpression.split(" "));

        assertEquals(expressionArray, postfix.convertToPostfix("(2+2*(10*10))/2"));
    }

    @Test
    public void testCalculatePostfixComplex() {
        Postfix postfix = new Postfix();
        assertEquals(new BigInteger("101"), postfix.calculatePostfix("(2+2*(10*10))/2"));
    }
}
