package ru.gb.jseminar;
import java.util.Scanner;

public class Task1 {

    //Написать программу, которая запросит пользователя ввести <Имя> в консоли.
    //Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите имя: ");
        String name = iScanner.nextLine();
        Task1 task = new Task1();
        task.getMSG(name);
        iScanner.close();
    }

    public void getMSG(String name) {
        System.out.printf("Привет, %s!", name);
    }
}
