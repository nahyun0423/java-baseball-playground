package stringcalculator;

public class Main {
    public static void main(String[] args) {
        System.out.println("식을 입력하세요 ex) 5*2-6+4");

        Result stringResult = new Result();
            int result = stringResult.calculateResult();
            System.out.println("정답 : " + result);
    }
}
