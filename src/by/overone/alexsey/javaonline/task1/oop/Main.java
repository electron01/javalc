package by.overone.alexsey.javaonline.task1.oop;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Artem","Petrov",-25);
        Person person2 = new Person();
        System.out.println(person1);
        //Person - тип данных (правильно class!)
        //person1 - пер-ая -> объект класса Person
        Person.id=2;
//        person1.name= "Artem";
//        person1.age= 25;
        person1.setAge(25);
        person1.setName("Artem");
        System.out.println(person1);

        person2.setName("Alex");
        person2.setAge(30);
        System.out.println(person2);
        person1.sayHello();
        person2.sayHello();

        Person.sayHello();

        //int x = 10;
        //int[] array = new int[10];
        ex();//Main.ex(); -> ex();
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
