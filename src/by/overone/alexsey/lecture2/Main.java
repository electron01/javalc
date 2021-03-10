package by.overone.alexsey.lecture2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int x = 0;
        x++;//x=1
        x++;//x=2
        x--;//x=1
        x += 10;//x=x+10;
        x -= 10;//x=x-10;
        x *= 10;//x=x*10;
        x /= 10;//x=x/10;
        System.out.println("x = " + x);


        int n1 = 10;
        int n2 = 10;
        char op = '+';

        if (n1 > n2) {
            System.out.println("n1>n2");
        } else if (n2 > n1) {
            System.out.println("n2>n1");
        } else {
            System.out.println("n1==n2");
        }


        if (n1 > n2) {
            System.out.println("n1>n2");
        }
        if (n2 > n1) {
            System.out.println("n2>n1");
        }
        if (n1 == n2) {
            System.out.println("n1==n2");
        }

        int number1 = 0;
        int number2 = number1++;//number2 = 0; number1=1;
       // number1++ -> number1 = number1 + 1;
        int number3 = ++number2;//number3 = 0+1=1; number2=1;
        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);
        System.out.println("number3 = " + number3);

        char op1 = 'q';//+ - * /
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        double[] array2 = new double[10];
        for (int i = 0; i < array.length; ++i) {
            System.out.println(array[i]);
        }


        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

//        boolean primer1 = 10 > 2;
        boolean primer2 = 10 != 100;

        System.out.println(primer2);
//        boolean primer3 = 10 > 10;
//        boolean primer4 = 10 >= 10;
//        boolean primer5 = 11 <= 2;
//        boolean primer6 = 10 == 2;


//        int x = 10;
//        int z = 10;
//        boolean xz = x == z;
//        System.out.println("xz=x==z = " + xz);
//        int k = 15;
//        boolean xk = x == k;//false
//        boolean xk2 = x > k; //false 10>15
//        boolean xk3 = x < k;// xk3 = 10<15; - True
//        boolean xk4 = x != k; //xk4 = x!=k; 10!=15
//        System.out.println("xk=x==k = " + xk);
//        System.out.println("xk2=x>k = " + xk2);
//        System.out.println("xk3=x<k = " + xk3);
//        System.out.println("xk4=x!=k = " + xk4);
//        boolean test = 10 > 10;//false
//        boolean test2 = 10 >= 10;//TRUE
//        boolean test3 = 19 < 25;//TRUE
//        System.out.println("test=10>10 = " + test);
//        System.out.println("test2=10>=10 = " + test2);
//        System.out.println("test=19<=25 = " + test3);
////
        boolean test = (11 > 10) || (120 / 0 == 0);//true without exception
       // boolean test0 = (11 > 10) | (120 / 0 == 0);//exception!
        //        System.out.println("test0 = " + test0);
        System.out.println("test = " + test);
        boolean test2 = (20 < 10) && (120 / 0 == 0);//false
//        boolean test3 = (20 > 10) && (120 / 0 == 0);//exception
//        System.out.println("test2 = " + test3);
        System.out.println("test3 = " + test2);
        boolean test5 = true;
        boolean test6 = !test5;//false
        System.out.println(test6);//false



        //Задание 1:
        //С помощью цикла, вывести числа от 1 до 25
        //Задание 2:
        //Создать две переменные типа int (int number1, int number2 ) записать в них какие-нибудь числа,  например number1 = 10; number2 =5; создать переменную char op и записать в нее либо ‘+’,либо ’-’,либо ’*’,либо ‘/’, если op =‘*’;
        //То в консоле должен отобразиться результат умножения первого числа на второе (для этого задания использовать блок if - else if - else)
        //Задание 3:
        //Создать массив целых чисел, заполнить его числами от 0 до 9 и вывести его в консоль(Заполнить с помощью цикла)


    }
}
