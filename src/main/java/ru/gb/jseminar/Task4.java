package ru.gb.jseminar;
import java.util.Scanner;
public class Task4 {

    //Реализовать функцию возведения числа а в степень b. a, b – целые числа.
    //
    //Пример 1: а = 3, b = 2, ответ: 9
    //Пример 2: а = 2, b = -2, ответ: 0.25
    //Пример 3: а = 3, b = 0, ответ: 1
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Math.pow(3, -0));

    }

    public int pow(int value, int powValue) {
        int result = 1;
        for (int i = 1; i <= powValue; i++) {
            result = result * value;
        }
        return result;

    }

    public double exponentiation(int a, int b){
        return 0;
    }
}
