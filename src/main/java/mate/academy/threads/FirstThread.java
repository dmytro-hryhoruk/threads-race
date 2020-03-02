package mate.academy.threads;

import mate.academy.Counter;

public class FirstThread extends Thread {
    private Counter counter;

    public FirstThread(Counter counter) {
        this.counter = counter;
        System.out.println("first thread is running");
    }

    public void run() {
        while (counter.getCounter() <= 100) {
            System.out.println("first thread counter = " + counter.getCounter());
            counter.incrementCounter();
        }
    }
}
