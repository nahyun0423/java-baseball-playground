package study;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    StringCalculator stringCalculator;


    @BeforeAll
    public void setUp() {
        stringCalculator = new StringCalculator();
    }


    @Test
    public void split() {
        String actual = "1 + 2 * 3";
        assertThat(stringCalculator.StringToArray(actual))
                .contains("1")
                .contains("+")
                .contains("2")
                .contains("*")
                .contains("3");
    }

    @Test
    public void makeResultTest() {
        int actual = stringCalculator.makeResult("1 + 2 * 3");
        assertThat(actual).isEqualTo(9);
    }
}
