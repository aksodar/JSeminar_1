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
        System.out.printf("Введите ваше имя: ");
        String name = iScanner.nextLine();
        LocalDateTime systemTime = LocalDateTime.now();
        Integer systemHour = systemTime.getHour();
        if (systemHour >= 5 && systemHour < 12){
            System.out.printf("Доброе утро, %s!", name);
        }
        if (systemHour >= 12 && systemHour < 18){
            System.out.printf("Добрый день, %s!", name);
        }
        if (systemHour >= 18 && systemHour < 23){
            System.out.printf("Добрый вечер, %s!", name);
        }
        if (systemHour >= 23 && systemHour < 5){
            System.out.printf("Доброй ночи, %s!", name);
        }
        iScanner.close();
    }

}
