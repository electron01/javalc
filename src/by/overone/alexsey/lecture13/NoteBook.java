package by.overone.alexsey.lecture13;

public abstract class NoteBook {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public abstract void launch();

    public void shutDown(){
        System.out.println("NoteBook::shutDown");
    }
}
