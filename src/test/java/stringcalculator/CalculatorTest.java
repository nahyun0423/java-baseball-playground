package stringcalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();
    @Test
    public void add() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void sub() {
        assertEquals(5, calculator.sub(8, 3));
        assertEquals(-5, calculator.sub(3, 8));
    }

    @Test
    public void mul() {
        assertEquals(15, calculator.mul(5, 3));
    }

    @Test
    public void div() {
        assertEquals(5, calculator.div(15, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void divZeroArithmeticException() {
        calculator.div(10, 0);
    }
}