package study;

public class Calculator {

    public String[] StringToArray(String value) {
        return value.split(" ");
    }

    public int toInt(String value) {
        return Integer.parseInt(value);
    }

    public int calculate(int first, char operator, int second) {
        if (operator == '+') {
            return add(first, second);
        }
        if (operator == '-') {
            return sub(first, second);
        }
        if (operator == '/') {
            return divide(first, second);
        }
        if (operator == '*') {
            return multiply(first, second);
        } else System.out.println("잘못된 값 입력");

        return first;
    }

    int add(int first, int second) {
        return first + second;
    }

    int sub(int first, int second) {
        return first - second;
    }

    int multiply(int first, int second) {
        return first * second;
    }

    int divide(int first, int second) {
        try {
            return first / second;
        } catch (Exception e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
        return 0;
    }

    public int getResult(String[] value) {
        int result = toInt(value[0]);

        for (int i = 0; i < (value.length) - 2; i += 2) {
            result = calculate(result, value[i + 1].charAt(0), toInt(value[i + 2]));
        }
        return result;
    }

    //순서대로 두개씩 계산
    public int makeResult(String value) {
        return getResult(StringToArray(value));
    }

}
