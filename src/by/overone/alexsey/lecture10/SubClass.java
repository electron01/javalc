package by.overone.alexsey.lecture10;

public class SubClass extends TestClass {

    @Override
    int sum(int a, int b) {
        System.out.println("Method SubClass");
        int x = super.sum(a, b);
        return x * x;
    }
}
