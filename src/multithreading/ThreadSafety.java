package multithreading;

class ProcessingThread implements Runnable {

    private int count;

    @Override
    public void run() {
        for(int i=1; i<5; i++) {
            processSomething(i);
            count++;
        }
    }

    public int getCount() {
        return count;
    }

    private void processSomething(int i) {
        try {
            Thread.sleep(i*100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

public class ThreadSafety {

    public static void main(String[] args) {

        ProcessingThread pt = new ProcessingThread();
        Thread t1 = new Thread(pt, "t1");
        t1.start();
        Thread t2 = new Thread(pt, "t2");
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Processing count: " + pt.getCount());


        /*

        Kết quả đúng ra phải là 8, nhưng do truy cập chung tài nguyên, nên kết quả có khi sẽ là 6, 7, 8

        Thread Safety trong java là quá trình làm cho chương trình của chúng ta an toàn để sử dụng trong môi trường đa luồng,
        có nhiều cách khác nhau để chúng ta có thể làm cho luồng chương trình của mình an toàn.

        - Đồng bộ hóa (Synchronization) là công cụ dễ dàng nhất và được sử dụng rộng rãi nhất cho Thread Safety trong java.
        - Sử dụng các lớp Atomic Wrapper từ gói  java.util.concurrent.atomic. Ví dụ: AtomicInteger
        - Sử dụng các khóa từ gói java.util.concurrent.locks.
        - Sử dụng các lớp thread safe collection ( bộ sư tập luồng an toàn) , xem bài viết này sử dụng ConcurrentHashMap để biết safe thread.
        - Sử dụng từ khóa “volatile” với các biến để làm cho mọi luồng đọc dữ liệu từ bộ nhớ, không đọc từ bộ đệm của luồng.

         */

    }

}
