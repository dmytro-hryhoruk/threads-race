package mate.academy.threads;

import mate.academy.Counter;

public class SecondThread implements Runnable {
    private Counter counter;

    public SecondThread(Counter counter) {
        this.counter = counter;
        System.out.println("first thread is running");
    }

    @Override
    public void run() {
        while (counter.getCounter() <= 100) {
            System.out.println("second thread counter = " + counter.getCounter());
            counter.incrementCounter();
        }
    }
}
