package ru.gb.jseminar;

import java.util.Scanner;

public class Task4 {

    //Реализовать функцию возведения числа а в степень b. a, b – целые числа.
    //
    //Пример 1: а = 3, b = 2, ответ: 9
    //Пример 2: а = 2, b = -2, ответ: 0.25
    //Пример 3: а = 3, b = 0, ответ: 1
    public static void main(String[] args) {
        Task4 t = new Task4();
        Scanner iScaner = new Scanner (System.in);
        System.out.print("Введите число : ");
        int number = iScaner.nextInt();
        System.out.print("Введите степень числа : ");
        int degree = iScaner.nextInt();
        iScaner.close();
        System.out.printf("%d ^ %d = %s", number, degree, t.exponentiation(number, degree));

    }

    public double exponentiation(int a, int b){

        return Math.pow (a,b); 
    }
}
