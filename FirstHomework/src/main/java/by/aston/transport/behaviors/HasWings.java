package main.java.by.aston.transport.behaviors;

public interface HasWings {

    default void wings() {
        System.out.println("It has wings");
    }
}
