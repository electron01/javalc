package by.overone.alexsey.javaonline.task1.class15;

public class Test implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("testThreadCount:" + i);
        }
        System.out.println("End Test::method run");
    }
}
