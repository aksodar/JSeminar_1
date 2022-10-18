package ru.gb.jseminar;

public class Task3 {

    //Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
    public static void main(String[] args) {
        Task3 tk = new Task3();
        double[] array = new double[] {1, 1, 0,1,1,1,1, 1,1,1,1,0,1,1,1,0 ,1, 1,1};
        System.out.println(tk.count(array));

    }

    public int count(double[] array){
        int count = 0;
        int max = count;
        for (int i = 0; i < array.length; i++) {
            if(max<count){
                max = count;
            }
            if (array[i] == 1) {
                count += 1;

            }
            else if (array[i] == 0){
                count = 0;
            }
        }
        return max;
    }
}
