import java.util.Vector;

public class IMD {
    public static void main(String[] args) {
        Thread t1 = new InaThread();
        MinaRunnable r = new MinaRunnable();
        Thread t2 = new Thread(r);
        Thread t3 = new DikaThread();
        t1.start();
        t2.start();
        t3.start();
    }

}

class InaThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("InaThread " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MinaRunnable extends Vector implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("MinaRunnable " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class DikaThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("DikaThread " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}