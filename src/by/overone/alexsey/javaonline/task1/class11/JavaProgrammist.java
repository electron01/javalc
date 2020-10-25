package by.overone.alexsey.javaonline.task1.class11;

public class JavaProgrammist implements Programmist {
    private String name;
    public JavaProgrammist(String name){
        this.name = name;
    }
    @Override
    public void writeCode() {
        System.out.println("JavaProgrammist write code");
    }

    @Override
    public String toString() {
        return "JavaProgrammist{" +
                "name='" + name + '\'' +
                '}';
    }
}
