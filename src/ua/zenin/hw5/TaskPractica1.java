package ua.zenin.hw5;

import java.util.Arrays;

public class TaskPractica1 {
    public static void main(String[] args) {

        int min = 500;
        int max = 1500;
        int sum = 0;

        System.out.print("Элементы массива : ");

        int[] array = new int[12];

        sum = getSumInMassive(min, max, sum, array);

        System.out.println(Arrays.toString(array));
        System.out.println("Сумма элементов массива выше 1000 равна: " + sum);
    }
    private static int getSumInMassive(int min, int max, int sum, int[] array) {
        for (int i = 1; i < 12; i++) {
            array[i] = ((int) (Math.random() * max) + min);
            if (array[i] >= 1000) {
                sum += array[i];
            }
        }
        return sum;
    }
}

