package main.java.by.aston.lock.deadlock;

public class WalkingThread extends Thread {

    private final People firstPerson;
    private final People secondPerson;

    public WalkingThread(People firstPerson, People secondPerson) {
        this.firstPerson = firstPerson;
        this.secondPerson = secondPerson;
    }

    @Override
    public void run() {
        try {
            synchronized (firstPerson) {
                System.out.println("the monitor of " + firstPerson.getName() +" is captured thread : " + Thread.currentThread().getName() + " - waiting others monitor");
                Thread.sleep(5);
                synchronized (secondPerson) {
                    firstPerson.goesTo(secondPerson);
                }
            }
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
