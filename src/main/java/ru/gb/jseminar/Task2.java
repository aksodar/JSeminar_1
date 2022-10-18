package ru.gb.jseminar;

import java.util.Scanner;
import java.time.*;

public class Task2 {

    //В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
    //"Доброе утро, <Имя>!", если время от 05:00 до 11:59
    //"Добрый день, <Имя>!", если время от 12:00 до 17:59;
    //"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
    //"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        Scanner iScanner = new Scanner(System.in);
        System.out.println("What is yr name? \n");
        String name = iScanner.nextLine();
        iScanner.close();
        System.out.printf("Have a good %s, %s!", task2.whatIsTheTime(), name);
    }

    public String whatIsTheTime() {
        LocalTime now = LocalTime.now();
        int hour = now.getHour();
        System.out.printf("now is %s o'clock\n", hour);
        if (hour >= 5 && hour < 12) return ("morning");
        if (hour >= 12 && hour < 18) return ("day");
        if (hour >= 18 && hour < 23) return ("evening");
        else return ("night");
    }
}
