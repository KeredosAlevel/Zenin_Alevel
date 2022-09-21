package ua.zenin.hw4;
//• Заполнить одномерный массив случайными целочисленными значениями.
//       • Проверить сколько составных чисел присутствует в массиве.
//      Размер массива 1000 элементов.

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        int[] array = new int[1000];

        fillingTheArray(array);

        System.out.println("Sourse array = " + Arrays.toString(array));
        System.out.println("No Prime numbers = " + noPrimeNumber(array));

    }
    public static int[] fillingTheArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + Math.random() * 10);
        } return array;
    }
    public static int noPrimeNumber(int[] array) {

        int count = 0;
        int number = 2;
        int rezult = 0;

        for (int i = 0; i < array.length; i++) {
            while (number <= array[i]) {

                if (array[i] % number == 0) {
                    count++;
                }
                number++;
            }
             if (count > 1) {
                 rezult++;
            }
            number = 2;
            count = 0;
        }return rezult;
    }
}


