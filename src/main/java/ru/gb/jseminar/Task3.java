package ru.gb.jseminar;

public class Task3 {

    //Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,0,1,1,1,1,0,1};
        int result = count(arr);
        System.out.println(result);
    }

    public static int count(int[] array) {
        int count = 0;
        int max = 0;
        for (int item : array) {
            if (item == 1) {
                count++;
            }
            else {
                if (count > max) {
                    max = count;
                    count = 0;
                }
            }
        }
        return max;
    }
}
