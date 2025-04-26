package main.java.by.aston.animals.behaviors;

public interface HasCoat {

    default void showCoat() {
        System.out.println("Has coat");
    }
}
