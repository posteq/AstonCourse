package main.java.by.aston.transport.behaviors;

public interface HasPropeller {

    default void propeller() {
        System.out.println("It has propeller");
    }
}
