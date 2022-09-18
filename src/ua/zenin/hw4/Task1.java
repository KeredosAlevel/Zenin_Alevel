package ua.zenin.hw4;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int[] array = new int[400];

        fillingMassive(array);
        average(array);
        geometricMean(array);

        System.out.print("Initial array = " + Arrays.toString(array));
        System.out.print("\n" + "Average: " + average(array));
        System.out.println("\n" + "Geometric mean: " + geometricMean(array));
    }

    public static int[] fillingMassive(int[] array) {
        int min = 1;
        int max = 10;
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * max) + min);
        }
        return array;
    }

    public static double geometricMean(int[] array) {
        double p = 1;
        for (int i = 0; i < array.length; i++) {
            p *= array[i];
        }
        return Math.pow(p, 1.0 / array.length);
    }

    public static float average(int[] array) {
        float sum = 0;
        for (float x : array) {
            sum += x;
        }
        return sum/array.length;
    }
}

