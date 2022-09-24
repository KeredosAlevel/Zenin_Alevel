package ua.zenin.hw7;

import java.util.Random;

public class Vector {
    public int x;
    public int y;
    public int z;

    @Override
    public String toString() {
        return "x = " + x + ", y = " + y + ", z = " + z;
    }

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double vectorLength() {
        return Math.sqrt(x * x + y * y + z * z);
        //метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt():
    }

    public Vector vectorProduct(Vector b) {
        return new Vector(y * b.z - z * b.y, z * b.x - x * b.z, x * b.y - y * b.x);
    //метод, вычисляющий векторное произведение с другим вектором
    }

    public double vectorScalar(Vector b) {
        return x * b.x + y * b.y + z * b.z;
        //Скалярное произведение векторов
    }

    public double vectorCos(Vector b) {
        return vectorScalar(b) / Math.abs(vectorLength() * b.vectorLength());
        //метод вычисляющий косинус угла между векторами
    }

    public Vector vectorSum(Vector b) {
        return new Vector(x + b.x, y + b.y, z + b.z);
        // метод для суммы векторов
    }

    public Vector vectorSubtract(Vector b) {
        return new Vector(x - b.x, y - b.y, z - b.z);
        //метод для разницы векторов
    }

    public static Vector[] vectorArray(int n) {
        Vector[] vectors = new Vector[n];
        Random rand = new Random();
        for (int i = 0; i < vectors.length; i++) {
            vectors[i] = new Vector(rand.nextInt(25), rand.nextInt(25), rand.nextInt(25));
        }
        return vectors;
        //создание рандомных векторов
    }
}

