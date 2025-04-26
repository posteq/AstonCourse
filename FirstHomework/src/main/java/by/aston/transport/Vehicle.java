package main.java.by.aston.transport;

public abstract class Vehicle {

    private String name;

    public Vehicle(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void describe();

}
