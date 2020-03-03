package mate.academy.threads;

import mate.academy.Counter;

public class FirstThread extends Thread {
    public static final int LIMIT = 100;
    private Counter counter;

    public FirstThread(Counter counter) {
        this.counter = counter;
        System.out.println("first thread is running");
    }

    public void run() {
        while (counter.getCounter() <= LIMIT) {
            System.out.println("first thread counter = " + counter.getCounter());
            counter.incrementCounter();
        }
    }
}
