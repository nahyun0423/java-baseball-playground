package stringcalculator;

public class Operator {
    Calculator cal = new Calculator();

    public int operate(int firstNum, String operator, int secondNum) {

        if (operator.equals("+")) {
            return cal.add(firstNum, secondNum);
        }
        if (operator.equals("-")) {
            return cal.sub(firstNum, secondNum);
        }
        if (operator.equals("*")) {
            return cal.mul(firstNum, secondNum);
        }
        if (operator.equals("/")) {
            return cal.div(firstNum, secondNum);
        }
        throw new IllegalArgumentException("잘못된 기호 입력");
    }

    static boolean isOperator(String str) {
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }
}
