package stringcalculator;

public class Result {
    Input input = new Input();
    Operator oper = new Operator();

    public int calculateResult() {
        String value = input.inputData(input.scan);
        if (value.contains(" ") == true) {
            throw new IllegalArgumentException("공백을 입력하지 마세요");
        }

        Expression expression = new Expression(value);
        String[] splitedValue = expression.getExpression();

        int result = Integer.parseInt(splitedValue[0]);
        String operator = "";
        char tmp;

        for (int i = 1; i < splitedValue.length; i++) {
            tmp = value.charAt(i);

            if (Operator.isOperator(splitedValue[i])) {
                operator = splitedValue[i];
            } else if (('0' <= tmp && tmp <= '9')) {
                int number = Integer.parseInt(splitedValue[i]);
                result = oper.operate(result, operator, number);
            } else {
                throw new IllegalArgumentException("숫자와 +, -, *, /만 작성해주세요");
            }
        }
        return result;
    }
}
