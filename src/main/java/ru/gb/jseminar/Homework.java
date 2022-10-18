package ru.gb.jseminar;


import java.util.Random;

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

        Homework hw = new Homework();
        int a = 1;
        int b =7;
        int c =1;
        int d = 3;
        hw.Task(a ,  b ,  c , d, " ");
    }

    public  static double k1(double a, double c){
        a = a * c;
        return a;
    }
    public  static double k2(double a, double d){
        a = a + d;
        return a;
    }
    public   void Task(double a , double b , double c ,double d, String path){
        Random rand = new Random();
        double sourse = a ;
        while (a != b){
            a = sourse;
            while (a < b) {

                int numb =  rand.nextInt(3);
                if (b - a == d) {
                    a = k2(a, d);
                    System.out.println(path + "k2 ");

                    break;
                }
                else if (b / a == c) {
                    a = k1(a, c);
                    System.out.println(path + "k1 ");
                    break;
                }

                if (numb == 1) {
                    a = k1(a, c);
                    System.out.println(path + "k1 ");
                } else if (numb == 2) {
                    a = k2(a, d);
                    System.out.println(path + "k2 ");
                }
                if(a > b){
                    System.out.println("а>b: Не получилось привести а к b");
                }


            }

        }

    }

}
