package ru.gb.jseminar;

public class Task3 {

    //Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
    public static void main(String[] args) {
        int [] arr = {1, 1, 1, 0, 0, 1, 1, 1, 1, 1};
        Task3 task = new Task3();
        int max = task.getMaxCount(arr);
        System.out.printf("Максимальное количество '1' подряд: %d", max);
    }

    public int getMaxCount(int [] arr) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) count++;
            else {
                if (count != 0) {
                    if (max < count) max = count;
                    count = 0;
                }
            }
            if (count > max) max = count;
        }
        return max;
    }

    public int count(double[] array){

        return 0;
    }
}
