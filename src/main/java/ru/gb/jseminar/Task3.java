package ru.gb.jseminar;

public class Task3 {

    // Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное
    // количество подряд идущих 1.
    public static void main(String[] args) {
        double[] array = new double[] {0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1};
        Task3 t3 = new Task3();
        System.out.println(t3.count(array));

    }

       public int count(double[] array) {
        int counter = 0;
        int maxCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1){
                counter++;
                if (counter > maxCounter)
                    maxCounter = counter;
            }
            else {
                if (counter > maxCounter)
                    maxCounter = counter;
                counter = 0;
            }
        }
        return maxCounter;
    }
}
