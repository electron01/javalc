package by.overone.alexsey.javaonline.task1.class17;

public class Sort {
    public static void main(String[] args) {
        int[] array = {-5, 6, 4, 3, 8, 1, 0, 7, 4, 2, 1, 0};
        //-5 0 4 3 8 1 6 7 4 2 1 0
        // -5 0 0 3 8 1 6 7 4 2 1 4
        // -5 0 0 1 8 3 6 7 4 2 1 4

        /**
         * Сортировка Выбором
         * С помощью мин зн-я и с помощью макс зн-я
         * **/

        System.out.println("==================");
        selectionSort(array);

        System.out.println("==================");
        selectionSort2(array);

        System.out.println("==================");
        int[] arr = {-5, 6, 4, 3, 8, 1, 0, 7, 4, 2, 1, 0};
        bubbleSort(arr);
    }

    public static void selectionSort(int[] numbers) {
        int min, temp;
        for (int i = 0; i < numbers.length - 1; i++) {
            min = i;//min = 0;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[min]) {
                    min = j;
                }
            }
            temp = numbers[min];
            numbers[min] = numbers[i];
            numbers[i] = temp;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void selectionSort2(int[] numbers) {
        int max, tmp;
        for (int i = numbers.length - 1; i > 0; i--) {
            max = i;
            for (int j = i - 1; j >= 0; j--) {
                if (numbers[j] > numbers[max]) {
                    max = j;
                }
            }
            tmp = numbers[max];
            numbers[max] = numbers[i];
            numbers[i] = tmp;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }

    public static void bubbleSort(int[] mas) {
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;
                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
            }
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }
    }
}
