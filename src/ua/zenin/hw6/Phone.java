package ua.zenin.hw6;

public class Phone {
    String number; // переменные поля
    String model;
    double weight;
    Phone(String number, String model, double weight) { // конструктор приниающий три параметра на вход
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    Phone(String number, String model) {// конструктор приниающий два параметра на вход
        this.number = number;
        this.model = model;
    }
    Phone() { // конструктор без параметров на вход
    }
    @Override
    public String toString() {
        return "Phone " + "number:" + number + ", model: " + model + ", weight: " + weight ;
    }
    void receiveCall(String name) {
        System.out.printf("Звонит: %s", name);
    }
    String getNumber() {
        return number;
    }
}
