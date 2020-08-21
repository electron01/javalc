package by.overone.alexsey.lecture4;

public class Main {
    public static void main(String[] args) {
        ex();
        int x = 5;
        int y = ex1(x);//5*5=25
        System.out.println("y = " + y);

        int a=1;
        int b=2;
        System.out.println("Main a = " +a);//a=1
        System.out.println("Main b = " +b);//b=2
        swap(a,b);
        System.out.println("Main after swap a = " +a);//a=1
        System.out.println("Main after swap b = " +b);//b=2
        ex3();

    }

    static int ex1(int x) {
        return x*x;
    }

    static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("Swap : a = "+a);//a(в функции) = 2
        System.out.println("Swap : b = "+b);//b(в функции) = 1

    }

    static void ex3() {
        String test = "test";
        Person person1 = new Person();
        person1.name = "Artem";
        person1.age = 22;
        System.out.println("========PERSON==========");
        System.out.println(person1.name);
        System.out.println(person1.age);
        Person person2 = new Person();
        person2.name = "Ivan";
        person2.age = 30;
        System.out.println("========PERSON2==========");
        System.out.println(person2.name);
        System.out.println(person2.age);

    }
    static void ex(){
        int[] array=new int[20];
        for(int i=0;i<array.length;i++){
            array[i]=i+1;
        }
        System.out.println("=====Array=====");
        for(int i=0;i<array.length;i++){
            System.out.println("array["+i+"] = "+array[i]);
        }
        System.out.println("=====Array=====");
    }
}
