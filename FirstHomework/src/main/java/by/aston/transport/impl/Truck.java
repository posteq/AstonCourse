package main.java.by.aston.transport.impl;

import main.java.by.aston.transport.Vehicle;
import main.java.by.aston.transport.behaviors.CarriesCargo;
import main.java.by.aston.transport.behaviors.HasWheals;

public class Truck extends Vehicle implements CarriesCargo, HasWheals {

    public Truck(String name) {
        super(name);
    }

    @Override
    public void describe() {
        System.out.println("Truck move");
        cargo();
        wheals();
    }
}
