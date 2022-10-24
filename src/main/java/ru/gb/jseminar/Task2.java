package ru.gb.jseminar;


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
        System.out.println("Введите Имя: ");
        String name = iScanner.nextLine();
        iScanner.close();
        Date currentDate = new Date();
        Integer currntTime = currentDate.getHours();
        if (currntTime >= 5 && currntTime < 12){
            System.out.printf("Доброе утро, %s! \n", name);
        }
        else if (currntTime >= 12 && currntTime < 18){
            System.out.printf("Добрый день, %s! \n", name);
        }
        else if (currntTime >= 18 && currntTime < 23){
            System.out.printf("Добрый вечер, %s! \n", name);
        }
        else if (currntTime >= 23 && currntTime < 5){
            System.out.printf("Доброй ночи, %s! \n", name);
        }

    }

}
