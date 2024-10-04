package exception_handling;

public class TestError {

    public static void main(String[] args) {
        // Lỗi StackOverflowError do gọi đệ quy vô hạn
        recursiveMethod();
    }

    public static void recursiveMethod() {
        recursiveMethod(); // Gọi chính nó vô hạn
    }

}

