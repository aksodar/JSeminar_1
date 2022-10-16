package ru.gb.jseminar;

import java.lang.reflect.Array;

public class Task3 {

    //Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
    public static void main(String[] args) {
        Task3 task3 = new Task3();
        int[] arr = {1, 1, 0, 1, 1, 1, 1, 1, 1, 0};
        int result = task3.count(arr);
        System.out.println(result);

    }

    public int count(int[] array){
        int count1 = 0;
        int max1 = 0;

        for (int item: array){
            if (item == 1){
                count1++;
            }
            else {
                if (count1 > max1){
                    max1 = count1;
                }
                count1 = 0;
                }
            }
        if (count1 > max1){
            max1 = count1;
        }

        return max1;
    }
}
