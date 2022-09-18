package ua.zenin.hw3;

import java.util.Scanner;
public class Task2v2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a sentence for average transformation and analysis: ");
        String sentense = in.nextLine();

        sentense = getWithoutProbels(sentense);

        System.out.println("String without spaces: " + sentense);
        System.out.println("Inverted sentence: " + lineFlip(sentense));
        System.out.println("Checking at the polydrome:  " + palindromeCheck(sentense, lineFlip(sentense)));

    }
    private static String getWithoutProbels(String sentense) {
        String withoutProbels = sentense.replaceAll("\\W+", "");
        return withoutProbels;
    }
    public static String lineFlip(String sentense) {
        char[] arr = sentense.toCharArray();
        String rezult = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            rezult += arr[i];
        }
        return rezult;
    }
    public static boolean palindromeCheck(String sentense, String flipSentense) {
        if (sentense.equalsIgnoreCase(flipSentense))
            return true;
        else
            return false;
    }
}

