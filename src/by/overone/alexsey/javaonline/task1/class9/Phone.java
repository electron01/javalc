package by.overone.alexsey.javaonline.task1.class9;

import java.util.Objects;

public class Phone {
    private int id;
    private String name;
    private int price;
    private static int countPhone = 0;

    public Phone() {
        System.out.println("Constructor:class Phone");
        countPhone++;
        this.id = countPhone;
    }

    public Phone(String name, int price) {
        countPhone++;
        this.id = countPhone;
        this.name = name;
        this.price = price;
    }

    public Phone(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void turnOn() {
        System.out.println("Class::Phone:TurnOn");
    }

    public void printMessage() {
        System.out.println("Class::Phone:PrintMessage");
    }

    //Перегрузка метода
    public void printMessage(String message) {
        System.out.println("Class::Phone:PrintMessage - " + message);
    }

    public void printMessage(int i) {
        System.out.println("Class::Phone:PrintMessage(int) - " + i);
    }

    @Override
    //this -> newPhone1
    //Object o - Phone newPhone2 - > phone
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        if (this.id == phone.id && this.price == phone.price
                && this.name.equals(phone.name)) {
            return true;
        } else {
            return false;
        }
//        return id == phone.id &&
//                price == phone.price &&
//                Objects.equals(name, phone.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
