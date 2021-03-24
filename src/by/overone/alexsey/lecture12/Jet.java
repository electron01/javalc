package by.overone.alexsey.lecture12;

public class Jet implements Fly, Fly2{

    @Override
    public boolean fly() {
        return false;
    }

    @Override
    public void testFly() {
        System.out.println("Jet::testFly");
    }


    @Override
    public void flyFromWater() {
        System.out.println("Jet::flyFromWater");
    }
}
