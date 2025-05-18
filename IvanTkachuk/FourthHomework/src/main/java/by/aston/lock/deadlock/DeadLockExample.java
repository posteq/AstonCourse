package main.java.by.aston.lock.deadlock;

public class DeadLockExample {

    public static void main(String[] args) throws InterruptedException {
        People alex = new People("Alex");
        People bob = new People("Bob");

        WalkingThread thread1 = new WalkingThread(alex, bob);
        WalkingThread thread2 = new WalkingThread(bob, alex);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("They is coming");


    }
}
