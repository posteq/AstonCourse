package main.java.by.aston.lock.livelock;

public class LiveLockExample {
    public static void main(String[] args) {
        Person person1 = new Person("Alice");
        Person person2 = new Person("Bob");

        person1.setOpponent(person2);
        person2.setOpponent(person1);

        new Thread(person1::interact).start();
        new Thread(person2::interact).start();
    }
}
