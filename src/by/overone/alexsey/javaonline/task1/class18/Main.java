package by.overone.alexsey.javaonline.task1.class18;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        WorkBD workBD = WorkBD.getInstance();
        workBD.sqlMethod("Sasa");
        int[] array = {8, 0, 4, 7, 3, 7, 10, 12, -3};
        //-3 0 4 7 3 7 10 12 8
        //[-3,0,3] [4,7] [7,8] [10,12]
        System.out.println("Original array");
        System.out.println(Arrays.toString(array));
        quickSort(array, 0, array.length-1);
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)//завершить выполнение сортировки если длина массива = 0
            return;

        if (low >= high)
            return;//завершить выполнение если уже нечего делить, массив отсортирован

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }

        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);
        //[-3,0,3]

        if (high > i)
            quickSort(array, i, high);
        //[7,4,7,10,12,8]
    }
}
