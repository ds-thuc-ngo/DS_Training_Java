package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Executor {

    public void useFixedThreadPool() {
        ExecutorService pool = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 1000; i++) {
            pool.submit(new Run(i));
        }
        pool.shutdown();
    }

    public void useSingleThreadPool() {
        ExecutorService pool = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 1000; i++) {
            pool.execute(new Run(i));
        }
        pool.shutdown();
    }

    public void useCachedThreadPool() {
        ExecutorService pool = Executors.newCachedThreadPool();
        for (int i = 0; i < 1000; i++) {
            pool.execute(new Run(i));
        }
        pool.shutdown();
    }

    public static void main(String[] args) {

        long startTime, endTime;

        Executor executor = new Executor();

        startTime = System.nanoTime();
        executor.useFixedThreadPool();
        endTime = System.nanoTime();
        System.out.println("FixedThreadPool execution time: " + (endTime - startTime) / 1_000_000 + " ms");


        startTime = System.nanoTime();
        executor.useSingleThreadPool();
        endTime = System.nanoTime();
        System.out.println("SingleThreadPool execution time: " + (endTime - startTime) / 1_000_000 + " ms");


        startTime = System.nanoTime();
        executor.useCachedThreadPool();
        endTime = System.nanoTime();
        System.out.println("CachedThreadPool execution time: " + (endTime - startTime) / 1_000_000 + " ms");

    }

}
