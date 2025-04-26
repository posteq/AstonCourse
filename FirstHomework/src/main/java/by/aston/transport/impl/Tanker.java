package main.java.by.aston.transport.impl;

import main.java.by.aston.transport.Vehicle;
import main.java.by.aston.transport.behaviors.CarriesCargo;
import main.java.by.aston.transport.behaviors.HasWings;

public class Tanker extends Vehicle implements HasWings, CarriesCargo {

    public Tanker(String name) {
        super(name);
    }

    @Override
    public void describe() {
        System.out.println("Moving tanker");
        wings();
        cargo();
    }
}
