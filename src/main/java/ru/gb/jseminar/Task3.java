package ru.gb.jseminar;

public class Task3 {

    //Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
    public static void main(String[] args) {
        double [] arr = {1,1,0,1,1,1,1,0,0,1,1,0,0};
        Task3 task3 = new Task3();
        int result = task3.count(arr);
        System.out.println(result);

    }

    public int count(double[] array){
        int count = 0;
        int max = 0;
        for (double item : array){
            if (item == 1){
                count ++;
            }
            else {
                if (count > max){
                    max = count;
                }
                count = 0;
            }
        }
        if (count > max){
            max = count;
        }

        return max;
    }
}
