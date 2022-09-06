package A_level.Lesson4;

import java.util.Arrays;

public class Practica1Massive {
    public static void main(String[] args) {
        // Типы масивов
        int[] a = new int[3]; // запись масива с количеством столбцов значини задаются позже
        int[] d = {3, 4, 2, 5}; // запись массива сразу со значением
        int c[] = new int[3]; //массив который работает но не совсем правильно отображается... Лучше использовать верхний вариант

        String[] stringArray;
        stringArray = new String[12];

        Object[] arrayOfObgekts = new Object[7]; // массив объектов любые объекты которые доступны в java строки числа и т.д.

        int[] anArray = {100, 200};
        System.out.println(anArray[1]);

        //копирование массива

        int[] sourseArray = {100, 200, 300};
        int[] targetArray = new int[stringArray.length]; // формула для копированя дли массива

        for (int i = 0; i < stringArray.length; i++) {
            targetArray[i] = sourseArray[i]; // формула для копирования длины массива

            System.arraycopy(sourseArray, 0, targetArray, 0, stringArray.length);// второй способ копирования массива

            int[] bv = Arrays.copyOf(sourseArray, stringArray.length);

            //int[] targetArray = Arrays.stream(sourseArray).toArray(); // Третий способ копирования массива

            // перебор массивов
            //int[] sourseArray = {100, 200, 300};
            for (int f = 0; f < sourseArray.length; f++) {
                System.out.println(sourseArray[f]);
            }
            for (int element : sourseArray) {
                System.out.println(element); // второй способ перебора масивов

            }

        }

    }
}
