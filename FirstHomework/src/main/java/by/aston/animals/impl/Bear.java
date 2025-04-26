package main.java.by.aston.animals.impl;

import main.java.by.aston.animals.types.Mammal;
import main.java.by.aston.animals.behaviors.HasCoat;

public class Bear extends Mammal implements HasCoat {
    @Override
    public void describe() {
        System.out.println("I am a bear");
        showCoat();
        super.describe();
    }
}
