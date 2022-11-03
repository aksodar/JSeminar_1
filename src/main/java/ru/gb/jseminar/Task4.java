package ru.gb.jseminar;

import java.util.Scanner;
import java.lang.Math;

public class Task4 {

    // Реализовать функцию возведения числа а в степень b. a, b – целые числа.
    //
    // Пример 1: а = 3, b = 2, ответ: 9
    // Пример 2: а = 2, b = -2, ответ: 0.25
    // Пример 3: а = 3, b = 0, ответ: 1
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Task4 task4 = new Task4();
        int a = 0;
        int b = 0;
        System.out.print("Enter number 'a':\t");
        a = in.nextInt();
        System.out.print("Enter number 'b':\t");
        b = in.nextInt();
        System.out.printf("\na ^ b = %.2f\n", task4.exponentiation(a, b));
        in.close();
    }

    public double exponentiation(int a, int b) {
        return Math.pow(a, b);
    }
}
