package by.overone.alexsey.lecture12;

public abstract class NoteBook {
    private int price;

    public NoteBook(int price) {
        this.price = price;
        System.out.println("Create NoteBook");
    }

    public void testMethod() {
        System.out.println("Print::TestMethod");
    }

    public abstract void turnOn();
    public abstract void turnOff();
}
