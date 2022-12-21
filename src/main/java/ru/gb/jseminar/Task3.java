package ru.gb.jseminar;
import java.util.Scanner;


public class Task3 
{

    //Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
    public static void main(String[] args)
    {
        double[] array = new double[] {0,1,1,0,1,1,1,1};
        System.out.printf("Масксимальное количестово '1', идущих в ряд: %d!", Count(array));
    }

    public static int Count(double[] array)
    {
        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == 1)
            {
                count++;
            }
            if (array[i] != 1 )
            {
                if (maxCount < count)
                {
                    maxCount = count;
                }
                count = 0;
            }
            if (i == array.length - 1)
            {
                if (maxCount < count)
                {
                    maxCount = count;
                }
            }
        }
        return maxCount;
    }
}
