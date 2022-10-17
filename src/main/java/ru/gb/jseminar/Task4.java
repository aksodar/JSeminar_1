package ru.gb.jseminar;

public class Task4 {

    //Реализовать функцию возведения числа а в степень b. a, b – целые числа.
    //
    //Пример 1: а = 3, b = 2, ответ: 9
    //Пример 2: а = 2, b = -2, ответ: 0.25
    //Пример 3: а = 3, b = 0, ответ: 1
    public static void main(String[] args) {

		int numA = 3;
        int numB = 2;
		
		Task4 task4 = new Task4();

		double number = task4.exponentiation(numA, numB);
		System.out.println(number);
    }

    public double exponentiation(int a, int b){

        double result = Math.pow(a, b);
        
        return result;
    }
}
