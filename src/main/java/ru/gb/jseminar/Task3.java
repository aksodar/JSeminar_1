package ru.gb.jseminar;


public class Task3 {

    //Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
    public static void main(String[] args) {
        Task3 task3 = new Task3();
        int[] arr = {1, 1, 0, 1, 1, 1, 1};
        int result = task3.count(arr);
        System.out.printf(String.valueOf(result));
    }

    public int count(int[] array){
        int countIndex = 0;
        int maxOnes = 0;
        for (int item : array) {
            if (item == 1) {
                countIndex++;
            }
            else {
                if (maxOnes < countIndex) maxOnes = countIndex;
                countIndex = 0;
            }
        }
        if (maxOnes < countIndex) maxOnes = countIndex;
        return maxOnes;
    }
}
