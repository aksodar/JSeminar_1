package ru.gb.jseminar;

import java.util.Scanner;
public class Task4 {

    //Реализовать функцию возведения числа а в степень b. a, b – целые числа.
    //
    //Пример 1: а = 3, b = 2, ответ: 9
    //Пример 2: а = 2, b = -2, ответ: 0.25
    //Пример 3: а = 3, b = 0, ответ: 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int x = sc.nextInt();
        System.out.print("Введите второе число: ");
        int y = sc.nextInt();
        System.out.printf("Результат: " + Math.pow(x, y));
        sc.close();
    }
}