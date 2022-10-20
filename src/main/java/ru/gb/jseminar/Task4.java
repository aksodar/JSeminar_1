package ru.gb.jseminar;
import java.util.Scanner;
import java.lang.Math;

public class Task4 {

    //Реализовать функцию возведения числа а в степень b. a, b – целые числа.
    //
    //Пример 1: а = 3, b = 2, ответ: 9
    //Пример 2: а = 2, b = -2, ответ: 0.25
    //Пример 3: а = 3, b = 0, ответ: 1
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        Task4 hw = new Task4();
        System.out.printf("Введите число a: ");
        int a = Integer.parseInt(iScanner.nextLine());
        System.out.printf("Введите число b: ");
        double b = Double.parseDouble(iScanner.nextLine());
        double result = hw.exponentiation(a, b);
        hw.printResult(a, b, result);
        iScanner.close();
    }

    public double exponentiation(int a, double b) {
        return Math.pow(a, b);
    }

    public void printResult(int a, double b, double result) {
        System.out.printf("%d ^ %.2f = %.2f", a, b, result);
    }
}
