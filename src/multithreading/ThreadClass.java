package multithreading;

public class ThreadClass extends Thread{

    @Override
    public void run() {
        System.out.println();
        for (int i = 1; i <= 3; i++) {
            System.out.println(i + " Thread name: " + Thread.currentThread().getName());
        }
    }



}
