package main.java.by.aston.animals.impl;

import main.java.by.aston.animals.types.Mammal;
import main.java.by.aston.animals.behaviors.HasSpine;
import main.java.by.aston.animals.behaviors.LiveInWater;

public class Whale extends Mammal implements HasSpine, LiveInWater {
    @Override
    public void describe() {
        System.out.println("I am a whale");
        habitat();
        super.describe();
    }
}
