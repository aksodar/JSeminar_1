package ru.gb.jseminar;

import java.util.Scanner;

public class Task1 {

    // Написать программу, которая запросит пользователя ввести <Имя> в консоли.
    // Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name:\t");
        String name = in.nextLine();
        System.out.printf("Hello, %s!", name);
        in.close();
    }

}
