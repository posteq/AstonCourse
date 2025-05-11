package main.java.by.aston.animals;

import main.java.by.aston.animals.impl.Bear;
import main.java.by.aston.animals.impl.Cat;
import main.java.by.aston.animals.impl.Fish;
import main.java.by.aston.animals.impl.Whale;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Bear bear = new Bear();
        Whale whale = new Whale();
        Fish fish = new Fish();

        cat.describe();
        System.out.println();
        bear.describe();
        System.out.println();
        whale.describe();
        System.out.println();
        fish.describe();
    }
}
