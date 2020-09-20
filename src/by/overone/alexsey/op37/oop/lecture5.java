package by.overone.alexsey.op37.oop;

public class lecture5 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = sum(100, 200);
        System.out.println(c);
        final int MAX_VALUE = 10;

        System.out.println(MAX_VALUE);
    }

    static int sum(int a, int b) {
        return a + b;
    }
}
