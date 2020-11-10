package by.overone.alexsey.javaonline.task1.class16;

public class TestThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread - TestThread Start");
        int i =0;
        do {
            if(!Thread.interrupted()) {
                i++;
                if (i % 10 == 0) {
                    System.out.println(i);
                }
            }else{
                return;
            }
        }while (i<1000);
        System.out.println("Thread - TestThread end");


    }
}
