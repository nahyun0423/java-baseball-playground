package baseballTest;

import numBaseball.UserNum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class UserNumTest {
    UserNum userNum;

    @BeforeEach
    public void setUp() {
        userNum = new UserNum();
    }

    @Test
    public void toIntTest() {
        int[] result = userNum.toInt("123");
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, result);
    }
}
