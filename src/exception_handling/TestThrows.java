package exception_handling;

import java.io.IOException;

public class TestThrows {

    void fun1() throws IOException {
        throw new IOException("Loi thiet bi");
    }

    void fun2() throws IOException {
        fun1();
    }

    void fun3() {
        try {
            fun2();
        } catch (Exception e) {
            System.out.println("Ngoai le duoc xu ly");
        }
    }

    public static void main(String[] args) {
        TestThrows trs = new TestThrows();
        trs.fun3();
        System.out.println("Ket thuc");
    }
}
