package ru.gb.jseminar;

public class Task3_1 {
    public static void main(String[] args) {
        Task3_1 task3 = new Task3_1();
        int result = task3.count(new double [] {1,1,1,1,0,1,1,1,1,1,0,0,1,1,1,1,1,1,1});
        System.out.println(result);
    }
    public int count(double[] array) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count += 1;
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
