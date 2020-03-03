package mate.academy;

import mate.academy.threads.FirstThread;
import mate.academy.threads.SecondThread;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread firstThread = new FirstThread(counter);
        Thread secondThread = new Thread(new SecondThread(counter));
        firstThread.start();
        secondThread.start();
    }
}
