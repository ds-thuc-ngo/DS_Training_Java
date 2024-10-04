package exception_handling;

public class TestTryCatchFinally {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // Sẽ gây ra ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an exception: " + e);
        } finally {
            System.out.println("This block always executes.");
        }
    }
}

