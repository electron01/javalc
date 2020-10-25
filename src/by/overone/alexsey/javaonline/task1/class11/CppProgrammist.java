package by.overone.alexsey.javaonline.task1.class11;

public class CppProgrammist  implements Programmist{
    private String name;
    public CppProgrammist(String name){
        this.name = name;

    }
    @Override
    public void writeCode() {
        System.out.println("CppProgrammist write code");
    }

    @Override
    public String toString() {
        return "CppProgrammist{" +
                "name='" + name + '\'' +
                '}';
    }
}
