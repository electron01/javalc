package by.overone.alexsey.lecture10;

public class Main {
    public static int number = 0;

    public static void main(String[] args) {
//        TestClass testClass = new TestClass();
//        testClass.setA(10);
//        SubClass subClass = new SubClass();
//        subClass.setA(15);
//        System.out.println(subClass.getA());
        int prev = 0;
        int next = 1;
        int rez = 0;

//        int n = 5;
//        for (int i = 1; i < n; i++) {
//            rez = prev + next;
//            prev = next;
//            next = rez;
//        }

//        System.out.println("F(n) = " + rez);

//        System.out.println("Fubn(n) = " + fubn(50));
//        TestClass testClass = new TestClass();
//        SubClass subClass = new SubClass();
//        TestClass testClass = new TestClass();
//        System.out.println(subClass.sum(1,2));
//        System.out.println(testClass.sum(1,2));

//        TestClass testClass = new TestClass();
//        testClass.otherClass.setTest(100);
//        System.out.println(testClass.otherClass.getTest());
//
//
//        System.out.println(testClass.otherClass.getTest());
//
//        TestClass testClass = new TestClass();
//        testClass.getOtherClass().setTest(100);
//        System.out.println(testClass.getOtherClass().getTest());
//        testClass.setOtherClass(null);
//
//
//        System.out.println(testClass.getOtherClass().getTest());

        Device device = new Device();
        device.method();
        device.deviceMethod();
        System.out.println("============");
        Phone phone =new Phone();
        phone.method();
        phone.deviceMethod();
        phone.phoneMethod();
        System.out.println("============");
        SmartWatch smartWatch = new SmartWatch();
        smartWatch.method();
        smartWatch.deviceMethod();
        smartWatch.smartWatchMethod();
        System.out.println("============");

        Device phone1 = new Phone();

        Device smartWatch1 = new SmartWatch();
        phone1.deviceMethod();
        smartWatch1.deviceMethod();
        System.out.println("============");
        phone1.method();
        smartWatch1.method();
        System.out.println("============");
        Device[] array = new Device[3];
        array[0] = device;
        array[1] = phone;
        array[2] =smartWatch;

        for(int i=0;i<array.length;i++){
            array[i].method();
        }




    }

    static int fubn(int x) {
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        return fubn(x - 1) + fubn(x - 2);
    }
}
