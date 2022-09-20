package ua.zenin.hw5;

//Известен рост каждого из 25 учеников класса. Рост мальчиков условно задан
//     отрицательными числами. Определить средний рост мальчиков и средний рост девочек.
//    Пример ввода [160, 150, 148, -160, -170]

public class TaskPraktica2 {
    public static void main(String[] args) {
        int[] growth = {185, -190, 165, 149, -175, -169, 149, -170, 187, -250};

        boolean boys = true;
        boolean girls = true;
        double sum = 0;
        int amount = 0;

        growthBoys(growth, sum, amount, boys);

        growtGirls(growth, girls, sum, amount);
    }

    private static void growtGirls(int[] growth, boolean girls, double sum, int amount) {
        for (int i = 0; i < growth.length; i++) {
            if ((girls && growth[i] > 0)) {
                amount++;
                sum += growth[i];

            }
        }
        System.out.println("The average height of girls is: "+ sum / amount+ " см.");
    }

    private static void growthBoys(int[] growth, double sum, int amount, boolean boys) {
        for (int i = 0; i < growth.length; i++) {
            if ((boys && growth[i] < 0)) {
                amount++;
                sum += growth[i];

            }
        }
        System.out.println("The average height of boys is: "+ Math.abs(sum / amount)+ " см.");

    }
}

