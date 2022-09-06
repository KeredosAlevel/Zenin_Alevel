package A_level.Lesson2;

public class Practika1 {
    public Practika1() {
}

    public static void main(String[] args) {
        int x1 = 4;
        int x2 = 0;
        int x3 = -7;
        System.out.println("f(" + x1 + ") = " + calculeta(x1));
        System.out.println("f(" + x2 + ") = " + calculeta(x2));
        System.out.println("f(" + x3 + ") = " + calculeta(x3));
    }

    public static int calculeta(int x) {
        return x > 0 ? x - 2 : Math.abs(x);
    }
}


