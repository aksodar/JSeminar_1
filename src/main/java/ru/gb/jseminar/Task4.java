package ru.gb.jseminar;

public class Task4 {

    //Реализовать функцию возведения числа а в степень b. a, b – целые числа.
    //
    //Пример 1: а = 3, b = 2, ответ: 9
    //Пример 2: а = 2, b = -2, ответ: 0.25
    //Пример 3: а = 3, b = 0, ответ: 1
    public static void main(String[] args) {        
        Task4 task4 = new Task4();
        System.out.println(task4.exponentiation(3, 2));
        System.out.println(task4.exponentiation(2, -2));
        System.out.println(task4.exponentiation(3, 0));
    }

    public double exponentiation(int a, int b){
        
        //return Math.pow(a, b);
        
        // или

        double result = 1;
        if (b < 0) {
            for (int i = 0; i < -b; i++) {
                result /= a;
            }
        }
        else {
            for (int i = 0; i < b; i++) {
                result *= a;
            }
        }
        return result;
    }
}
