package by.overone.alexsey.javaonline.task1.oop;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        //Person - тип данных (правильно class!)
        //person1 - пер-ая -> объект класса Person
        Person.id=2;
        person1.name= "Artem";
        person1.age= 25;
        System.out.println(person1.name);
        System.out.println(person1.age);
        Person person2 = new Person();
        person2.age = 30;
        person2.name = "Alex";
        System.out.println(person2.name);
        System.out.println(person2.age);
        person1.sayHello();
        person2.sayHello();

        //int x = 10;
        //int[] array = new int[10];
        ex();
        Main main = new Main();
        main.ex1();
        person1.id =20;//Не очень
        Person.id =1;//Хорошо
        System.out.println("Person2.id = " + person2.id);
        System.out.println("Person class = " + Person.id);
        String name = "Artem";
//        String name = new String("Artem");

    }
    static void ex(){

    }
    void ex1(){

    }
}
