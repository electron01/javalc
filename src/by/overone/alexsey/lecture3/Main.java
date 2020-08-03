package by.overone.alexsey.lecture3;

public class Main {
    public static void main(String[] args) {
        int[] x = new int[100];
        //x[9] =9
        //x[8] =8
        //x[7]=7
        //x[6] =6
        //x[5]=5
        //x[4]=4
        //x[3]=3
        //x[2]= =2
        //x[1]=1
        //x[0]=0
//        //10 elem - 0..9
        for(int i=0;i<100;i++){
            x[i]=i; //Заполняем от 0 до 100

        }
//        System.out.println("=====================");
//        for (int i = 0; i < 100; i++) {
//            System.out.println(x[i]);//Выводт от 0 до 100 в консоль
//        }
//        System.out.println("=======Заполнение массива от 99 до 0=======");
//        int el =0;//В порядке убывания
//        for(int i=99; i>=0;i--){
//            x[i]=el; //el++(0..99) i--(99..0)
//            el++;//Сначало мы заполняем последний эл-т x[99]=0,x[98]=1
//            //x[99]=0 /  Так нужно
//            //x[0]=99
//        }
//
//        int el2=99;
//        for(int i=0; i<100;i++){
//            x[i]=el2;//i++(0..99) el--(99..0)
//            //Сначало мы заполняем первый эл-т x[0]=99,x[1]=98
//            el2--;//В порядке убывания
//        }
//        for (int i = 0; i < 100; i++) {//i=0 ...i=9//9<10 - true 10<10 -false
//            System.out.println(x[i]);
//        }
        int[] y = new int[10]; //Дз второе Задание
        int j = 0;
        for (int i = 0; i < 10; i++) {
            if (j == 2) j = 0;//j=0
            y[i] = j;
            j++;//j=2
        }
        for (int i = 0; i < 10; i++) { //Вывод в Консоль
            System.out.println(y[i]);
        }
//        System.out.println("================");// Второй способ решения дз(второй задачи)
//        for (int i = 0; i < 10; i++) {
//            if (y[i] % 2 == 0) y[i] = 0;
//            else {
//                y[i] = 1;
//            }
//        }
        //Массив Всегда начинается с нуля!  а Условие всегда до кол-ва ел-в


        for (int i = 0; i < 10; i++) {
            System.out.println(y[i]);
        }
        boolean[] y1 = new boolean[10];
        boolean test = false;
        int k=0;
        for(int i=0; i<10;i++) {
            y1[i] = test;
            test = !test;
        }


        //Если было True, станет False и наоборот
        System.out.println("=====================");
        for (int i = 0; i < 10; i++) {
            System.out.println(y1[i]);
        }
    }




    }

