package multithreading;

class Chat {
    boolean flag = false;

    public synchronized void question(String msg) {
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(msg);
        flag = true;
        notify();
    }

    public synchronized void answer(String msg) {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(msg);
        flag = true;
        notify();
    }

}

class T1 implements Runnable {

    Chat m;
    String[] s1 = {"Hi", "How are you ?", "I am also doing fine!"};

    public T1(Chat m1) {
        this.m = m1;
        new Thread(this, "Question").start();
    }

    @Override
    public void run() {
        for (String s : s1) {
            m.question(s);
        }
    }
}

class T2 implements Runnable {
    Chat m;
    String[] s2 = { "Hi", "I am good, what about you?", "Great!" };

    public T2(Chat m2) {
        this.m = m2;
        new Thread(this, "Answer").start();
    }

    @Override
    public void run() {
        for (String s : s2) {
            m.answer(s);
        }
    }
}


public class InterThreadCommunication {
    public static void main(String[] args) {
        Chat m = new Chat();
        new T1(m);
        new T2(m);
    }
}
