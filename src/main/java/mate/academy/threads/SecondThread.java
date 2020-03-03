package mate.academy.threads;

import mate.academy.Counter;

public class SecondThread implements Runnable {
    public static final int LIMIT = 100;
    private Counter counter;

    public SecondThread(Counter counter) {
        this.counter = counter;
        System.out.println("first thread is running");
    }

    @Override
    public void run() {
        while (counter.getCounter() <= LIMIT) {
            System.out.println("second thread counter = " + counter.getCounter());
            counter.incrementCounter();
        }
    }
}
