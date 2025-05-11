package main.java.by.aston.transport.impl;

import main.java.by.aston.transport.Vehicle;
import main.java.by.aston.transport.behaviors.CarriesCargo;
import main.java.by.aston.transport.behaviors.HasPropeller;
import main.java.by.aston.transport.behaviors.HasWheals;
import main.java.by.aston.transport.behaviors.HasWings;

public class Airplane extends Vehicle implements HasWheals, HasWings, CarriesCargo, HasPropeller {
    public Airplane(String name) {
        super(name);
    }

    @Override
    public void describe() {
        System.out.println("Airplane move");
        wheals();
        wings();
        cargo();
        propeller();
    }
}
