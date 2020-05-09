import java.util.Vector;

public class App {
    public static void main(final String[] args) {
        Thread t1 = new Mythread();
        MyRunnable r = new MyRunnable();
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();

    }
}

class Mythread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyRunnable extends Vector implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Runnable " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}