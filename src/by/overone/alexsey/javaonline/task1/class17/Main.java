package by.overone.alexsey.javaonline.task1.class17;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();


        Animal animal = new Animal();
        animal.setName("animal");

        Dog dog = new Dog();
        dog.setName("dog");

        animals.add(animal);
        animals.add(dog);

        animal.voice("km,mk");
        for(Animal animal1 : animals){
            animal1.voice();
        }

    }
}
