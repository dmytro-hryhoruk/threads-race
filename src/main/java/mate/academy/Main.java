package mate.academy;

import mate.academy.threads.FirstThread;
import mate.academy.threads.SecondThread;

public class Main {
    public static void main(String[] args) {
        Thread firstThread = new FirstThread();
        Thread secondThread = new Thread(new SecondThread());
        firstThread.start();
        secondThread.start();
    }
}
