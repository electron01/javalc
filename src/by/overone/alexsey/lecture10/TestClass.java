package by.overone.alexsey.lecture10;

public class TestClass {
    private int a;//a > 0!!!!
    private OtherClass otherClass = new OtherClass();

    public OtherClass getOtherClass() {
        return otherClass;
    }

    public void setOtherClass(OtherClass otherClass) {
        this.otherClass = otherClass;
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        if (a > 0) {
            this.a = a;
        } else {
            return;
        }
    }


    TestClass() {
        System.out.println("Create TestClass");
    }

    TestClass(int a) {
        this.a = a;

    }

    int sum(int a, int b) {
        return a + b;

    }


}
