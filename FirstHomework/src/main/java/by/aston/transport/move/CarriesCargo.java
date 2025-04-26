package main.java.by.aston.transport.move;

public interface CarriesCargo {

    default void cargo(){
        System.out.println("i carries cargo");
    }
}
