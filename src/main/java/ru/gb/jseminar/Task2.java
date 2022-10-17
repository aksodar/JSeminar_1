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
        LocalDateTime ldt = LocalDateTime.now();
        Scanner iScanner = new Scanner(System.in);
        System.out.println(ldt.getHour());
        System.out.print("Введите имя: ");
        String name = iScanner.nextLine();
        int currentTime = ldt.getHour();
        if(currentTime >= 5 && currentTime < 12){
            System.out.printf("Доброе утро, %s", name);
        }
        if(currentTime >= 12 && currentTime < 18){
            System.out.printf("Добрый день, %s", name);
        }
        if(currentTime >= 18 && currentTime < 23){
            System.out.printf("Добрый вечер, %s", name);
        }
        if(currentTime >= 23 && currentTime < 5){
            System.out.printf("Доброй ночи, %s", name);
        }
        iScanner.close();
    }

}
