package mate.academy.threads;

public class SecondThread implements Runnable {
    private int counter;

    public SecondThread() {
        System.out.println("second thread is running");
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("second thread counter = " + counter++);
        }
    }
}
