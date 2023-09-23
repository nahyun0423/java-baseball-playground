package stringcalculator;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Result result = new Result();
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        result.makeResult(value);
    }

}


