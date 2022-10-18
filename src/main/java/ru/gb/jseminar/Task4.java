package ru.gb.jseminar;

import java.util.Scanner;

public class Task4 {

    //Реализовать функцию возведения числа а в степень b. a, b – целые числа.
    //
    //Пример 1: а = 3, b = 2, ответ: 9
    //Пример 2: а = 2, b = -2, ответ: 0.25
    //Пример 3: а = 3, b = 0, ответ: 1
    public static void main(String[] args) {
        Task4 t4 = new Task4();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число а:");
        int a = scanner.nextInt();
        System.out.print("Введите число b:");
        int b = scanner.nextInt();
        System.out.println(t4.exponentiation(a, b));
    }

    public double exponentiation(int a, int b){
        if (b == 0) {
            return 1;
        }
        if (b > 0) {
            return a * exponentiation(a, b - 1);
        }
        return 1 / exponentiation(a, (-1) *b);
    }
}
