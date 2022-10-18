package ru.gb.jseminar;

import java.util.Scanner;

public class Task4 {

    //Реализовать функцию возведения числа а в степень b. a, b – целые числа.
    //
    //Пример 1: а = 3, b = 2, ответ: 9
    //Пример 2: а = 2, b = -2, ответ: 0.25
    //Пример 3: а = 3, b = 0, ответ: 1
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите  первое число: ");
        double numb1  = iScanner.nextDouble();

        System.out.printf("Введите  второе число: ");
        double numb2  = iScanner.nextDouble();

        double res = Pow(numb1, numb2);

        System.out.println(res);
    }

    public  static  double Pow(double a , double b){
        double res = 1;
        if (b > 0) {
            while (b > 0) {
                res = res * a;
                b--;
            }

        }
        else if (b < 0){
            while (b < 0) {
                res = res * a;
                b++;
            }
            res = 1/res;
        }
        return res;
    }
}
