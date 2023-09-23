package stringcalculator;

public class Calculator {

    public int calculate(int first, char operator, int second) {
        if (operator == '+') {
            return add(first, second);
        }
        if (operator == '-') {
            return sub(first, second);
        }
        if (operator == '/') {
            if (second == 0) {
                throw new ArithmeticException("0으로 나눌 수 없습니다.");
            }
            return divide(first, second);
        }
        if (operator == '*') {
            return multiply(first, second);
        }
        throw new IllegalArgumentException("잘못된 값 입력");
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
        if (second == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
        return first / second;
    }
}
