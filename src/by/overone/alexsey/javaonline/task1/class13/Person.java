package by.overone.alexsey.javaonline.task1.class13;

public class Person {
    private String name;

    public void setName(String name) throws Exception{
        if(name.isEmpty()){
            throw new Exception("Name is empty");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
