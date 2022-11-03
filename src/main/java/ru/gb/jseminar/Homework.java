package ru.gb.jseminar;

import java.util.Scanner;

public class Homework {

    //На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть две команды
    //- команда 1 (к1): увеличить в с раза, а умножается на c
    //- команда 2 (к2): увеличить на d ( +2 ), к a прибавляется d
    //Написать программу, которая выдаёт массив команд, позволяющий число a превратить в число b или сообщить, что это невозможно
    //Пример 1: а = 1, b = 7, c = 1, d = 3
    //ответ: [к1, к1, к1, к1, к1, к1] или [к1, к2, к1, к1, к1] или [к1, к1, к2, к1].
    //Пример 2: а = 11, b = 7, c = 2, d = 1
    //ответ: [].
    public static void main(String[] args)
    {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число A:");
        int a = iScanner.nextInt();
        System.out.println("Введите число B:");
        int b = iScanner.nextInt();
        System.out.println("Введите шаг C:");
        int c = iScanner.nextInt();
        System.out.println("Введите шаг D:");
        int d = iScanner.nextInt();
        Commands(a, b, c, d);
        iScanner.close();
    }

    public static Void Commands(int a, int b, int c, int d)
    {
        String commands = "";
        String k1 = "k1 ";
        String k2 = "k2 ";
        int tempB = b;
        if (a < b)
        {
            while (a < tempB)
            {
                if (c != 0 && tempB % c == 0 && c != 1 && tempB / c >= a)
                {
                    commands = k1 + commands;
                    tempB /= c;
                }
                else
                {
                    commands = k2 + commands;
                    tempB = tempB - d;
                }
            }
            if (tempB != a)
            {
                commands = "";
                tempB = b;
                while (a < tempB)
                {
                    commands = k2 + commands;
                    tempB = tempB - d;
                }
                if (tempB != a)
                {
                    System.out.println("Невозможно привести A к значению B с помощью данных команд");
                }
                else
                {
                    System.out.println(commands);
                }
            }
            else
            {
                System.out.println(commands);
            }
        }
        else if (a == b)
        {
            System.out.println("A и без команд равна B");
        }
        else
        {
            System.out.println("Невозможно привести A к значению B с помощью данных команд");
        }
        return null;
    }
}
