package ua.zenin.hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        String input = getString();
        int count = getWordsAmount(input);
        System.out.println("In your offer " + count + " world");

        System.out.println("Спасибо за использование нашего програмного обеспечения  ");
        System.out.println("Хорошего дня (^_^) ");
    }

    private static int getWordsAmount(String input) {
        int count = 0;
        if (input.length() != 0) {
            count++;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        return count;
    }

    private static String getString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an offer to process");
        String input = sc.nextLine();
        return input;
    }
}

