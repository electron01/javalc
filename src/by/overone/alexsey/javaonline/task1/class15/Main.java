package by.overone.alexsey.javaonline.task1.class15;

public class Main {
    public static void main(String[] args) {
/*        int processors = Runtime.getRuntime().availableProcessors();
        System.out.println("processor - " + processors);*/
        Test test = new Test();
        Thread thread = new Thread(test);
        MyThread myThread = new MyThread();
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();
        myThread.setPriority(Thread.MIN_PRIORITY);
        myThread.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("main count:" + i);
        }
        System.out.println("End method main");
//        new Main().doCounter();//1 object

    }

    private int count = 0;
    private Object monitor = new Object();
    private Object monitor1 = new Object();

    //    private AtomicInteger count = new AtomicInteger(0);
    private void increment() {
        synchronized (monitor) {
            count++;
        }
    }

    private void increment1() {
        synchronized (monitor1) {
            count++;
        }
    }

    public void doCounter() {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1_000_000; i++) {
//                    count++;
                    increment();
//                    count.incrementAndGet();
                }
                System.out.println("t1 =" + count);

            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1_000_000; i++) {
//                    count++;
                    increment();
//                    count.incrementAndGet();//1->2 =2
                }

                System.out.println("t2 = " + count);

            }
        });
        t1.start();
        t2.start();

    }
}
//                    count.incrementAndGet();
//    private AtomicInteger count = new AtomicInteger(0);


