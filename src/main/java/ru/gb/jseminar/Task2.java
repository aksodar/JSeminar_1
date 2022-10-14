package ru.gb.jseminar;

import java.time.LocalDate;
import java.time.LocalDateTime;
public class Task2 {

    //В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
    //"Доброе утро, <Имя>!", если время от 05:00 до 11:59
    //"Добрый день, <Имя>!", если время от 12:00 до 17:59;
    //"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
    //"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
    public static void main(String[] args) {
        String name = Task1.main(args);
        LocalDateTime ldt = LocalDateTime.now();
        int now = ldt.getHour();
//        System.out.println(now);
        if (now > 5 && now < 12) {
            System.out.printf("Доброе утро, %s!\n", name);
        }
        else if (now >= 12 && now < 18){
            System.out.printf("Добрый день, %s!\n", name);
        }
        else if (now >= 18 && now < 23){
            System.out.printf("Добрый вечер, %s!\n", name);
        }
        else if (now == 23 || now > 0 && now < 5){
            System.out.printf("Доброй ночи, %s!\n", name);
        }
    }

}
