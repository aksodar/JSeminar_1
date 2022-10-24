package main.java.ru.gb.jseminar;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;
public class Task2_2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите Имя: ");
        String name = iScanner.nextLine();
        iScanner.close();
        LocalDateTime currentTime = LocalDateTime.now();
        int currentHour = currentTime.getHour();
        if (currentHour >= 5 && currentHour < 12){
            System.out.printf("Доброе утро, %s! \n", name);
        }
        else if (currentHour >= 12 && currentHour < 18){
            System.out.printf("Добрый день, %s! \n", name);
        }
        else if (currentHour >= 18 && currentHour < 23){
            System.out.printf("Добрый вечер, %s! \n", name);
        }
        else if (currentHour >= 23 && currentHour < 5){
            System.out.printf("Доброй ночи, %s! \n", name);
        }
    }
}
