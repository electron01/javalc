package by.overone.alexsey.javaonline.task1.class9;

public class OtherPhone extends Phone {
    private String processor;

    public OtherPhone() {
        System.out.println("Constructor : class otherPhone");
    }

    public OtherPhone(String processor) {
        this.processor = processor;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }
    //Переопределение метода
    @Override
    public void turnOn(){
        System.out.println("Class::OtherPhone:TurnOn");
    }

    @Override
    public String toString() {
        return "OtherPhone{" +
                "processor='" + processor + '\'' +
                '}';
    }
}
