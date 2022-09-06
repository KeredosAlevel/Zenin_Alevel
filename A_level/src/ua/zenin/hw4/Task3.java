package A_level.src.ua.zenin.hw4;
//• Заполнить одномерный массив случайными целочисленными значениями.
//       • Проверить сколько составных чисел присутствует в массиве.
//      Размер массива 1000 элементов.


import java.util.Arrays;
import java.util.Random;

//      Исходные массивы, которые передаются в метод не должны измениться.
//      Вычисления производить в отдельных методах.
public class Task3 {
    public static void main(String[] args) {

        int min = 1;
        int max = 10;

        int[] array = new int[10];
        for (int i = 1; i < 10; i++) {
            array[i] = ((int) (Math.random() * max) + min);
            System.out.print(array[i]);




        }
    }
}



