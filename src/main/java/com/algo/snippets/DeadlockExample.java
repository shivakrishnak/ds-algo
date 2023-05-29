package com.algo.snippets;

public class DeadlockExample {

    public static void main(String[] args) {
        // Create two shared objects
        Object resource1 = new Object();
        Object resource2 = new Object();

        // Create and start the first thread
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1 acquired resource 1");

                // Pause for a bit to allow thread 2 to acquire its resources
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (resource2) {
                    System.out.println("Thread 1 acquired resource 2");
                }
            }
        });
        thread1.start();

        // Create and start the second thread
        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2 acquired resource 2");

                // Pause for a bit to allow thread 1 to acquire its resources
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (resource1) {
                    System.out.println("Thread 2 acquired resource 1");
                }
            }
        });
        thread2.start();

        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
