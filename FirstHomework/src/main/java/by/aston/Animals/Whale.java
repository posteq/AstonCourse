package main.java.by.aston.Animals;

public class Whale extends Mammal implements Swimmable{
    @Override
    public void swim() {
        System.out.println("i swim");
    }
}
