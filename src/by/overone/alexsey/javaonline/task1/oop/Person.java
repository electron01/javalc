package by.overone.alexsey.javaonline.task1.oop;


public class Person {
    private int age; //Поля класса
    private String name;
    private String lastName;
    public static int id;//Статическое поле класса

    public Person(){

    }
    public Person(String name, String lastName, int age){
        this.name=name;
        this.lastName=lastName;
        this.age=age;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static void sayHello() { //Методы класса
        System.out.println("Hello!");
    }

    public void setAge(int personAge) {
        if (personAge < 0) {
            System.out.println("Error");
        } else {
            age = personAge;
        }
    }
    public int getAge(){
        return age;
    }
    public void setName(String name) {
        this.name = name;
        //person1.name = name;
    }

    public String getName() {
        return name;
    }


    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }


    //

}
//HelloWorld - class
//sayHello -  к методам, к полям и переменным