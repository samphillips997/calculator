import calculator.Calculator;
import junit.framework.*;

import java.util.Scanner;

public class TestCalculator extends TestCase {
    public Calculator calculator;


    public void testAdd() {
        calculator = new Calculator(new Scanner(System.in));
    }

}
