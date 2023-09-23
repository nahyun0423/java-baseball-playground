package study;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import stringcalculator.Result;

public class ResultTest {
    Result result;

    @BeforeEach
    public void setUp() {
        result = new Result();
    }

    @Test
    public void testGetResult() {
        String[] input = {"2", "+", "3", "*", "4"};
        int expectedResult = 14;
        int actualResult = result.getResult(input);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMakeResult() {
        String input = "2 + 3 * 4";
        int expectedResult = 14;
        int actualResult = result.makeResult(input);
        assertEquals(expectedResult, actualResult);
    }
}