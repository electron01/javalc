package by.overone.alexsey.lecture12;

public class TestClass implements ExtendedInterface {


    @Override
    public void test2() {
        System.out.println("TestClass::test2");
    }

//    @Override
//    public void defaultMethod() {
//
//    }
    //default method - не обязательно переопределять

    @Override
    public boolean fly() {
        return false;
    }

    @Override
    public void testFly() {
        System.out.println("TestClass::testFly");
    }

    @Override
    public void flyFromWater() {
        System.out.println("TestClass::flyFromWater");
    }
}
