package by.overone.alexsey.lecture5;

public class Person {
    public static String className;
    public String name;
    public int age=20;
    public Person(){

    }



    static void swap(Person p1, Person p2){
        int temp = p1.age;
        p1.age = p2.age;
        p2.age=temp;
        System.out.println("swap p1 = " + p1.age);
        System.out.println("swap p2 = " + p2.age);
    }



    public void testMethod(){
        System.out.println("Hello World!");
    }

    public int swap(int x, int y){
        int temp = x;
        x=y;
        y=temp;
        System.out.println("x swap = " +  x);//20
        System.out.println("y swap = " +  y);//10
        return y ;


    }


    static void testStaticMethod(){
        System.out.println("Hello Static World!");
    }


}

