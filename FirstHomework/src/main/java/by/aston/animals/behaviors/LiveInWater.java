package main.java.by.aston.animals.behaviors;

public interface LiveInWater{

    default void habitat() {
        System.out.println("Live in water");
    }
}
