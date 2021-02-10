package by.overone.alexsey.lecture3;


public class Main {
    public static void main(String[] args) {
        boolean t1 = true;
        boolean t12 = false;


        //|| - или or
        //&& - and - и

        int i = 100_000;
        while (i < 10) {
            System.out.println(i);
            i++;

        }

        do {
            System.out.println(i);
            i++;

        } while (i < 10);
        int[] array = new int[11];
        System.out.println("====For====");

        for (int element : array) {//Вывод
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("====For====");
        // boolean test = (9 > 10) & (120 / 0 == 0);
        System.out.println(128 | 32);
        //1 0 0 0 0 0 0 0
        //0 0 1 0 0 0 0 0
        //----------------
        //1 0 1 0 0 0 0 0

        int x1 = 3;
        int x2 = 4;
        int x3 = x2;
        x2 = x1;
        x1 = x3;
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);

        System.out.println("====Break====");

        for (int k = 1; k < 100; k++) {
            System.out.println(k);
            if (k % 2 == 0 && k > 10) {
                break;
            }

        }
        System.out.println("====Break====");

        System.out.println("====Continue====");
        for (int k = 1; k < 10; k++) {
            if (k == 5) {
                continue;
            }
            System.out.println(k);

        }
        System.out.println("====Continue====");
        int[][] array2 = new int[3][3];//двумерный массив
    }

//    Задание:
//            1)Создать число int, inx x = например 12, и проверить, что данное число не делится на 2, и находиться в диапазоне от 10 до 25 включительно, проверять с помощью  if
//            2)Создать число int, inx x = например -10, и проверить, что данное число делится на 2, и является положительным числом, проверять с помощью  if
//            3)Создать массив заполнить его различными цифрами, затем в цикле найти корректное число, с помощью if, вывести в консоль индекс данного элемента и после этого остановить цикл,
//            если данного числа в цикле нет, вывести в консоль «number not found»

}


