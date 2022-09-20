package ua.zenin.hw5;
//Проверить, заданный массив на упорядоченность по невозрастанию, т. е. определить,
//       верно ли, что каждый его элемент, начиная со второго, не больше предыдущего.
//       *передать массив в метод, получить boolean

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[5];
        int min = 1;
        int max = 10;

        initialArray(array, min, max);

        boolean increase = isIncrease(array);

        System.out.print("Initial array = " + Arrays.toString(array));
        System.out.println(increase ? "\n" + "Non-increasing sequence." : "\n" + "Ascending sequence.");
    }
    private static void initialArray(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * max) + min);
        }
    }
    private static boolean isIncrease(int[] array) {
        boolean increase = false;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                increase = true;
                break;
            }
        }
        return increase;
    }
}
