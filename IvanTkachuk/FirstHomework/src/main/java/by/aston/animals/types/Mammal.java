package main.java.by.aston.animals.types;

import main.java.by.aston.animals.behaviors.HasSpine;

public abstract class Mammal  extends Animal implements HasSpine {

    @Override
    public void describe() {
        System.out.println("Mammal");
        showSpin();
    }
}
