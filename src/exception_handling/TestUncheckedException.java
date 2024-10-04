package exception_handling;

public class TestUncheckedException {
    public static void main(String[] args) {
        int num = 10;
        int divisor = 0;
        try {
            int result = num / divisor; // Sẽ gây ra ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e);
        }
    }
}
