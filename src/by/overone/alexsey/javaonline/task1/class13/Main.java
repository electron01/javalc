package by.overone.alexsey.javaonline.task1.class13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1 ");
        int rez = 0;
        try {
            int num1 = scanner.nextInt();
            System.out.println("Enter number 2");
            int num2 = scanner.nextInt();
            rez = num1 / num2;
            throw new IllegalArgumentException();

        } catch (ArithmeticException exception) {
            exception.printStackTrace();
            System.out.println("result error!!!");
        } catch (InputMismatchException exception) {
            exception.printStackTrace();
            System.out.println("Input error!");

        } catch (IllegalArgumentException exception) {
            System.out.println("Found IllegalArgumentException  !!!");
        } finally {
            System.out.println("finally");
        }
        System.out.println(rez);
        Person person = new Person();
/*        try {
            person.setName("");
        } catch (Exception ex) {
            ex.printStackTrace();
        }*/
        Factorial factorial = new Factorial();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter number");
        int number3 = scanner1.nextInt();
        System.out.println(factorial.getFactorialNumber(number3));


    }
}

