package ru.gb.jseminar;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Task2 {

    //В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
    //"Доброе утро, <Имя>!", если время от 05:00 до 11:59
    //"Добрый день, <Имя>!", если время от 12:00 до 17:59;
    //"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
    //"Доброй ночи, <Имя>!", если время от 23:00 до 4:59

    LocalDateTime ldt = LocalDateTime.now();
    Integer currentTime = ldt.getHour();

    public static void main(String[] args) {
        Task2 task = new Task2();
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите имя: ");
        String name = iScanner.next();
        iScanner.close();
        task.getMSGtime(name);
        System.out.printf("Текущее время: %s", task.currentTime);
    }

    public void getMSGtime(String name) {
        if (currentTime >= 5 && currentTime < 11) {
            System.out.printf("Доброе утро, %s!\n", name);
            }
        if (currentTime >= 11 && currentTime < 16) {
            System.out.printf("Добрый день, %s!\n", name);
            }
        if (currentTime >= 16 && currentTime < 23) {
            System.out.printf("Добрый вечер, %s!\n", name);
            }
        if (currentTime >= 23 && currentTime < 5) {
            System.out.printf("Доброй ночи, %s!\n", name);
            }
    }
}
