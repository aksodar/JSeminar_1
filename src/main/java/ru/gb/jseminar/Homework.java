package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.List;

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
        Homework h = new Homework();
        int a=1;
        int b=7;
        int c=2;
        int d=3;
        System.out.println(h.doIt(a,b,c,d));

    }

    public List<String> doIt(int a, int b, int c, int d){
        List <String> arr= new ArrayList<>();
        int i=0;

        if (a>b){
            System.out.println("Невозможно ");
        }
        else {
            while (b!=a){
                if (b%c==0){
                    b=b/c;
                    arr.add(i, "k1");
                    i+=1;
                    System.out.println(b);
                }
                else {
                    if (b-d<a){
                        System.out.println("Невозможно ");
                        break;
                    }
                    b=b-d;
                    arr.add(i, "k2");
                    System.out.println(b);
                }
            }
        }
        return arr;
    }

}
