package main.java.by.aston.collections.hashset;

public class Main {
    public static void main(String[] args) {
        MyHashSet<String> mySet = new MyHashSet<>();
        mySet.add("Hello");
        mySet.add("World");
        mySet.add("Hello");
        mySet.remove("Hello");

        System.out.println("size: " + mySet.size());
    }
}
