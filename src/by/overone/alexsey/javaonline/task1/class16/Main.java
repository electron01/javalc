package by.overone.alexsey.javaonline.task1.class16;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main Start");
        TestThread testThread = new TestThread();
        testThread.start();
        //testThread.interrupt();
        try {
            testThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Semaphore semaphore = new Semaphore(2);
        new SemThread(3,semaphore,"thread1").start();
        new SemThread(3,semaphore,"thread2").start();
        new SemThread(3,semaphore,"thread3").start();
        new SemThread(3,semaphore,"thread4").start();

        System.out.println("Main END");


    }
}
