package by.overone.alexsey.lecture5;

import java.util.Arrays;


public class Main {
//    public static Person i =  new Person();
//    public static Person i2 =  i;
//    public static int i1 = 20;
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age =21;


        int[] array = new int[5];
        p1.name.toLowerCase();
        //Class.object.method();
        System.out.println();

        System.out.println(p1.age);

        System.out.println("p1.age = " + p1.age);
        Person p2 = new Person();
        System.out.println("p2.age = " + p2.age);


        System.out.println(Person.className);
        Person.testStaticMethod();
        char[] chars = {'a','b','8','9','+'};

        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));



        Person person1 = new Person();
        Person person2 = new Person();

        System.out.println();



        person1.age=25;
        person1.name = "Artem";

        person2.age = 30;
        person2.name= "Alex";

        System.out.println(Person.className = "Test");
        System.out.println(person2.className);
        person1.className = "Test!!!!";
        System.out.println(person2.className);

        Person.testStaticMethod();//static method

        person1.testMethod("Hello World!","Hello");//method
        person2.testMethod("Primer Text!","Bye");


        System.out.println("===========");
        int x =10;
        int y = 20;
        System.out.println("x before swap = " +x);//10
        System.out.println("y before swap = " +y);//20
        person1.swap(x,y);
        System.out.println("x after swap = " +x);
        System.out.println("y after swap = " +y);

        System.out.println(person1.age);
        System.out.println(person2.age);

        Person.swap(person1,person2);

        System.out.println("after p1 = " + person1.age);
        System.out.println("after p2 = " +person2.age);

    }


}
