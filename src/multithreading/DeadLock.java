package multithreading;

public class DeadLock {


    public static void main(String[] args) {

        final String phu = "Phu";
        final String dung = "Dung";

        Thread t1 = new Thread() {
            @Override
            public void run() {
                synchronized (phu) {
                    System.out.println("Den nha ru Dung di choi");

                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }

                    synchronized (dung) {
                        System.out.println("di choi");
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                synchronized (dung) {
                    System.out.println("Den nha Phu hoi bai");

                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }

                    synchronized (phu) {
                        System.out.println("hoc bai");
                    }
                }
            }
        };

        t1.start();
        t2.start();

    }

}

