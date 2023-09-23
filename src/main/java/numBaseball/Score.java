package numBaseball;

public class Score {

    public static String scoreMake(int ball, int strike) {
        if (ball == 0 && strike == 0) {
            return "낫싱";
        } else if (ball > 0 && strike == 0) {
            return ball + "볼";
        } else if (strike > 0 && ball == 0) {
            return strike + "스트라이크";
        }
        return ball + "볼 " + strike + "스트라이크";
    }
}
