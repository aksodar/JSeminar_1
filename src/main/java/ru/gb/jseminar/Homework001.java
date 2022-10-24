package main.java.ru.gb.jseminar;
/*
Реализовать функцию возведения числа а в степень b. a, b – целые числа.
Пример 1: а = 3, b = 2, ответ: 9
Пример 2: а = 2, b = -2, ответ: 0.25
//Пример 3: а = 3, b = 0, ответ: 1
 */

import java.util.Scanner;
public class Homework001 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число a: ");
        int a = iScanner.nextInt();
        System.out.printf("Введите число b: ");
        int b = iScanner.nextInt();
        iScanner.close();
        Homework001 homework001 = new Homework001();
        homework001.powerNumber(a, b);
    }
    public void powerNumber(int a, int b){
        int c = 1;
        if (b >= 0){
            for (int i = 0; i < b; i++){
                c *= a;
            }
            System.out.printf("%d в степени %d равно %d \n", a, b, c);
        }
        else {
            double a2 = a;
            double c2 = c;
            for (int i = 0; i < -b; i++){
                c2 *= a2;
            }
            c2 = 1/c2;
            System.out.printf("%d в степени %d равно %.2f \n", a, b, c2);
        }
    }
}
