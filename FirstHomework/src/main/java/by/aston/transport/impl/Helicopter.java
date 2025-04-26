package main.java.by.aston.transport.impl;

import main.java.by.aston.transport.Vehicle;
import main.java.by.aston.transport.behaviors.CarriesCargo;
import main.java.by.aston.transport.behaviors.HasPropeller;
import main.java.by.aston.transport.behaviors.HasWheals;

public class Helicopter extends Vehicle implements HasWheals, CarriesCargo, HasPropeller {

    public Helicopter(String name) {
        super(name);
    }

    @Override
    public void describe() {
        System.out.println("Helicopter move");
        wheals();
        cargo();
        propeller();
    }
}
