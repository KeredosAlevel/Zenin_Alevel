package A_level.Lesson5;

import java.util.stream.IntStream;

public class practika1 {

    public static void main(String[] args) {

        int min = 1;
        int max = 10;
        boolean number;

        int[] array = new int[10];
        for (int i = 1; i < 10; i++) {
            array[i] = ((int) (Math.random() * max) + min);
            System.out.print(array[i]);

            boolean b = true;
            for (int P = 2; P <= array[i]; P++) {
                for (int a = 2; a < P; a++) {
                    if (P % a == 0) {
                        b = false;
                        break;
                    }
                }
                if (b) System.out.print(P);
                else b = true;
            }
        }
    }
}