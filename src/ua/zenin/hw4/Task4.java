package ua.zenin.hw4;
//• Заполнить одномерный массив случайными целочисленными значениями.
//       • Все четные значения заменить на нули.
//      Размер массива - 2000 элементов.

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        long[] array = getArray();

        System.out.println("Initial array: " + "\n" + Arrays.toString(array));

        convertedMassive(array);

        System.out.println("Array converted: " + "\n" + Arrays.toString(array));
    }

    private static long[] getArray() {
        long[] array = new long[2000];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt();
        }
        return array;
    }
    private static void convertedMassive(long[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = 0;
            }
        }
    }
}

