package A_level.src.ua.zenin.hw2;

import java.util.Scanner;

public class Task4v2 {
    public static void main(String... args) {

        Scanner scan = getScanner();

        System.out.print("Введите 1 вещественное число:");
        int a = scan.nextInt();
        System.out.print("Введите 2 вещественное число:");
        int b = scan.nextInt();
        System.out.print("Введите 3 вещественное число:");
        int c = scan.nextInt();

        minNumber(a, b, c);

        System.out.println("Спасибо за использование нашего програмного обеспечения  ");
        System.out.println("Хорошего дня (^_^) ");
    }

    private static void minNumber(int a, int b, int c) {
        int a1 = a < 0 ? a * -1 : a;
        int b1 = b < 0 ? b * -1 : b;
        int c1 = c < 0 ? c * -1 : c;
        if (a1 <= b1 && a1 <= c1) {
            System.out.println("Наименьшим числом по модулю является: " + a);
        }
        if (b1 <= a1 && b1 <= c1) {
            System.out.println("Наименьшим числом по модулю является: " + b);
        } else {
            System.out.println("Наименьшим числом по модулю является: " + c);
        }
    }

    private static Scanner getScanner() {
        Scanner scan = new Scanner(System.in);
        return scan;
    }
}


