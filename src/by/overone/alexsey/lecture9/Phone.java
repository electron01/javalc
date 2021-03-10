package by.overone.alexsey.lecture9;

public class Phone {
    private String name;
    private int number;
    private String group;
    private static boolean test;



    Phone(){

    }

    Phone(String name){
        this.name = name;
    }

    Phone(String name,int number){
        this.name=name;
        this.number=number;
    }

    Phone(String name,String group){
        this.name=name;
        this.group=group;
    }


    public void testMethod(){
        System.out.println("Phone method");

    }

    public void testMethod2(){
        System.out.println("Phone method");

    }

    public static void testStatic1(){
        System.out.println("Test 1 static ");
        return;
    }

    public static void testStatic2(){
        System.out.println("Test 2 static");
    }





}
