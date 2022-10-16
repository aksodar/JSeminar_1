package ru.gb.jseminar;


public class Task3 {

    //Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
    public static void main(String[] args) {
        int[] Array = new int [] {1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1};
        int count = 0;
        int max = 1;
        for (int i = 0; i < Array.length; i++) {
            if(Array[i] > 0){
                count ++;

            }
            else{
                max = count;
                count = 0;
            }

        }
        System.out.println(max);
    }

    public int count(double[] array){

        return 0;
    }
}
