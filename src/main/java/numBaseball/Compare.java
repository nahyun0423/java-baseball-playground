package numBaseball;

public class Compare {
    public static int ball = 0;
    public static int strike = 0;

    public void compareArray(int[] com, int[] user) {
        for (int i = 0; i < 3; i++) {
            if (user[i] == com[i]) {
                strike += 1;
            }
            if (com[i] != user[i]) {
                for (int j = 0; j < 3; j++) {
                    if (com[i] == user[j]) {
                        ball += 1;
                    }
                }

            }
        }
    }
}
