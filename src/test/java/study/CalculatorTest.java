package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import stringcalculator.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(4, calculator.calculate(2, '+', 2));
    }

    @Test
    public void testSubtract() {
        assertEquals(3, calculator.calculate(5, '-', 2));
    }

    @Test
    public void testMultiply() {
        assertEquals(10, calculator.calculate(5, '*', 2));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calculator.calculate(10, '/', 5));
    }
}