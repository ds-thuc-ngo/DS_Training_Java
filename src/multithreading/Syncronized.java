package multithreading;

class Counter implements Runnable {

    int res;

    @Override
    public synchronized void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(i*100);
                res++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public int getRes() {
        return res;
    }
}

public class Syncronized {
    public static void main(String[] args) throws InterruptedException {
        Counter td = new Counter();
        Thread t1 = new Thread(td, "t1");
        Thread t2 = new Thread(td, "t2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(td.getRes());
    }
}
