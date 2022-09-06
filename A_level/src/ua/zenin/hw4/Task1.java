package A_level.src.ua.zenin.hw4;

public class Task1 {
    public static void main(String[] args) {

        int[] array = new int[400];
        int min = 1;
        int max = 10;
        long p = 1;
        double sum = 0;

        isMassive(array, min, max);
        average(array, sum);
        geometricMean(array, p);

    }
    private static void geometricMean(int[] array, long p) {
        for (double v : array) {
            p *= v;
        }
        System.out.println("\n" + "Среднее геометрическое: " + Math.pow(p, (0.0025)));
    }

    private static void average(int[] array, double sum) {
        for (double x : array) {
            sum += x;
        }
        System.out.print("\n" + "Среднее арифметическое: " + sum / array.length);
    }

    private static void isMassive(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * max) + min);
            System.out.print(array[i]);
        }
    }
}


