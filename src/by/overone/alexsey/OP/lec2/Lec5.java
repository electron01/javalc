package by.overone.alexsey.OP.lec2;

import java.util.Arrays;

public class Lec5 {
//      Задание 1
//      Создать массив заполнить его числами от 1 до 100, вывести только те числа, которые делятся на 3 или 5
//      Задание 2
//      Создать массив с числами и отсортировать его в порядке Убывания!
//      Задание 3
//      Создать массив с числами, и проверить если там число 3, если есть вывести "Число 3 соддержится в массиве"
    public static void main(String[] args) {
        int[]array ={5,4,7,1,2,3,9,0,12};
        Arrays.sort(array); //sort
        for(int element:array){//Вывод в консоль
            System.out.println(element);
        }
        for(int i=0; i<array.length/2;i++){ //Reverse
            int temp =array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        System.out.println("В обратном порядке");
        for(int element:array){//Вывод в консоль
            System.out.println(element);
        }
        int totalSum=0;
        for (int i=0;i<array.length;i++){ //Посчтитать сумму всех элементов
            totalSum+=array[i];


        }
        System.out.println("totalSum = " +totalSum);
    }


}
