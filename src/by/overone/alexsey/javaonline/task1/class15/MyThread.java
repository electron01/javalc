package by.overone.alexsey.javaonline.task1.class15;

import java.util.concurrent.TimeUnit;

public class MyThread extends Thread {
    @Override
    public void run() {
        try {
//            sleep(10);
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MyThread Start");
    }
}
