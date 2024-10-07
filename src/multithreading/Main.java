package multithreading;

public class Main {

    public static void main(String[] args) {

        // Thread class
//        ThreadFramgia t1 = new ThreadFramgia();
//        t1.start();
//        ThreadFramgia t2 = new ThreadFramgia();
//        t2.start();
//        ThreadFramgia t3 = new ThreadFramgia();
//        t3.start();

        // Runnable interface
//        ThreadRunnableFramgia t4 = new ThreadRunnableFramgia();
//        t4.start();
//        ThreadRunnableFramgia t5 = new ThreadRunnableFramgia();
//        t5.start();
//        ThreadRunnableFramgia t6 = new ThreadRunnableFramgia();
//        t6.start();

        //Priority
        ThreadClass th0 = new ThreadClass();
        ThreadClass th1 = new ThreadClass();
        th0.start();
        th1.start();

        System.out.println();

        ThreadClass th2 = new ThreadClass();
        ThreadClass th3 = new ThreadClass();
        th2.setPriority(Thread.MIN_PRIORITY);
        th3.setPriority(Thread.MAX_PRIORITY);
        th2.start();
        th3.start();

    }
}
