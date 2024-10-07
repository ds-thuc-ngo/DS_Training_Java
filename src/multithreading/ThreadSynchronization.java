package multithreading;

/*
Cơ chế khóa và mở khóa tài nguyên giống trong hệ điều hành
 */

/*
Code ở đây sẽ sử dụng cơ chế đồng bộ hóa ể xử lý vấn đề ở Class ThreadSafe
 */


public class ThreadSynchronization implements Runnable {

    private int count;

    public int getCount() {
        return count;
    }

    public synchronized static void processSomething(int i) {
        try {
            Thread.sleep(i*10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        for(int i=1; i<5; i++) {
            processSomething(i);
            count++;
        }
    }

    public static void main(String[] args) {
        ThreadSynchronization ts = new ThreadSynchronization();
        Thread t1 = new Thread(ts, "t1");
        t1.start();
        Thread t2 = new Thread(ts, "t2");
        t2.start();


        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Processing count: " + ts.getCount());

    }

}
