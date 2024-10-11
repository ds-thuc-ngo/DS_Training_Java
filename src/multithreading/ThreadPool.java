package multithreading;

import java.util.concurrent.*;

class Run implements Runnable {
    int id;

    static int cnt = 0;

    public Run(int id) {
        this.id = id;
    }

    @Override
    public void run() {
//        System.out.println("Tiến trình đang được thực thi " + id);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        System.out.println("Tiến trình đã được thực thi " + id);
//        System.out.println(++cnt);
    }
}

public class ThreadPool {

    public static void main(String[] args) {
        int corePoolSize = 5;
        int maximumPoolSize = 10;
        long keepAliveTime = 500;
        TimeUnit unit = TimeUnit.SECONDS;

        ArrayBlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(100);
        RejectedExecutionHandler handler = new ThreadPoolExecutor.CallerRunsPolicy();

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(corePoolSize,
                maximumPoolSize, keepAliveTime, unit, workQueue, handler);

        for (int i = 0; i < 10; i++) {
            threadPoolExecutor.execute(new Run(i));
        }
    }

}
