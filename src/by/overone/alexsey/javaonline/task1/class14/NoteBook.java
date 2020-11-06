package by.overone.alexsey.javaonline.task1.class14;

public class NoteBook {
    private String name;
    private int price;
    private String country;

    public NoteBook(String name, int price, String country) {
        this.name = name;
        this.price = price;
        this.country = country;
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", country='" + country + '\'' +
                '}';
    }
}
