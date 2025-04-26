package main.java.by.aston.transport.behaviors;

public interface HasWheals {

    default void wheals() {
        System.out.println("It has wheals");
    }
}
