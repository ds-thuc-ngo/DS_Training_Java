package multithreading;

class MyThread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getId() + " - Count: " + i);
            try {
                Thread.sleep(500);
//                if (Thread.currentThread().isAlive()) {
//                    System.out.println("Thread " + Thread.currentThread().getId() + " is alive");
//                }
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}

public class ThreadMethods {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.start();

        MyThread tmp = new MyThread();
        tmp.start();

        try {
            tmp.join();
            myThread.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Both threads have finished executing.");




    }
}
