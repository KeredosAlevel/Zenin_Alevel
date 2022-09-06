package A_level.Lesson2;

import java.util.Scanner;

public class Practika6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to raise to a power");
        int a = scanner.nextInt();
        System.out.println("Lead exponent for number");
        int b = scanner.nextInt();
        scanner.close();
        int result = 1;

        for (int i = 1; i <= b; ++i) {
            result *= a;
        }

        System.out.println(result);
    }
}


