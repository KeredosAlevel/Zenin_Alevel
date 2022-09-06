package A_level.src.ua.zenin.hw1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("My name is Maksim Zenin");
        SimpleDateFormat formater = new SimpleDateFormat("Дата: dd MMMM yyyy ");
        Date date = new Date();
        System.out.println(formater.format(date));
        new SimpleDateFormat("Местное время: HH:mm:ss");
        System.out.println("Спасибо за использование нашего програмного обеспечения  ");
        System.out.println("Хорошего дня (^_^) ");
        System.out.println("Press ENTER to continue");
        System.console().readLine();

    }
}
