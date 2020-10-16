package by.overone.alexsey.javaonline.task1.class7;

public class Admin extends User {
    private String password;
    public Admin(int id, String name,String password) {
        super(id, name);
        this.password = password;
    }

    public void deleteUser(){
        System.out.println("delete...");
    }
}
