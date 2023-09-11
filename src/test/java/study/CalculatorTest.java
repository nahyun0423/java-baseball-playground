package study;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {
    StringCalculator stringCalculator;
    Calculator calculator;

    @BeforeAll
    public void setUp() {
        stringCalculator = new StringCalculator();
        calculator = new Calculator();
    }


    @Test
    public void split() {
        String actual = "1 + 2 * 3";
        assertThat(calculator.StringToArray(actual))
                .contains("1")
                .contains("+")
                .contains("2")
                .contains("*")
                .contains("3");
    }

    @Test
    public void makeResultTest() {
        int actual = calculator.makeResult("1 + 2 * 3");
        assertThat(actual).isEqualTo(9);
    }
}
