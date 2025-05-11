package main.java.by.aston.transport;

import main.java.by.aston.transport.impl.Airplane;
import main.java.by.aston.transport.impl.Boat;
import main.java.by.aston.transport.impl.Helicopter;
import main.java.by.aston.transport.impl.Tanker;
import main.java.by.aston.transport.impl.Taxi;
import main.java.by.aston.transport.impl.Truck;

public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Airplane");
        Helicopter helicopter = new Helicopter("Helicopter");
        Boat boat = new Boat("Boat");
        Tanker tanker = new Tanker("Tanker");
        Truck truck = new Truck("Truck");
        Taxi taxi = new Taxi("Taxi");

        airplane.describe();
        System.out.println();

        helicopter.describe();
        System.out.println();

        boat.describe();
        System.out.println();

        tanker.describe();
        System.out.println();

        truck.describe();
        System.out.println();

        taxi.describe();
    }
}
