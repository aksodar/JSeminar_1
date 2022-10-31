package ru.gb.jseminar;

public class Task3 {

    //Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
    public static void main(String[] args) {
        Task3 task3 = new Task3();
        double [] array = {1,1,1,1,1,1};
        int a = task3.count(array);
        System.out.println(a);
    }

    public int count(double[] array){
        int count = 0;
        int max = 0;
        for (double item : array ){
            if (item == 1){
                count++;
            }
                else {
                    if (count > max) {
                        max = count;
                        count = 0;
                    }
            }
        }
        if (count > max) {
            max = count;
        }
        return max;
    }
}
