package by.overone.alexsey.lecture9;

public class NoteBook {
     String name;
     private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void test(){
        System.out.println("NoteBook::Test");
    }

    public void test(String x){
        System.out.println("NoteBook::Test(s)");

    }
}
