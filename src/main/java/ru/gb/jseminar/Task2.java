package ru.gb.jseminar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task2 {

    //В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
    //"Доброе утро, <Имя>!", если время от 05:00 до 11:59
    //"Добрый день, <Имя>!", если время от 12:00 до 17:59;
    //"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
    //"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String userName = iScanner.next();
        Calendar calendar = new GregorianCalendar();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        if (hour > 4 && hour < 12) {
            System.out.println(String.format("Good morning %s!", userName));            
        }
        else if (hour < 18) {
            System.out.println(String.format("Good day %s!", userName));  
        }
        else if (hour < 23) {
            System.out.println(String.format("Good evening %s!", userName));  
        }
        else {
            System.out.println(String.format("Good night %s!", userName));
        }
        iScanner.close();
    }

}
