package ru.gb.jseminar;

public class Task3 {

    //Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
    public static void main(String[] args) {
        int [] arr = new int [] {1,1,0,1,1,1,1,1,1};
        int a = count(arr);
        System.out.println(a);
}
    public static int count(int[] array){
        int max = 0;
        int count = 0;

        for(int i = 0; i < array.length; i++){
            if (array[i] == 1) 
            {
            count ++;
            }
            else 
            {
            if (count > max) max = count;
            count = 0;
            }            
        }
        if (count > max) max = count;
        return max;
}
}