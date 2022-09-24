package ua.zenin.module1;

import java.time.LocalDate;

public class test {
    private String name;

    public static void main (String[] args){
        printHello();
        printDate();
        printName();
    }

    public static void printHello() {
        System.out.println("hello");

    }
    public static void printDate(){
        System.out.println(LocalDate.now());
    }
    public static void printName(){
        // System.out.println(name);
    }

}
