package main.java.by.aston.animals.behaviors;

public interface HasSpine {

    default void showSpin() {
        System.out.println("Has spin");
    }
}
