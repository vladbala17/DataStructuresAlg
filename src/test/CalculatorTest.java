package test;

import junit.framework.TestCase;
import main.Session01.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class CalculatorTest extends TestCase {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(3, 4);

        assertEquals(7, result);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(3, 4);

        assertEquals(-1, result);
    }

    public void testMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(3, 4);

        assertEquals(12, result);
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(8, 4);

        assertEquals(2, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideBy0() {
        Calculator calculator = new Calculator();
        calculator.divide(8, 0);
    }
}