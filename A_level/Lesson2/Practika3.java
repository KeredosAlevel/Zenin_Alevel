package A_level.Lesson2;

public class Practika3 {   public Practika3() {
}

    public static void main(String[] args) {
        String text = "public static void main (String[] args) {";
        char symbol = 'a';
        System.out.println(charFreguency(text, symbol));
    }

    public static int charFreguency(String text, char symbol) {
        int amount = 0;

        for(int i = 0; i < text.length(); ++i) {
            if (text.charAt(i) == symbol) {
                ++amount;
            }
        }

        return amount;
    }
}


