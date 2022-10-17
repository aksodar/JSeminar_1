package ru.gb.jseminar;

import java.util.Scanner;
import java.util.Arrays;;
public class Homework {

    //На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть две команды
    //- команда 1 (к1): увеличить в с раза, а умножается на c
    //- команда 2 (к2): увеличить на d ( +2 ), к a прибавляется d
    //Написать программу, которая выдаёт массив команд, позволяющий число a превратить в число b или сообщить, что это невозможно
    //Пример 1: а = 1, b = 7, c = 1, d = 3
    //ответ: [к1, к1, к1, к1, к1, к1] или [к1, к2, к1, к1, к1] или [к1, к1, к2, к1].
    //Пример 2: а = 11, b = 7, c = 2, d = 1
    //ответ: [].
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);

        System.out.printf("Введите первое число: a = ");
        int a = Integer.parseInt(iScanner.nextLine());

        System.out.printf("Введите второе число: b = ");
        int b = Integer.parseInt(iScanner.nextLine());

        System.out.printf("Введите на сколько умножать: c = ");
        int c = Integer.parseInt(iScanner.nextLine());

        System.out.printf("Введите сколько плюсовать: d = ");
        int d = Integer.parseInt(iScanner.nextLine());

        String[] combinations = Homework.doIt(a, b, c, d);
        System.out.printf(Arrays.toString(combinations));
        iScanner.close();    
    }

    public static String[] doIt(int a, int b, int c, int d) {
        String combination = " ";
        String result = new String();
        while (a != b) {
            int razn = b - a;
            if (razn % 2 == 0) {
                a = a * c;
                razn = razn - a;
                combination = "k1";
                System.out.printf(combination);
            }
            if (razn % 2 == 1) {
                a = a + d;
                razn = razn - a;
                combination = "k2";
                System.out.printf(combination);
            }
        }
        return new String[]{String.valueOf(result)};
    }
}
