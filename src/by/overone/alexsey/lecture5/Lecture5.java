package by.overone.alexsey.lecture5;

import java.util.Arrays;

public class Lecture5 {
    public static void main(String[] args) {
        //Задания:
        //1)Вывести в консоль одномерный массив в обратном порядке
        //2)Поменять местами значения двух строк в двумерном массиве, то есть, например:
        //2a) было : 1 2 3   -> хочу поменять 1 и 2 строку местами  =>  4 5 6
        //4 5 6                                              1 2 3
        //7 8 9                                              7 8 9
        //2б) было : 1 2 3   -> хочу поменять 1 и 3 строку местами  =>  7 8 9
        //4 5 6                                              4 5 6
        //7 8 9                                              1 2 3
        //3) Выполнить любой пример с switch

        //1 task
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = array1.length - 1; i >= 0; i--) {
            System.out.print(array1[i] + " ");
        }


        //2task
        int[][] array2d = {
                {1, 2, 3},//0 //sum = 6
                {4, 5, 6},//1 //sum = 15
                {7, 8, 9}//2 // sum  = 24
        };
        int[] sumStrArray = new int[array2d.length];
        int sum = 0;
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
//               sumStrArray[i]=sumStrArray[i] + array2d[i][j];
                //sumStrArray[i]+=array2d[i][j];
                sum += array2d[i][j];

            }
            sumStrArray[i] = sum;
            sum = 0;
            System.out.println();
        }

        System.out.println(Arrays.toString(sumStrArray));

        System.out.println();

//        int row1 = 1;
//        int row2 = 0;

        int column1 = 0;
        int column2 = 2;

        int tmp;
        for (int i = 0; i < array2d.length; i++) {
            tmp = array2d[i][column1];
            array2d[i][column1] = array2d[i][column2];
            array2d[i][column2] = tmp;
        }



      /*  for (int j = 0; j < array2d[row1].length; j++) {
            tmp = array2d[row1][j];
            array2d[row1][j] = array2d[row2][j];
            array2d[row2][j] = tmp;
        }*/

        //Вывод массива
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                System.out.print(array2d[i][j] + " ");
            }
            System.out.println();
        }

        char[] word = {'l', 'e', 'v', 'e', 'l',};

        boolean isPalindrom = true;
//        for (int i = 0, j = word.length - 1; i < word.length; i++, j--) {
////            if (word[i] == word[j]) {
////                isPalindrom=true;
////                continue;
////            } else {
////                isPalindrom=false;
////                break;
////            }
////
////        }
//        for(int i=0; i<word.length/2;i++){
////            //l e v e l
////            //l ! =l
////            //e ! = e
////
////            if(word[i]!=word[word.length-1-i]){
////                isPalindrom=false;
////                break;
////            }
////        }
        String stringWord = "level";
        for (int i = 0; i < stringWord.length() / 2; i++) {
//            //L e v e l
            if (stringWord.toLowerCase().charAt(i) != stringWord.toLowerCase().charAt(stringWord.length() - 1 - i)) {
                isPalindrom = false;
                break;
            }
        }


        System.out.println(isPalindrom);
        System.out.println("SORT!!!!!!!");

        int[] sortArray = {7, 4, 2, -3, 0, 1, 2, 9, 8, 1};
        int minIndex;
        int n;
        for(n=0;n<sortArray.length;n++) {
            minIndex=n;
            for (int i = n; i < sortArray.length; i++) {
                if (sortArray[minIndex] > sortArray[i]) {
                    minIndex = i;
                }
            }
           // System.out.println(sortArray[minIndex]);
            int temp = sortArray[minIndex];
            sortArray[minIndex] = sortArray[n];
            sortArray[n] = temp;
        }

        System.out.println(Arrays.toString(sortArray));



    }
}
