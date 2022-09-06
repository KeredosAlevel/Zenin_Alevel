package A_level.src.ua.zenin.hw3;

import java.util.Scanner;
import java.lang.String;

public class Task2 {
    public static void main(String[] args) {

        Scanner setense = new Scanner(System.in);

        System.out.println("Please enter a sentence for average transformation and analysis: ");

        String sentense = getSentense(setense);

        String withoutProbels = getWithoutProbels(sentense);

        System.out.println("String without spaces:\n " + withoutProbels);

        String invertedSentense = getInvertedSentense(withoutProbels);

        System.out.println(sentense != invertedSentense ?
                "The sentence is not a palindrome.":
                "This sentence is a palindrome.");


        System.out.println("Спасибо за использование нашего програмного обеспечения  ");
        System.out.println("Хорошего дня (^_^) ");
    }

    private static String getInvertedSentense(String withoutProbels) {
        StringBuilder strBulder = new StringBuilder(withoutProbels);
        strBulder.reverse();
        String invertedSentense = strBulder.toString();
        return invertedSentense;
    }

    private static String getWithoutProbels(String sentense) {
        String withoutProbels = sentense.replaceAll("\\W+", "");
        return withoutProbels;
    }

    private static String getSentense(Scanner setense) {
        String sentense = setense.nextLine();
        return sentense;
    }
}


