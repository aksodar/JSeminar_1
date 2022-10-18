package ru.gb.jseminar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task2 {

    //В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
    //"Доброе утро, <Имя>!", если время от 05:00 до 11:59
    //"Добрый день, <Имя>!", если время от 12:00 до 17:59;
    //"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
    //"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
    public static void main(String[] args) {
        Task2 tk2 = new Task2();
        String name = "Karl";
        tk2.Time(name);
    }

    public  void Time(String  name){
        Date dateNow = new Date();
        dateNow.getHours();

        if (dateNow.getHours() > 5 && dateNow.getHours() < 12){
            System.out.printf("Доброе утро, %s", name);
        }
        else if (dateNow.getHours() > 12 && dateNow.getHours() < 18){
            System.out.printf("Добрый день, %s", name);
        }
        else if (dateNow.getHours() > 18 && dateNow.getHours() < 23){
            System.out.printf("Добрый вечер, %s", name);
        }
        else if (dateNow.getHours() > 0 && dateNow.getHours() < 5){
            System.out.printf("Доброй ночи, %s", name);
        }
        else {
            System.out.println("Такого времени нет");
        }

    }

}
