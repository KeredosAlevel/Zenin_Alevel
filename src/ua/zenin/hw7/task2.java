package ua.zenin.hw7;

public class task2 {
    public static void main(String[] args) {

        Vector[] vector = Vector.vectorArray(10);
        System.out.println("First vector: " + vector[0]);

        System.out.print(System.lineSeparator());
        System.out.println("Second vector: " + vector[1]);

        System.out.print(System.lineSeparator());
        System.out.println("Length first vector: " + vector[0].vectorLength());

        System.out.print(System.lineSeparator());
        System.out.println("Vector product: " + vector[0].vectorProduct((vector[1])));

        System.out.print(System.lineSeparator());
        System.out.println("Vectors cosinus: " + vector[0].vectorCos(vector[1]));

        System.out.print(System.lineSeparator());
        System.out.println("Sum of vectors: " + vector[0].vectorSum(vector[1]));

        System.out.print(System.lineSeparator());
        System.out.println("Vectors subtract: " + vector[0].vectorSubtract(vector[1]));

    }
}

