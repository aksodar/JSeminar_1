package ru.gb.jseminar;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Task2 {

    //В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
    //"Доброе утро, <Имя>!", если время от 05:00 до 11:59
    //"Добрый день, <Имя>!", если время от 12:00 до 17:59;
    //"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
    //"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Как тебя зовут: ");
        String name = iScanner.nextLine();
        iScanner.close();
        LocalDateTime ltd = LocalDateTime.now();
        int dateH = ltd.getHour();

        if (dateH > 4 && dateH < 12) {
            System.out.printf("Доброе утро, %s!", name);
        }

        else if (dateH > 11 && dateH < 18) {
            System.out.printf("Добрый день, %s!", name);
        }
        else if (dateH > 17 && dateH < 23) {
            System.out.printf("Добрый вечер, %s!", name);
        }
        else {
            System.out.printf("Доброй ночи, %s!", name);
        }
    }
}
