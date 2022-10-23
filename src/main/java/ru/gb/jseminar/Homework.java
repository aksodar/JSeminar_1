package ru.gb.jseminar;

import java.util.Arrays;
import java.util.Scanner;

public class Homework {

    //На вход некоторому исполнителю подаётся два числа (A, B). У исполнителя есть две команды
    //- команда 1 (к1): увеличить в C раза, A умножается на C
    //- команда 2 (к2): увеличить на D ( +2 ), к a прибавляется D
    //Написать программу, которая выдаёт массив команд, позволяющий число A превратить в число B или сообщить,
    // что это невозможно
    //Пример 1: а = 1, b = 7, c = 1, d = 3
    //ответ: [к1, к1, к1, к1, к1, к1] или [к1, к2, к1, к1, к1] или [к1, к1, к2, к1].
    //Пример 2: а = 11, b = 7, c = 2, d = 1
    //ответ: [].
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        sc.close();
        Homework hw = new Homework();
        String result = "";
        System.out.println(Arrays.toString(hw.doIt(a, b, c, d, result)));

    }
    public String[] doIt(int a, int b, int c, int d, String res){
        if (b < a){
            return new String[0];
        } else if (a == b){
            return new String[]{res};
        } else {
            if (a * c <= b){
                a *= c;
                res += "k1, ";
            } else {
                a += d;
                res += "k2, ";
            } return doIt(a, b, c, d, res);
        }
    }
}
