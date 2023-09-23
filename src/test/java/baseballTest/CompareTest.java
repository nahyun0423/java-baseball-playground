package baseballTest;

import numBaseball.Compare;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompareTest {
    Compare compare;

    @BeforeEach
    public void setUp() {
        compare = new Compare();
    }

    @AfterEach
    public void afterEach() {
        Compare.strike = 0;
        Compare.ball = 0;
    }

    @Test
    public void compareStrike() {
        int[] com = {1, 2, 3};
        int[] user = {1, 2, 5};
        compare.compareArray(com, user);
        assertEquals(2, Compare.strike);
        assertEquals(0, Compare.ball);
    }

    @Test
    public void compareBall() {
        int[] com = {4, 5, 6};
        int[] user = {7, 6, 8};
        compare.compareArray(com, user);
        assertEquals(0, Compare.strike);
        assertEquals(1, Compare.ball);
    }

    @Test
    public void compareNothing() {
        int[] com = {7, 8, 9};
        int[] user = {1, 2, 3};
        compare.compareArray(com, user);
        assertEquals(0, Compare.strike);
        assertEquals(0, Compare.ball);
    }
}