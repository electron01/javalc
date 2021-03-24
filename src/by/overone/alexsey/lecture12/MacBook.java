package by.overone.alexsey.lecture12;

public class MacBook extends NoteBook {

    public MacBook(int price) {
        super(price);
        System.out.println("Create MacBook");
    }

    @Override
    public void turnOn() {
        System.out.println("MacBook:Start");
    }

    @Override
    public void turnOff() {
        System.out.println("MacBook:End");
    }
}
