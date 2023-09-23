package numBaseball;

public class UserNum { //int로 받은 걸 잘라서 int배열로 만들기
    static int[] user = new int[3];

    public static int[] toInt(String user_num) {
        for (int i = 0; i < 3; i++) {
            user[i] = (int) user_num.charAt(i) - '0';
        }
        return user;
    }
}
