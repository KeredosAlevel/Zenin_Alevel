package A_level.src.ua.zenin.hw2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите 1 вещественное число:");
        int a = scan.nextInt();
        System.out.print("Введите 1 вещественное число:");
        int b = scan.nextInt();
        System.out.print("Введите 1 вещественное число:");
        int c = scan.nextInt();

        int a1 = a<0?a*-1:a;
        int b1 = b<0?b*-1:b;
        int c1 = c<0?c*-1:c;

        int min = Math.min(Math.min(a1, b1), c1);


        System.out.println("Наименьшее вещественное число по модулю:\n" + min);

        System.out.println("Спасибо за использование нашего програмного обеспечения  ");
        System.out.println("Хорошего дня (^_^) ");
    }
}

