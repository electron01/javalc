package by.overone.alexsey.OP.lec2;

import java.util.Arrays;

public class Lec4 {
    public static void main(String[] args) {
        int num = 5;
        int rez = 1;
        for (int i = 2; i <= num; i++) {
            rez *= i;//rez = rez* i
            //rez =1 1 =1*2 =2; rez =2; 2 = 2*3; rez =6
        }
        System.out.println(rez);

        int i1 = 2;
        int rez2 = 1;
        while (i1 <= num) {
            rez2 *= i1;
            i1++;
        }
        System.out.println(rez2);
        System.out.println("=====Array=====");
//        int[] array =new int[10];
        int[] array = {6, 2, 9, 1, 3, 5, 4, 8, 7};
        for (int x : array) {
            System.out.println(x);
        }
        System.out.println("=====Array=====");
        Arrays.sort(array);//Sort Array

        System.out.println("=====SortArray=====");
        for (int x : array) {
            System.out.println(x);
        }
        System.out.println("=====SortArray=====");
//        System.out.println(array[10]);//Ошибка выход за предел массива
        System.out.println("=====Swap=====");
        int a = 1;
        int b = 2;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

//2 Способ
/*        int a=1;
        int b=2;
        System.out.println("a = " +a);
        System.out.println("b = " +b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a = " +a);
        System.out.println("b = " +b);*/

//      Задание 1
//      Создать массив, заполнить числами, и почитать сумму, всех чисел из массива
//      Задание 2
//      Создать массив заполнить его числами от 1 до 100, вывести только те числа, которые делятся на 3 или 5
//      Задание 3
//      Создать массив с числами и отсортировать его в порядке Убывания!


    }
}

