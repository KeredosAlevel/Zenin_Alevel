package ua.zenin.hw6;

public class Task1 {
    public static void main(String[] args) {

        Phone phoneOne = new Phone("+38000 000 00 00 ", "IPhone", 15);
        Phone phoneSecond = new Phone("+38000 000 00 01 ", "Xiomi");
        Phone phoneThird = new Phone();

        System.out.println(phoneOne);

        System.out.println(phoneSecond);

        System.out.println(phoneThird);

        phoneOne.receiveCall("Maksym" + " ");
        System.out.print(System.lineSeparator());

        phoneSecond.receiveCall("Sewrgey" + " ");
        System.out.print(System.lineSeparator());

        phoneThird.receiveCall("Aleksey" + " ");
        System.out.print(System.lineSeparator());

        System.out.println(phoneOne.getNumber());
        System.out.println(phoneSecond.getNumber());
        System.out.println(phoneThird.getNumber());

    }
}