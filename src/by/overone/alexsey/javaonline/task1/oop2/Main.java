package by.overone.alexsey.javaonline.task1.oop2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1 2 3  -> 1+2+3=6
        //4 5 6
        //7 8 9
        //10 11 12
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1:");
        int number1 = scanner.nextInt();
        System.out.println("Enter number2:");
        int number2 = scanner.nextInt();
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}}; //меняем местами 1 и 2 столбец
        int temp;
        for (int i = 0; i < array.length; i++) {
            temp = array[i][number1];
            array[i][number1] = array[i][number2];
            array[i][number2] = temp;
        }
        for (int[] a : array) {
            System.out.println(Arrays.toString(a));
        }
        System.out.println("============");
        int sum = 0;
        int[] maxValueArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            maxValueArray[i] = sum;
            System.out.println(sum);
            sum = 0;
        }
        System.out.println(Arrays.toString(maxValueArray));//Вывод массива
//        while (true) {
//            System.out.println("Enter number: ");
//            if (scanner.hasNextInt()) {
//                int number = scanner.nextInt();
//                System.out.println(number);
//                break;
//            } else {
//                scanner.next();
//            }
//        }
        String input = scanner.nextLine();
        System.out.println(input);
//        scanner.next();
        Scanner scanner2 = new Scanner(System.in);
        scanner2.next();
    }
}
