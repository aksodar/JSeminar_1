package ru.gb.jseminar;

import java.sql.Array;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.Date;

public class Task2 {

    // В консоли запросить имя пользователя. В зависимости от текущего времени,
    // вывести приветствие вида
    // "Доброе утро, <Имя>!", если время от 05:00 до 11:59
    // "Добрый день, <Имя>!", если время от 12:00 до 17:59;
    // "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
    // "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
    public static void main(String[] args) {
        String name = input_name();
        LocalDateTime ldt = LocalDateTime.now();
        int now = ldt.getHour();

        if (now < 12 && now > 5) {
            System.out.printf("Доброе утро %s!\n", name);
        } else if (now > 12 && now < 18) {
            System.out.printf("Добрый день %s!\n", name);
        } else if (now > 18 && now < 23) {
            System.out.printf("Добрый вечер %s!\n", name);
        } else {
            System.out.printf("Доброй ночи %s!\n", name);
        }

    }

    public static String input_name() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        iScanner.close();
        return name;
    }

}
