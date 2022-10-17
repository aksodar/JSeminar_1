package ru.gb.jseminar;

import java.util.Scanner;

public class Task4 {

    //Реализовать функцию возведения числа а в степень b. a, b – целые числа.
    //
    //Пример 1: а = 3, b = 2, ответ: 9
    //Пример 2: а = 2, b = -2, ответ: 0.25
    //Пример 3: а = 3, b = 0, ответ: 1
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("a: ");
        double a = iScanner.nextDouble();
        System.out.printf("b: ");
        double b = iScanner.nextDouble();
        iScanner.close();
        double res = exponentiation(a, b);
        System.out.println(res);
    }

    public static double exponentiation(double a, double b){
        return Math.pow(a, b);
    }
}
