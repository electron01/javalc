package by.overone.alexsey.lecture12;

public class Main {
    public static void main(String[] args) {
        NoteBook[] array = new NoteBook[3];
        array[0] = new MacBook(100);
        array[1] = new PixelBook(120);
        array[2] = new MacBook(150);
        for (int i = 0; i < array.length; i++) {
            array[i].turnOn();
            array[i].turnOff();
        }
//        NoteBook pixelBook =new PixelBook(100);


        Jet jet = new Jet();
        jet.flyFromWater();
        ExtendedInterface.staticMethod();

        System.out.println(Fly.x);


    }
}
