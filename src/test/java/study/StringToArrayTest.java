package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import stringcalculator.StringToArray;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringToArrayTest {
    StringToArray stringToArray;

    @BeforeEach
    public void setUp() {
        stringToArray = new StringToArray();
    }

    @Test
    public void testToArray() {
        String[] result = stringToArray.toArray("1 + 2 * 3");
        assertArrayEquals(new String[]{"1", "+", "2", "*", "3"}, result);
    }

    @Test
    public void testToInt() {
        int result = stringToArray.toInt("42");
        assertEquals(42, result);
    }
}
