package ru.gb.jseminar;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Task2 {

    // В консоли запросить имя пользователя. В зависимости от текущего времени,
    // вывести приветствие вида
    // "Доброе утро, <Имя>!", если время от 05:00 до 11:59
    // "Добрый день, <Имя>!", если время от 12:00 до 17:59;
    // "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
    // "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
    public static void main(String[] args) {
        LocalDateTime lt = LocalDateTime.now();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        scanner.close();
        if (lt.getHour() >= 5 && lt.getHour() < 12) {
            System.out.println("Доброе утро, " + name);
        }
        if (lt.getHour() >= 12 && lt.getHour() < 18) {
            System.out.println("Добрый день, " + name);
        }
        if (lt.getHour() >= 18 && lt.getHour() < 23) {
            System.out.println("Добрый вечер, " + name);
        }
        if (lt.getHour() >= 23 && lt.getHour() < 5) {
            System.out.println("Доброй ночи, " + name);
        }
    }
}
