package ru.gb.jseminar;

public class Task3 {

    //Дан массив двоичных чисел, например [1,1,0,1,1,1,], вывести максимальное количество подряд идущих 1.
    public static void main(String[] args) {
        double [] ar = new double []{1,1,0,1,1,1,1,0};
        int kol = count(ar);
        System.out.printf(" максимальное количество подряд идущих 1 = %s", kol);


    }

  
    public static int count(double[] array){
        int [] temp = new int [array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
                if (array[i] == 1){
                    temp[j]++;
                   
                }
                else{
                    j++;
                }}
        int max = temp[0];
            
            for (int k : temp) {
                if (k > max){
                    max = k;

                }
            }

        return max;
    }
}
