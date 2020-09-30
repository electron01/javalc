package by.overone.alexsey.javaonline.task1;

public class Program333 {
    public static void main(String[] args) {
        //Функции(методы)
        //static
        //----
        //---
        //---
        printHello();
        printHello();
        printHello();
        printHello();
        printHello();
        printHello();
        printHello();

        int num1 = 12;
        int num2 = 16;
        sum(num1, num2);//Вызов функции
        //28
        int x = sum(1, 2);//ctr + лкм
        //int x = 3;
        int a = 1;
        int b = 2;
        //a =2, b=1
        //a=b,a=2,b=2
        int temp = a;//temp=a=1
        a = b;//a=2
        b = temp;//b=1


        int result = sum(100, 12);//Вызов функции
        //int result = 112;
        System.out.println("A");

        int number1 = 10;
        int number2 = 20;
        System.out.println("number1 = " +number1);
        System.out.println("number2 = " +number2);
        swop(number1,number2);
        System.out.println("number1 after swop = " +number1);
        System.out.println("number2 after swop = " +number2);


    }

    //Функиция(метод)
    static void printHello() {
        System.out.println("Hello");

    }

    //сама функция
    //void - ничего не возращает
    //byte - возращает byte
    //int - возращает int
    //float - возращает float...
    //...
    static int sum(int num1, int num2/*Тут хранится то, что получает функция на вход*/) {
        //int x = 12;
        //int y = 16;
        int result = num1 + num2;
        return result;
    }

    static void swop(int number1, int number2) {
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("number1 swop = " +number1);
        System.out.println("number2 swop  = " +number2);
    }

}
