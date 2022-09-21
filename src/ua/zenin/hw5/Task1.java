package ua.zenin.hw5;
//Заполнение двумерного массива значениями
// индекса(от 1 и до кол-ва

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[][] dobleArray = new int[4][4];
        System.out.println("Заполнение двумерного массива значениями:");
        int mas1 = 0;

        fillArray(dobleArray, mas1);

        System.out.println(Arrays.deepToString(dobleArray));

    }
    private static int[][ ]fillArray(int[][] dobleArray, int mas1) {
        for (int i = 0; i < dobleArray.length; i++) {
            for (int j = 0; j < dobleArray[i].length; j++) {
                dobleArray[i][j] = mas1 + 1;
                mas1++;
                if (i % 2 != 0)
                    dobleArray[i][j] = dobleArray[i][j]*(-1);
            }
        }
        return dobleArray;
    }
}

