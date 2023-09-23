package baseballTest;

import numBaseball.Score;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoreTest {
    Score score;

    @BeforeEach
    public void setUp() {
        score = new Score();
    }

    @Test
    public void makeScoreNothing() {
        String result = score.scoreMake(0, 0);
        assertEquals("낫싱", result);
    }

    @Test
    public void makeScoreBall() {
        String result = score.scoreMake(2, 0);
        assertEquals("2볼", result);
    }

    @Test
    public void makeScoreStrike() {
        String result = score.scoreMake(0, 3);
        assertEquals("3스트라이크", result);
    }

    @Test
    public void makeScoreAll() {
        String result = score.scoreMake(2, 1);
        assertEquals("2볼 1스트라이크", result);
    }
}