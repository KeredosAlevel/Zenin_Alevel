package A_level.Lesson2;

public class Practika4 {
    public Practika4() {
    }

    public static void main(String[] args) {
        int number = 123456;
        System.out.println(sufOffDigit(number));
        System.out.println(number);
    }

    public static int sufOffDigit(int input) {
        int sum;
        for(sum = 0; input != 0; input /= 10) {
            sum += input % 10;
        }

        return sum;
    }
}

