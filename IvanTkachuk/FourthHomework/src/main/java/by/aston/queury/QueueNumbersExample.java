package main.java.by.aston.queury;

import java.util.concurrent.Semaphore;

public class QueueNumbersExample {
    private static Semaphore semaphore1 = new Semaphore(1);
    private static Semaphore semaphore2 = new Semaphore(0);

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (true) {
                try {
                        semaphore1.acquire();
                        System.out.println("1");
                        Thread.sleep(500);
                        semaphore2.release();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                try {
                        semaphore2.acquire();
                        System.out.println("2");
                        Thread.sleep(500);
                        semaphore1.release();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        });

        thread2.start();
        thread1.start();
    }
}
