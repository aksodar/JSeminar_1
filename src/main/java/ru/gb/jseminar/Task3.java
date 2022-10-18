package ru.gb.jseminar;

public class Task3 {

    //Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
    public static void main(String[] args) {
        Task3 task3 = new Task3();
        double[] newArray = {1, 1, 0, 1, 1, 1};

        System.out.println(task3.count(newArray));
    }

    public int count(double[] array){
        int max = 0;
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                max += 1;
            }
            else {
                if (max > result) {
                    result = max;
                }
                max = 0;
            }
        }
        if (max > result) {
            result = max;
        }
        return result;
    }
}
