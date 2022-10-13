package ru.gb.jseminar;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Task2 {

    //В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
    //"Доброе утро, <Имя>!", если время от 05:00 до 11:59
    //"Добрый день, <Имя>!", если время от 12:00 до 17:59;
    //"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
    //"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
    public static void main(String[] args) {
        
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите имя: ");
        String name = iScanner.nextLine();

        LocalDateTime ldt = LocalDateTime.now();

        if (ldt.getHour() >= 5 && ldt.getHour() < 12){
            System.out.printf("Доброе утро, %s!\n", name);
        }
        else if (ldt.getHour() >= 12 && ldt.getHour() < 18){
            System.out.printf("Добрый день, %s!\n", name);
        }
        else if (ldt.getHour() >= 18 && ldt.getHour() < 23){
            System.out.printf("Добрый вечер, %s!\n", name);
        }
        else {
            System.out.printf("Доброй ночи, %s!\n", name);
        }
        
        iScanner.close();
    }

        



}
