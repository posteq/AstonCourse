package main.java.by.aston.Animals;

public class Fish extends Animal implements Swimmable{
    @Override
    public void swim() {
        System.out.println("i swim");
    }
}
