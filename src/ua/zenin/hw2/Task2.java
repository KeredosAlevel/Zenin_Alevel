package ua.zenin.hw2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = getScanner();

        System.out.print("Задайте координаты для точки А по оси Х и Y:  ");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        System.out.print("Задайте координаты для точки В по оси Х и Y:  ");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        System.out.print("Задайте координаты для точки С по оси Х и Y:  ");
        double x3 = in.nextDouble();
        double y3 = in.nextDouble();

        getArea(x1, y1, x2, y2, x3, y3);

        System.out.println("Спасибо за использование нашего програмного обеспечения  ");
            System.out.println("Хорошего дня (^_^) ");
        }
    private static void getArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)); // расчет длины одной из сторон.
        double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double c = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));

        if (a + b <= c || a + c <= b || a + c <= b) {// Проверка возможности существования треугольника
            System.out.println("Треугольник не существует");
        } else {
            double p = ((a + b + c) / 2.0);
            double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));// расчет самой площади треугольника
            System.out.println("Площадь треугольника: " + S);
        }
    }
    private static Scanner getScanner() {
        Scanner in = new Scanner(System.in);
        System.out.println("Значения вводить через пробел");
        return in;
    }
}


