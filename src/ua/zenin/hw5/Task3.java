package ua.zenin.hw5;

import java.util.Arrays;
import java.lang.*;

//Дан двумерный массив NxN(количество строк = количество столбцов), написать программу
//      которая поменяет местами столбцы и строки.
//     *Необходимо создать новый массив, в котором выполняются превращения и вернуть его из метода.
//     Изначальный массив не должен измениться
public class Task3 {
    public static void main(String[] args) {

        int[][] array = new int[5][5];
        int[][] newArray = new int[array[0].length][array.length];

        int max = 15;
        int min = 1;

        System.out.println(" Primordial Array:");

        creatingArray(array, max, min);

        copyArray(array, newArray);

        System.out.println(Arrays.deepToString(newArray));

        System.out.println("Converted Array:");

        System.out.println(Arrays.deepToString(array));
    }

    public static int[][] copyArray(int[][] array, int[][] newArray) {
        for (int i = 0; i < array.length; i++, System.out.println()) {
            for (int j = 0; j < array[i].length; j++) {
                newArray[i][j] = array[j][i];
            }
        }
        return newArray;
    }

    private static int[][] creatingArray(int[][] array, int max, int min) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * max + min);
            }
        }
        return array;
    }
}




