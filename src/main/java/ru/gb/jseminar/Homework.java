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
    public static void main(String[] args) {
        Homework t = new Homework();
        
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("a = ");
        int a = iScanner.nextInt();
        System.out.printf("b = ");
        int b = iScanner.nextInt();
        System.out.printf("c = ");
        int c = iScanner.nextInt();
        System.out.printf("d = ");        
        int d = iScanner.nextInt();
        if (d==1){
            System.out.printf("d не может быть 1, введите другое значение");
            d = iScanner.nextInt();
        }
        StringBuilder dis = t.doIt(a,b,c,d);
        System.out.println(dis);
        // System.out.printf("Последовательность решений: ", t.doIt(a,b,c,d));
        iScanner.close();    
  
    }

    public StringBuilder doIt(int a, int b, int c, int d){
                
        StringBuilder arr = new StringBuilder();
        
        while (a*d<=b){                        
            arr.append("k2");
            a = a*d;
            if (a==b){
                return arr;
            }
        }
        while ((a+c)<=b){
            arr.append("k1");
            a=a+c;
            if (a==b){
                return arr;
            }
        }                
        if (a!=b){
            System.out.println("Нет решений");            
            arr.isEmpty();
            }            
        return arr;

    }
}