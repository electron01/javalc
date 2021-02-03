package by.overone.alexsey.lecture1;

public class Main {
    public static void main(String[] args) {
        long l = 1234454545445454519l;
        float f = l;
        double d = l;
        System.out.println("floa = " + f);
        System.out.println("long = " + l);
        System.out.println("doub = " + d);


        double t1 = 0.8;
        double t2 = 0.1;
        System.out.println(t1 - t2);


        int z1 = 29;//2.9
        int z2 = 10;
        double z3 = z1 / z2;
        System.out.println(z3);


        int h = 10;
        System.out.println(h + h);

        char c = 'h';
        int c1 = c;
        System.out.println(c1);


        byte b1 = 127;
        int x = b1 + 100;
        byte b2 = (byte) (b1 + 100);
    }
}