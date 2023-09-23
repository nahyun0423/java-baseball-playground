package numBaseball;

import java.util.*;

//1-9의 서로 다른 수 3자리 수 만들기
public class RandomNum {
    static int[] com = new int[3];
    Random random = new Random();

    public int[] getRandomNum() {
        while (com[0] == 0) {
            com[0] = random.nextInt(10); //1-9까지 무작위 int 리턴
        }
        while (com[1] == 0 || com[1] == com[0]) {
            com[1] = random.nextInt(10); //1-9까지 무작위 int 리턴
        }
        while (com[2] == 0 || com[2] == com[1] || com[2] == com[0]) {
            com[2] = random.nextInt(10); //1-9까지 무작위 int 리턴
        }

        return com;

    }

    static void print() {
        for (int i = 0; i < com.length; i++) {
            System.out.print(com[i] + " ");
        }
    }
}
