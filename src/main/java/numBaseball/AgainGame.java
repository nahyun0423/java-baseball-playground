package numBaseball;

import java.util.Scanner;

public class AgainGame {
    public static boolean playAgain(){
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        Scanner scan = new Scanner(System.in);
        String answer = scan.next();

        if (answer.equals("1")) {
            return true;
        }
        if (answer.equals("2")) {
            return false;
        }

        System.out.println("잘못된 수 입력");
        return false;
    }
}
