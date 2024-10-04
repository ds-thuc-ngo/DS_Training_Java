package exception_handling;

import java.io.IOException;

public class TestThrow {

    public static void main(String[] args) {
        int age = 15;
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older.");
        }
    }

}

