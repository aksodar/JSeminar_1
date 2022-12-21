package ru.gb.jseminar;
import java.util.Scanner;

public class Task4 
{

    // Реализовать функцию возведения числа а в степень b. a, b – целые числа.
    //
    // Пример 1: а = 3, b = 2, ответ: 9
    // Пример 2: а = 2, b = -2, ответ: 0.25
    // Пример 3: а = 3, b = 0, ответ: 1

    public static void main(String[] args)
    {
        Task4 task4 = new Task4(); // вызываем класс внутри класса для того, чтобы не использовать static
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = Integer.parseInt(iScanner.nextLine()); // вариант 1
        System.out.println("Введите степень:");
        int b = iScanner.nextInt(); // вариант 2
        System.out.printf("%d^%d = %.2f", a, b, task4.exponentiation(a, b)); // вызываем методод из-под класса
        iScanner.close();
    }

    public double exponentiation(int a, int b)
    {
        return Math.pow(a, b);
    }
}
