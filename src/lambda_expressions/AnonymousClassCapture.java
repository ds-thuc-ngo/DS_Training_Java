package lambda_expressions;

public class AnonymousClassCapture {
    public static void main(String[] args) {

        int value = 100;

        Runnable anonymousClass = () -> {
            System.out.println("Value = " + value);
        };
        anonymousClass.run();

    }
}
