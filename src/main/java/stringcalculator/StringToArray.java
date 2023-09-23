package stringcalculator;

public class StringToArray {
    public String[] toArray(String value) {
        return value.split(" ");
    }

    public int toInt(String value) {
        return Integer.parseInt(value);
    }
}
