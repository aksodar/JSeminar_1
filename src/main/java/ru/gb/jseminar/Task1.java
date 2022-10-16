package ru.gb.jseminar;

import java.util.Scanner;

public class Task1 {

    //Написать программу, которая запросит пользователя ввести <Имя> в консоли.
    //Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите вше имя: ");
        String name = sc.nextLine();
        System.out.printf(" Привет,  %s!", name);
        sc.close();
    }
}
