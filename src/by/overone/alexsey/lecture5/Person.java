package by.overone.alexsey.lecture5;

public class Person {

    public static String className;
    public String name;
    public int age=20;

    public Person(){

    }



    public  static void swap(Person p1, Person p2){
        //p1 - artem 25
        //p2 - alex 30
        int temp = p1.age; //temp= 25
        p1.age = p2.age; //p1.age = 30
        p2.age=temp;//p2.age = 25
        //p1 - artem 30
        //p2 - alex 25
        System.out.println("swap p1 = " + p1.age);
        System.out.println("swap p2 = " + p2.age);
    }

    public void test1(){

    }



    public void testMethod(String text, String text2){
        System.out.println(text);
        System.out.println(text2);
        return;
    }

    public void swap(int x, int y){
        int temp = x;
        x=y;
        y=temp;
        System.out.println("x swap = " +  x);//20
        System.out.println("y swap = " +  y);//10
    }


    static void testStaticMethod(){
        System.out.println("Hello Static World!");
    }


}

