package A_level.Lesson2;

public class Practika2 {
    public Practika2() {
    }

    public static void main(String[] args) {
        printOdd(1, 2);
        printOdd(3, 10);
    }

    public static void printOdd(int x, int y) {
        System.out.println(x % 2 == 0 ? y : x);
        if (x % 2 == 0) {
            System.out.println(y);
        } else {
            System.out.println(x);
        }

    }
}
