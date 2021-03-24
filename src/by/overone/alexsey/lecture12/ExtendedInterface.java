package by.overone.alexsey.lecture12;

public interface ExtendedInterface extends Fly, Fly2 {
    void test2();

    private void method() {
        System.out.println("ExtendedInterface - private::method");
    }

    default void defaultMethod() {
        System.out.println("ExtendedInterface - default::method");
        method();
    }

    static void staticMethod() {
        System.out.println("ExtendedInterface - static::method");
    }
}
