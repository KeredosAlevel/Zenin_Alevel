package A_level.src.ua.zenin.hw3;

import java.io.IOException;

public class Task4 {
    public static void main(String[] args) throws IOException {

        System.out.println("What number did I guess? ");

        while (true) {
            char ch, ansver = '5';

            System.out.print("Try to guess it: ");
            ch = (char) System.in.read();

            if (isAnsver(ch, ansver)) break;
        }
    }

    private static boolean isAnsver(char ch, char ansver) {
        if (ch == ansver) {
            System.out.println("How did you guess? But anyway, congratulations!");
            return true;
        } else if (ch < ansver) {
            System.out.println("Let's go to the other side of the alphabet.");
        } else {
            System.out.println("To the other side of the alphabet.");

        }
        return false;
    }
}


