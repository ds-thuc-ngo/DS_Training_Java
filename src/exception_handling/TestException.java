package exception_handling;

public class TestException {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[5]); // Sẽ gây ra ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an exception: " + e);
        }

    }

}
