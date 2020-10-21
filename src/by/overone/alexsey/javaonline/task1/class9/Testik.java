package by.overone.alexsey.javaonline.task1.class9;

public class Testik {
    public void testMethod(Phone phone){
        System.out.println("Method::Phone");
        phone.turnOn();
    }
    public void testMethod(OtherPhone phone){
        System.out.println("Method::otherPhone");
        phone.turnOn();
    }
}
