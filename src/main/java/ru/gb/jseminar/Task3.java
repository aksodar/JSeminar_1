package ru.gb.jseminar;

public class Task3 {

    //Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
    public static void main(String[] args) {
        double [] arr = { 1, 1, 0, 1, 1, 1, 1, 1 };
        Task3 task3 = new Task3();
        int result = task3.count(arr);
        System.out.println(result);
    }

    public int count(double[] array){
        int counter = 0;
        int maxim = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                counter ++;
                if (counter > maxim) maxim = counter;
                }
            else counter = 0;
        }
        return maxim;
    }
}
