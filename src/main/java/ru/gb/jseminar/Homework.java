package ru.gb.jseminar;

import java.util.ArrayList;
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
        Homework homework = new Homework();
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("a = ");
        int a = Integer.parseInt(iScanner.nextLine());
        System.out.printf("b = ");
        int b = Integer.parseInt(iScanner.nextLine());
        System.out.printf("c = ");
        int c = Integer.parseInt(iScanner.nextLine());
        System.out.printf("d = ");
        int d = Integer.parseInt(iScanner.nextLine());
        System.out.printf("to make a = b do the following steps: %s", homework.doIt(a,b,c,d));
        iScanner.close();
    }

    public ArrayList<String> doIt(int a, int b, int c, int d){
       ArrayList<String> answer = new ArrayList<String>();
       ArrayList<String> message = new ArrayList<String>();
       message.add("I'm afraid it's impossible");
       while (a<b){
        if (b%c ==0 & b/c >= a  & c!=1){
            answer.add(0,"k1");
            b = b/c;
        }
        else{
            answer.add(0,"k2");
            b = b-d;
        }
       }
       if (a==b) return answer;
       else return message;
    }

}
