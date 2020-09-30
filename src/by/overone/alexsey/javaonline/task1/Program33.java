package by.overone.alexsey.javaonline.task1;

public class Program33 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean isTest = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 5) {
                isTest = true;
                System.out.println("Число 5 есть в массиве");
                break;
            }
        }
        if (!isTest) {
            System.out.println("Числа 5 в массиве нет");
        }

        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array2[i] % 2 == 0) {
                sum2 += array2[i];
            } else {
                sum += array[i];
            }

        }
        System.out.println("sum = " + sum);
        System.out.println("sum2 = " + sum2);


        for (int i = 0; i < array2.length; i++) {
            if (array2[i] % 3 == 0) {
                System.out.println(array2[i]);
            }

        }

        //if
        //if
        //if

        //if
        //else if

        //if
        //else if
        //else


        String[] arrayString = new String[10];
        arrayString[0] = "Hello";
        arrayString[0] = "1";//->1
        arrayString[0] = "3";
        arrayString[0] = "true";
        arrayString[0] = "20.3";

        int[][] array2d = {{1, 2, 3}, {4, 6}, {7, 8, 9}};
        int[][] array2d222 = new int[3][2];

        //{1,2,3,4,5,6,7,8,9,10}
        //{1,2,3} -> 0 строка
        //{4,6} -> 1
        //{7,8,9} -> 2
        //Массив массивов
        //массив, элементы которого тоже явл-ся массивами
        //{1,2,3,4,5,6,7,8,9,10}
        //{ {1,2,3}, {4,6}, {7,8,9} }
        System.out.println(array2d[2][0]);

        for (int i = 0; i < array2d.length; i++) {//i=0
            for (int j = 0; j < array2d[i].length; j++) {//j=0..j=1..j=2
                System.out.print(array2d[i][j] + " ");
            }
            System.out.println();
        }

        byte bt = 100;
        int x = bt;
        //авто-ое преобразование (неявное)

        int x1 = 1629;
        byte bt1 = (byte) x1;
        System.out.println(bt1);
        //bt1 = 1;
        //byte {-128,127}
        //явное преобразование

        char ch = '?';//2 byte
//        short x2 = ch; //2 byte - short
        int x2 = ch;

        float fl = 128.99f;
        int x3 = (int)fl;
        System.out.println(x3);

        int x4 =1234553678;
        //0101
        float fl2 =x4;
        System.out.println(fl2);


        long lg =1234553678456784563l;
        //0101
        float fl3 =lg;
        System.out.println("float fl3 = "+fl3);
        System.out.println("long lg = "+lg);

        long lg1 =1234553678456784563l;
        //0101
        double db =lg;
        System.out.println("double db = "+ db);

        System.out.println("====Break=====");
        for(int i =0; i<10;i++){
            if(i==6){
                break;
            }
            System.out.println(i);
        }
        System.out.println("====Break=====");

        System.out.println("====continue=====");
        for(int i =0; i<10;i++){
            if (i==6){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("====continue=====");






        //short{-32...; + 32...}
        //{0..+65...} char

    }
}


