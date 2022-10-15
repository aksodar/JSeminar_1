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
        System.out.printf("Введите число A: ");
        int a = Integer.parseInt(iScanner.nextLine());
        System.out.printf("Введите число B: ");
        int b = Integer.parseInt(iScanner.nextLine());
        iScanner.close();

        Task4 task4 = new Task4();
        double result = task4.exponentiation(a, b);
        System.out.println(result);
    }

    public double exponentiation(int a, int b){
        double res = Math.pow(a, b);
        return res;
    }
}

