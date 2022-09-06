package A_level.src.ua.zenin.hw1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner M = new Scanner(System.in);
        System.out.print("Введите число для дальнейшего преобразования: ");
        String[] inputs = M.nextLine().split("");
        System.out.print("Полученый результат: ");

        for (int i = inputs.length - 1; i >= 0; --i) {
            System.out.print("" + inputs[i]);
        }

        M.close();
        System.out.print(" ");
        System.console().readLine();
        System.out.println("Спасибо за использование нашего програмного обеспечения  ");
        System.out.println("Хорошего дня (^_^) ");
    }
}

