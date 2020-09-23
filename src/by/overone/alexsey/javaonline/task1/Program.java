package by.overone.alexsey.javaonline.task1;
public class Program {
    public static void main(String[] args) {
        System.out.println("Hello");
        // age = 20, int - тип переменной age (целые числа)
        byte bt = 127;
        //[-128;127] 1 byte
        short sh = 130;
        //2 byte
        int age = 20;
        //4 byte
        long lg = 1200;
        //8 byte

        float fl = 12.2f;
        //4 byte
        double db = 1267957.3678565;
        //8 byte
        System.out.println(db);

        //double lg = 1*10^2;
        //int =0; int =1; double db =1234567889
        //...756 ->8
        //12+12 -int, 12.12 - double
        boolean isTest = false;
        //true - Правда(Да) / false - ложь (нет)
        char ch = '+';
        //2 byte
        // 8 типов данных - byte,short,int,long,float,double,char,boolean
        int x = 10;
        int y = 12;
        boolean bl = x != y;
        //10>10,10>=10,10<10,10<=10, 10==10, 10!=10;
        int z = 5 / 2;//% - остаток от деления
        boolean evenNumber = 10 % 2 == 0;

        int number1 = 120;
        int number2 = 100;
        if (number1 > number2) {
            System.out.println("number1>number2");
        } else if (number2 > number1) {
            System.out.println("number2>number1");
        } else {
            System.out.println("number1==number2");
        }

        //number1 = 120, number2 =100
        if (number1 > number2) {
            System.out.println("number1>number2");
        }
        if (number2 > number1) {
            System.out.println("number2>number1");
        }
        if (number1 == number2) {
            System.out.println("number1==number2");
        }

        boolean test = 10 < 3;
        if (test) {
            System.out.println("test = true");
        } else {
            System.out.println("test = false");
        }
        String name = "Alex";
        System.out.println("Hello, " + name);
        int k = 100 / 10;
        System.out.println("k = " + k);
        //k = 10
        //System.out.println("k = " + "10")
        //10 -> "10"
        //true - > "true"
        //12.12 = "12.12"

        char pr1 = 'A';
        int pr2 = pr1;
        System.out.println("pr2 = " + pr2);
        // kod/value
        // 49 -> 1

        boolean c1 = true;
        boolean c2 = false;
        if (c1 ^ c2){
            System.out.println("c1 or c2 -> true");

        }
        // && - и - and
        // || - или - or
        // ^ - исключающее или
        boolean c22 = (12>11) && (10%2==0);
        boolean c3 = (12>110) && ((11%2==0) || (12>0));
        // false && true
        boolean c4 = (120>12) || (100/0==0);
        boolean c5 = (12>120) && (100/0==0);

        System.out.println(5.0/2);
        byte t1 =12;
        byte t2 =100;
        System.out.println(t2+t1+100);
        long b1 =2147483647;
        int b2= 11;
        long b3 = b1+b2;
        // b1 + b2 -> int + int = int (-2 147 483 638) -> long
        //int String


        System.out.println(b3);
        //Java - +,-,*,/ -> int
        //-2 147 483 648, 2 147 483 647

        //|| -  если первое зн-е равно true, второе даже не проверяется
        //&& -  если первое зн-е равно false, второе даже не проверяется

        //if -если (условие), else, else if
        //условие ->да либо нет (test ->да(true) либо нет(false))


        System.out.println(bl);
        System.out.println("Hello");
//        int num1 =100;
//        int num2 =10;
//        char op = '/';
        //if (op=="+")




    }
}
