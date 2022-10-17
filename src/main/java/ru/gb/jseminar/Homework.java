package ru.gb.jseminar;

public class Homework {

    //На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть две команды
    //- команда 1 (к1): увеличить в C раза, A умножается на C
    //- команда 2 (к2): увеличить на D ( +2 ), к A прибавляется D
    //Написать программу, которая выдаёт массив команд, позволяющий число A превратить в число B или сообщить, что это невозможно
    //Пример 1: а = 1, b = 7, c = 1, d = 3
    //ответ: [к1, к1, к1, к1, к1, к1] или [к1, к2, к1, к1, к1] или [к1, к1, к2, к1].
    //Пример 2: а = 11, b = 7, c = 2, d = 1
    //ответ: [].
    public static void main(String[] args) {
        Homework homework = new Homework();
        String[] result[] = homework.doIt(1, 7, 1, 3);
        System.out.println(result);

    }

    public String[] doIt(int a, int b, int c, int d){
        String[] result = new String[]{};
        if ()

        return new String[]{};
    }

}
