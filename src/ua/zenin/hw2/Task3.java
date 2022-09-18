package ua.zenin.hw2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        String digit = getString();

        boolean isEven = isEven(digit);

        if (isEven)
            System.out.println("Число  "+ digit + " оказалосьчетным: "+ isEven);
        else
            System.out.println("Число  "+ digit + " оказалось нечетным: "+ isEven);

        System.out.println("Спасибо за использование нашего програмного обеспечения  ");
        System.out.println("Хорошего дня (^_^) ");

    }

    private static boolean isEven(String digit) {
        int a = Character.getNumericValue(digit.charAt(digit.length() - 1));
        boolean isEven = (a & 1) == 0 ? true : false;
        return isEven;
    }


    private static String getString() {
        Scanner in = new Scanner(System.in);
        System.out.print("Пожалуйста не будете ли вы так любезны ввести число для проверки четности: ");
        String digit = in.next();
        return digit;
    }

}
