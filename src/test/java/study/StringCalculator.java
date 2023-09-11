package study;

import java.util.Scanner;


public class StringCalculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        calculator.makeResult(value);
    }

}


