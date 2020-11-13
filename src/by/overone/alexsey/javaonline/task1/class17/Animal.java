package by.overone.alexsey.javaonline.task1.class17;

public class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public  static void voice(){
        System.out.println("Animal::voice");
    }
    public void voice(String str){
        System.out.println("Animal::voice" + " " + str);
    }
}
