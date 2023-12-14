package stringcalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class OperatorTest {

    Operator oper = new Operator();

    @Test
    public void operateAdd() {
        assertEquals(5, oper.operate(2, "+", 3));
    }

    @Test
    public void operateSub() {
        assertEquals(2, oper.operate(5, "-", 3));
    }

    @Test
    public void operateMul() {
        assertEquals(15, oper.operate(3, "*", 5));
    }

    @Test
    public void operateDiv() {
        assertEquals(2, oper.operate(6, "/", 3));
    }

    @Test
    public void isOperator() {
        assertFalse(oper.isOperator("#"));
    }

}