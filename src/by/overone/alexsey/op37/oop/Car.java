package by.overone.alexsey.op37.oop;

public class Car {
    private int number;
    private String name;

    public Car(int number, String name) {
        this.number = number;
        this.name = name;
    }
    public Car(){

    }

    public void test() {
        System.out.println(this.number);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number < 0) {
            System.out.println("Error number <0");
        } else {
            this.number = number;

        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
