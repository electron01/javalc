package by.overone.alexsey.lecture12;

public class PixelBook extends NoteBook {
    public PixelBook(int price) {
        super(price);
        System.out.println("Create PixelBook");
    }

    @Override
    public void turnOn() {
        System.out.println("PixelBook:Start");
    }

    @Override
    public void turnOff() {
        System.out.println("PixelBook:End");
    }
}
