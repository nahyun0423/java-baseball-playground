package stringcalculator;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResultTest {
    Input input = new Input();
    Result stringResult = new Result();

    @Test
    public void testCalculateResult() {
        String inputString = "5-2*4";
        input.scan = new Scanner(inputString);

        int result = stringResult.calculateResult();

        assertEquals(12, result);
    }
}