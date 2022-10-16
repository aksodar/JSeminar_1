package ru.gb.jseminar;

import java.util.Arrays;
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
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число a: ");
        int a = iScanner.nextInt();
        System.out.printf("Введите число b: ");
        int b = iScanner.nextInt();
        System.out.printf("Введите шаг множителя с: ");
        int C = iScanner.nextInt();
        System.out.printf("Введите шаг сложения d: ");
        int d = iScanner.nextInt();
        String[] V = Homework.step(a, b, C, d);
        System.out.printf(Arrays.toString(V));
    }

    public static String[] step(int a, int b, int c, int d) {
        String command = " ";
        StringBuilder result = new StringBuilder();
        int number = a;
        if (a < b) {
            while (number != b) {

                if (b % c == 0) {            //если добавить условие с>1, ответ измениться на [k2, k2]
                    number += 1;
                    command = "k1, ";
                    result.append(command);
                } else {
                    number += d;
                    command = "k2, ";
                    result.append(command);

                }
            }
        }
        return new String[]{String.valueOf(result)};
    }
}


