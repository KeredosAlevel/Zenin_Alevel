package ua.zenin.hw5;

import java.util.Arrays;
import java.util.Scanner;

//Удаление из массива k-го элемента со сдвигом всех расположенных справа от него
//       элементов на одну позицию влево.

public class Task4 {
    public static void main(String[] args) {
        Scanner del = new Scanner(System.in);
        int[] array = new int[10];

        fillingArray(array);
        System.out.println("Primordial Array:");
        System.out.println(Arrays.toString(array));
        System.out.println("Enter the number of the element to delete: ");
        System.out.print("Transformed array: "+Arrays.toString(deletelelement(array, del.nextInt())));
    }
    private static int[] deletelelement(int[] massive, int index) {
        int[] deletedElArray = Arrays.copyOf(massive, massive.length - 1);
        for (int i = 0; i < deletedElArray.length; i++) {
            if ( index >= 0 &&  index <= massive.length - 1) {
                System.arraycopy(massive,  index+ 1, deletedElArray,  index,
                        deletedElArray.length -  index);
            } else {
                System.out.println("Error");
                return null;
            }
        }
        return deletedElArray;
    }
    private static int[] fillingArray(int[] massive) {
        int max = 20;
        int min = 1;
        for (int i = 0; i < massive.length; i++) {
            massive[i] = ((int) (Math.random() * max) + min);
            massive[i] = i + 1;
        }
        return massive;
    }
}

