package tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal(12));
        animals.add(new Animal(15));

        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog());
        dogList.add(new Dog());

        test(animals);
        test(dogList);

    }

    private static void test(List<? extends Animal> list){
        for (Animal animal:list) {
            System.out.println(animal);
            animal.eat();
        }

    }
}
