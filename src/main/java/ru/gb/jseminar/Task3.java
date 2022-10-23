package ru.gb.jseminar;


public class Task3 {

    //Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
    public static void main(String[] args) {
        double[] array = {1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1};
        Task3 task3 = new Task3();
        System.out.println(task3.count(array));
    }

    public int count(double[] array) {
        int counter = 0;
        int temp = 0;
        for (double j : array) {
            if (j == 0) {
                if (temp > counter) {
                    counter = temp;
                    temp = 0;
                }
            } else {
                temp++;
            }
        } if (temp > counter){
            counter = temp;
        } return counter;
    }
}
