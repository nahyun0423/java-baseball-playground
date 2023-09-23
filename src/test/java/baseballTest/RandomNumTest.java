package baseballTest;

import numBaseball.RandomNum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RandomNumTest {
     RandomNum randomNum;

    @BeforeEach
    public void setUp() {
        randomNum = new RandomNum();
    }

    @Test
    public void checkRangeOfRandomNum() {
        int[] result = randomNum.getRandomNum();
        assertEquals(3, result.length);
        for (int i = 0; i < result.length; i++) {
            int num = result[i];
            assertTrue(num >= 1 && num <= 9);
        }
    }

    @Test
    public void checkDuplicateOfRandomNum() {
        int[] result = randomNum.getRandomNum();
        assertEquals(3, result.length);
        assertNotEquals(result[0], result[1]);
        assertNotEquals(result[0], result[2]);
        assertNotEquals(result[1], result[2]);
    }
}