package ru.gb.jseminar;

import java.util.Scanner;
public class Task1 {

    //Написать программу, которая запросит пользователя ввести <Имя> в консоли.
    //Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
    public static String main(String[] args) {
        System.out.print("Введите Ваше Имя: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        // System.out.println("Привет, " + name + "!");
        sc.close();
        return name;
    }

}
