package ru.gb.jseminar;
import java.util.Scanner;
public class Task1 {

    //Написать программу, которая запросит пользователя ввести <Имя> в консоли.
    //Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите имя: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет %s", name);
        iScanner.close();
    }

}
