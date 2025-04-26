package main.java.by.aston.Animals;

import java.util.LinkedList;

public class Habitat {

    private LinkedList<Class<? extends Animal>> resident ;

    private String name;

    public Habitat(String name){
        this.name = name;
        resident = new LinkedList<>();
    }

    public void addResident(Class<? extends Animal> newResident){
        resident.add(newResident);
    }

    public String getName(){
        return name;
    }

    public LinkedList<Class<? extends Animal>> getResident() {
        return resident;
    }

}
