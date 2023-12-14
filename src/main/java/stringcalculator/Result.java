package stringcalculator;

public class Result {
    Input input = new Input();
    Operator oper = new Operator();

    public int calculateResult() {
        String value = input.inputData(input.scan);
        Expression expression = new Expression(value);
        String[] splitedValue = expression.getExpression();

        int result = Integer.parseInt(splitedValue[0]);
        String operator = "";

        for (int i = 1; i < splitedValue.length; i++) {
            if (Operator.isOperator(splitedValue[i])) {
                operator = splitedValue[i];
            } else {
                int number = Integer.parseInt(splitedValue[i]);

                result = oper.operate(result, operator, number);
            }
        }
        return result;
    }
}
