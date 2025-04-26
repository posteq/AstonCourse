package main.java.by.aston.transport.behaviors;

public interface CarriesCargo {

    default void cargo(){
        System.out.println("It carries cargo");
    }
}
