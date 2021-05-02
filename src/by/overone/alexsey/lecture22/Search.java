package by.overone.alexsey.lecture22;

import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        int[] array = {1, -7, 5, 1, 3, 6, 9, 10, 12, 1, 2, 4, 6, 3, 14,16};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int findNumber =-5;
        System.out.println(recursiveBinarySearch(array, 0, array.length-1, findNumber));
        System.out.println(binarySearch(array, 0, array.length-1, findNumber));
    }

    public static int binarySearch(int[] array, int low, int high, int number) {
        if (low > high) {
            return -1;
        }
        int middleIndex = (low+high)/2;

        if (array[middleIndex] == number) {
           return middleIndex;
        } else if (array[middleIndex] > number) {
            return binarySearch(array, low, middleIndex - 1, number);
        } else  {//(array[middleIndex] < number)
            return binarySearch(array, middleIndex + 1, high, number);
        }
    }

    public static int recursiveBinarySearch(int arr[], int firstElement, int lastElement, int elementToSearch) {

        // условие прекращения
        if (lastElement >= firstElement) {
            int mid = firstElement + (lastElement - firstElement) / 2;
            System.out.println("(recursiveBinarySearch)middle -> " + mid);

            // если средний элемент - целевой элемент, вернуть его индекс
            if (arr[mid] == elementToSearch)
                return mid;

            // если средний элемент больше целевого
            // вызываем метод рекурсивно по суженным данным
            if (arr[mid] > elementToSearch)
                return recursiveBinarySearch(arr, firstElement, mid - 1, elementToSearch);

            // также, вызываем метод рекурсивно по суженным данным
            return recursiveBinarySearch(arr, mid + 1, lastElement, elementToSearch);
        }
        return -1;
    }
}
