package main.java.by.aston.animals.impl;

import main.java.by.aston.animals.types.Animal;
import main.java.by.aston.animals.behaviors.LiveInWater;

public class Fish extends Animal implements LiveInWater {
    @Override
    public void describe() {
        System.out.println("I am a fish");
        System.out.println("Animal");
        habitat();
    }
}
