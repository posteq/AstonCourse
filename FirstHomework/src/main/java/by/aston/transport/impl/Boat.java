package main.java.by.aston.transport.impl;

import main.java.by.aston.transport.Vehicle;
import main.java.by.aston.transport.behaviors.CarriesCargo;
import main.java.by.aston.transport.behaviors.HasWings;

public class Boat extends Vehicle implements  HasWings, CarriesCargo {

    public Boat(String name) {
        super(name);
    }

    @Override
    public void describe() {
        System.out.println("Moving boat");
        wings();
        cargo();
    }
}
