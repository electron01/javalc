package by.overone.alexsey.op37.oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Artem";
        person.age = 22;
        Person person2 = new Person();
        person2.name = "Alex";
        person2.age = 30;
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person);


//        Car car = new Car(111,"KIA");
//        Car car3 = new Car(111,"asas");
//
//
//
//        car.number = 111;
//        Car car2 = new Car();
//        car2.number = 222;
//        car.test();
//        car2.test();
        String text = "А роза упала на лапу азора";
        text = text.replace(" ", "");
        text = text.toLowerCase();


//        String text = "12345321";
        String test1 = new String("asaasa");
        System.out.println(text.trim());
        System.out.println(text.replace(" ", ""));
        System.out.println(text.charAt(0));

        boolean isPalindrom = true;

        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                isPalindrom = false;
                break;
            }
        }
        if (isPalindrom) {
            System.out.println("Это палиндром");
        } else {
            System.out.println("Это не палиндром");
        }


        int count = 10;

        int number1 = 1;
        int number2 = 1;
        int number3 = 0;

        for (int i = 0; i < count; i++) {
            number3 = number1 + number2;
            number1 = number2;
            number2 = number3;


        }
        System.out.println(number3);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :");
        String x = scanner.nextLine() ;
        //Class A:
        //a = A()

    }
}
