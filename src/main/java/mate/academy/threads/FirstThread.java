package mate.academy.threads;

public class FirstThread extends Thread {
    private int counter;

    public FirstThread() {
        System.out.println("first thread is running");
    }

    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("first thread counter = " + counter++);
        }
    }
}
