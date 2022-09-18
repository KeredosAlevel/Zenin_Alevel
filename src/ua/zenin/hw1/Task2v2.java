package ua.zenin.hw1;

import java.util.Scanner;

public class Task2v2 {  public static void main(String[] args) {
    System.out.println("Введите число или символы для дальнейшего преобразования: ");
    Scanner scannerQ = new Scanner(System.in);
    String M = scannerQ.nextLine();
    System.out.println("Полученый результат: ");
    String[] temp = M.split("");

    for(int i = temp.length - 1; i >= 0; --i) {
        System.out.print("" + temp[i]);
    }

    System.out.print(" ");
    System.console().readLine();
    System.out.println("Спасибо за использование нашего програмного обеспечения  ");
    System.out.println("Хорошего дня (^_^) ");
}
}

