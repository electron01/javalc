package by.overone.alexsey.javaonline.task1.class8;

public class NoteBook{
    private int id;
    private String name;
    private int price;
    static int count=0;
    private int length;

    public NoteBook(){
        System.out.println("Public NoteBook");
        count++;
        this.id=count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
