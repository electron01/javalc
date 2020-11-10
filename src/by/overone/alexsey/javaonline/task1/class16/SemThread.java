package by.overone.alexsey.javaonline.task1.class16;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemThread extends Thread {
    private int initNumber;
    private Semaphore semaphore;
    private String name;

    public SemThread(int initNumber, Semaphore semaphore, String name) {
        this.initNumber = initNumber;
        this.semaphore = semaphore;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println("Came Thread ->" + this.name);
            semaphore.acquire();//поток занял место у семафора
            TimeUnit.SECONDS.sleep(1);
            for (int i = 1; i <= initNumber; i++) {
                System.out.println(this.name + ": " + i);
                TimeUnit.SECONDS.sleep(1);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();//поток освободил место
            System.out.println("Thread - " + this.name + "End");
        }

        //ctr or alt  + ЛКМ
    }
}
