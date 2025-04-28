package net.farout.threads;

class NewRunnable implements Runnable{
    public void run() {
        System.out.printf("Running thread: "+ Thread.currentThread().getName());
    }
}

public class test {

    public static void main(String[] args) {

        NewRunnable r = new NewRunnable();

        r.run();

        Thread t = new Thread(r);

        t.start();
    }

}
