package A_level.Lesson2;

import java.util.Scanner;

public class Practika5 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose operation ( +, -, *, /, ) or 0 to exit");
            String operaation = scanner.nextLine();
            if (operaation.equals("0")) {
                return;
            }

            if (!operaation.equals("+") && !operaation.equals("-") && !operaation.equals("*") && !operaation.equals("/")) {
                System.out.println("Wrong input");
            } else {
                System.out.println("Enter First number");
                int firstNumber = scanner.nextInt();
                System.out.println("Enter second number");
                int secondNumber = scanner.nextInt();
                if (operaation.equals("/") && secondNumber == 0) {
                    while (operaation.equals("/") && (double) secondNumber == 0.0) {
                        System.out.println("Enter second number again, prohibited division by zero");
                        secondNumber = scanner.nextInt();
                    }
                }

                if ("/".equals(operaation)) {
                    System.out.println((double) firstNumber / (double) secondNumber);
                } else if ("*".equals(operaation)) {
                    System.out.println((double) firstNumber * (double) secondNumber);
                } else if ("+".equals(operaation)) {
                    System.out.println((double) firstNumber + (double) secondNumber);
                } else {
                    System.out.println((double) firstNumber - (double) secondNumber);
                }
            }
        }
    }
}

