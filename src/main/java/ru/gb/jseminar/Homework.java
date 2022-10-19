package ru.gb.jseminar;

import java.util.Arrays;

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
        Homework homework = new Homework();
        System.out.println(Arrays.toString(homework.doIt(1, 17, 3, 2)));
    }

    public String[] doIt(int a, int b, int c, int d){
        if (b % c == a) {
            String[] result = new String[b / c];
            for (int i = 0; i < result.length; i++) {
                result[i] = "k2";
            }
            return result;
        }
        if ((b - a) % d == 0) {
            String[] result = new String[(b - a) / d];
            for (int i = 0; i < result.length; i++) {
                result[i] = "k1";
            }
            return result;
        }
        return new String[]{};
    }
}
