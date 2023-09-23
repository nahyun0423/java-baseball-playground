package numBaseball;

import java.util.Scanner;

import static numBaseball.RandomNum.*;

public class Main {
    public static void main(String[] args) {
        boolean playGame = true; // 게임을 처음에 시작하도록 초기화

        while (playGame) {
            NumInputPrompt.promptForNum();
            Scanner scan = new Scanner(System.in);
            String user_num = scan.next();
            RandomNum.print(); // 확인차

            System.out.println(Score.scoreMake(Compare.ball, Compare.strike));

            if (Score.scoreMake(Compare.ball, Compare.strike).equals("3스트라이크")) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                playGame = AgainGame.playAgain();
            }


        }
        System.out.println("게임 종료");
    }
}
