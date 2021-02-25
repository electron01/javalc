package by.overone.alexsey.lecture6;

public class Car {

    public String color;
    public String name;
    public int number;
    public int price;

    public Car(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public Car(String color) {
        this.color = color;
    }

    public Car(){

    }

    public static void swap(Car car1, Car car2) {

        String color = car1.color;
        car1.color = car2.color;
        car2.color = color;

    }

    public void test(){
        System.out.println("Hello!");
    }

    public void test(String x, String y){
        System.out.println("Hello!");

    }

    public void test(String text){
        System.out.println("Hello!" + text);
    }
    public void test(String text, int x){
        System.out.println("Hello!" + text +x);
    }


    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", price=" + price +
                '}';
    }
}
