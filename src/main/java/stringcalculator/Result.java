package stringcalculator;

public class Result {
    Calculator calculator = new Calculator();
    StringToArray stringToArray = new StringToArray();

    public int getResult(String[] value) {
        int result = stringToArray.toInt(value[0]);

        for (int i = 0; i < (value.length) - 2; i += 2) {
            result = calculator.calculate(result, value[i + 1].charAt(0), stringToArray.toInt(value[i + 2]));
        }
        return result;
    }

    //순서대로 두개씩 계산
    public int makeResult(String value) {
        return getResult(stringToArray.toArray(value));
    }

}
