package main.java.by.aston.transport.impl;

import main.java.by.aston.transport.Vehicle;
import main.java.by.aston.transport.behaviors.HasWheals;

public class Taxi extends Vehicle implements HasWheals {
    public Taxi(String name) {
        super(name);
    }

    @Override
    public void describe() {
        System.out.println("Taxi move");
        wheals();
    }
}
