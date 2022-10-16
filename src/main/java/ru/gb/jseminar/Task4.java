package ru.gb.jseminar;

import java.math.*;
import java.util.Scanner;

public class Task4 {

    // Реализовать функцию возведения числа а в степень b. a, b – целые числа.
    //
    // Пример 1: а = 3, b = 2, ответ: 9
    // Пример 2: а = 2, b = -2, ответ: 0.25
    // Пример 3: а = 3, b = 0, ответ: 1
    public static void main(String[] args) {
        Task4 task = new Task4();
        System.out.println("Введите число a:");
        int a = task.inputFigure();
        System.out.println("Введите число b:");
        int b = task.inputFigure();
        task.sc.close();
        double degree = task.exponentiation(a, b);
        System.out.printf("Число %d в степени %d равно %.2f \n", a, b, degree);

    }

    public Scanner sc = new Scanner(System.in);

    public int inputFigure() {
        int i = sc.nextInt();
        // System.out.println(i);
        return i;

    }

    public double exponentiation(int a, int b) {
        double newFigure = Math.pow(a, b);
        return newFigure;
    }
}
