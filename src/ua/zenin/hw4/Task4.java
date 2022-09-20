package ua.zenin.hw4;
//• Заполнить одномерный массив случайными целочисленными значениями.
//       • Все четные значения заменить на нули.
//      Размер массива - 2000 элементов.

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        int[] array = getArray();
        System.out.println("Initial array: ");
        System.out.println(Arrays.toString(array));

        int[] copyArray = convertedMassive(array);
        System.out.println("Array converted: " + "\n" + Arrays.toString(copyArray));
    }

    private static int[] convertedMassive(int[] array) {
        int[] copyArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < copyArray.length; i++) {
            if (i % 2 == 0) {
                copyArray[i] = 0;
            }
        }
        return copyArray;
    }

    private static int[] getArray() {
        int[] array = new int[2000];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt();
        }
        return array;
    }


}



