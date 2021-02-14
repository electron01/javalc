package by.overone.alexsey.lecture4;


public class Lecture4 {
    public static void main(String[] args) {
        int x = 10;
        x = x++;
        x = x++;

        System.out.println("x = " + x);


        x = ++x;
        x = ++x;
        System.out.println("++x = " + x);

        System.out.println("=====If/ElseIf=====");
        int var = 1;
        if (var == 1) {
            System.out.println("var = 1");
        } else if (var == 2) {
            System.out.println("var = 2");
        } else if (var == 3) {
            System.out.println("var = 3");
        } else if (var == 4) {
            System.out.println("var = 4");
        } else if (var == 5) {
            System.out.println("var = 5");
        }
        System.out.println("=====if/elseif=====");


        System.out.println("=====Switch=====");
        //int var = 1;
        switch (var) {
            case 1:
                System.out.println("Var = 1");
                break;
            case 2:
                System.out.println("Var = 2");
                break;
            case 3://if(var==3)
                System.out.println("Var = 3");
                break;
            case 4:
                System.out.println("Var = 4");
                break;
            case 5:
                System.out.println("Var = 5");
                break;
            default:
                System.out.println("Error!");
                break;

        }
        System.out.println("=====Switch=====");

 /*       char[] array1 = new char[5];
        System.out.println(Arrays.toString(array1));*/


        int test1 = 30;
        if (test1 % 2 != 0 || (test1 >= 10 && test1 <= 25)) {
            //(false || (true && false) )
            //false || false

            System.out.println("Test1 correct");
        }


        int test2 = 2;
        if (test2 % 2 == 0 && test2 > 0) {
            System.out.println("Test2 correct");
        }


        boolean isFound = false;
        int number = 11236798;
        int[] array = {1123, 1123, 1123, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                isFound = true;
                System.out.println("number index = " + i);

            }
        }

//        if(!false)
//        if(true)
        if (!isFound) {// -> if(isFound==true)
            System.out.println("number not found!");
        }
        int test0 = 10;
        if (test0 >= 100 && test0 <= 999) {
        }
        //String test01 = test0 + "";


        int test4 = -46;
        if (test4 > -50 && test4 < -45) {
            System.out.println("TEST 4 CORRECT");
        }

//        System.out.println(-1/0.0);


        int[][] array2 = new int[5][5];

        int[][] array02 = {
                {1, 2},
                {4, 5, 6, 7},
                {7, 8, 9, 12, 12, 13},
                {10, 11, 12}
        };


        System.out.println("=====2DArray=====");

        for (int i = 0; i < array02.length; i++) {
            for (int j = 0; j < array02[i].length; j++) {
                System.out.print(array02[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=====2DArray=====");


        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

//        for (int element : testArray) {
//            element = element + 100;
//            System.out.println(element);
//
//        }

        for (int element : testArray) {
            System.out.println(element);

        }



    }

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


}
