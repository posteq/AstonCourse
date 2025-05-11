package main.java.by.aston.animals.impl;

import main.java.by.aston.animals.types.Mammal;
import main.java.by.aston.animals.behaviors.HasCoat;

public class Cat extends Mammal implements HasCoat {
    @Override
    public void describe() {
        System.out.println("I am a cat");
        showCoat();
        super.describe();
    }
}
