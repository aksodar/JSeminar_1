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

        Scanner iScanner = new Scanner(System.in);
        System.out.print("a = ");
        double a = Double.parseDouble(iScanner.nextLine());
        System.out.print("b = ");
        double b = Double.parseDouble(iScanner.nextLine());
        double result = t4.exponentiation(a, b);
        System.out.printf("a^b = %.2f\n", result);
        iScanner.close();
    }

    public double exponentiation(double a, double b){
        return Math.pow(a, b);
    }
}
