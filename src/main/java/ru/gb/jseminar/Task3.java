package ru.gb.jseminar;

public class Task3 {

    //Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
    public static void main(String[] args) {
        Task3 task3 = new Task3();
        double[] array = new double[] {1,1,0,1,1,1};
        System.out.println(task3.count(array));
    }

    public int count(double[] array){
        int counter = 0;
        int max = 0;
        for (double item : array) {
            if (item == 1){
                counter ++;
            }
            else{
                if (counter > max){
                    max = counter;
                }
                counter = 0;
            }
        }
        if (counter > max) max = counter;
        return max;
    }
}

