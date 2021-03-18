package by.overone.alexsey.lecture11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String text = "\t" + "Test start t5est" + "\n" +
//                "asasasasasasa" + "\n" +
//                "Test End" + 10;
//        System.out.println(text);
//
//        Scanner textScanner = new Scanner(text);
//        System.out.println("=========");
//        System.out.println(textScanner.nextLine());
//        System.out.println(textScanner.nextLine());
//        System.out.println("==============");
//        Scanner scanner = new Scanner(System.in);
//        String test = scanner.next();
//        System.out.println("test = " + test);
//        int test2 = scanner.nextInt();
//        System.out.println("test2 = " + test2);
////        scanner.close();
////        int test3 = scanner2.nextInt();
////        System.out.println("test3 = " + test3);
//        System.out.println(textScanner.nextLine());
//        System.out.println(scanner.hasNextInt());

        System.out.println("======calc======");
        //  calc();
        test();

    }

    public static void calc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number");
        int number2 = scanner.nextInt();
        System.out.println("Enter op");
        String op = scanner.next();
        if (op.equals("+")) {
            System.out.println(number1 + number2);
        }
        if (op.equals("-")) {
            System.out.println(number1 - number2);
        }
        if (op.equals("*")) {
            System.out.println(number1 * number2);
        }
        if (op.equals("/")) {
            System.out.println(number1 / number2);
        }
        System.out.println("Ending...");


    }

    static void test() {
        Object object = new Object();
//        Animal animal = new Animal("Cat");
//        Animal animal1 = new Animal("Dog");
//        System.out.println(animal.equals(animal1));
        Dog dog = new Dog("Dog");
        Animal animal = new Animal("Dog");
        System.out.println(dog.equals(animal));
        //int
        //Integer
        Integer integer = 12;
        System.out.println(integer.toString());
        int x = 12;

    }

}
