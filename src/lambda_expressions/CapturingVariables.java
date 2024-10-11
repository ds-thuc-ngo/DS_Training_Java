package lambda_expressions;
/*
Capturing Variables trong Java đề cập đến khả năng một biểu thức lambda hoặc một class nội ẩn (inner class)
có thể tham chiếu tới các biến bên ngoài phạm vi của nó (thường là các biến cục bộ trong phương thức).
Khái niệm này thường liên quan đến biểu thức lambda, anonymous classes và local classes trong Java.

Biến được "capture" (bắt giữ) là những biến bên ngoài nhưng vẫn có thể được sử dụng trong một biểu thức lambda
hoặc lớp nội ẩn. Tuy nhiên, trong Java, có những hạn chế về loại biến nào có thể được capture
và sử dụng trong các biểu thức này.
 */

public class CapturingVariables {

    public static void main(String[] args) {

        int number = 10; //Effectively final
        Runnable lambda = () -> {
            System.out.println("Number is: " + number);
        };
        lambda.run();
        /*
        Trong đoạn code trên, biến number là một biến cục bộ và được biểu thức lambda sử dụng.
        Biến number không thay đổi sau khi được khởi tạo, do đó nó được coi là effectively final
        và có thể được capture bởi biểu thức lambda.
        Lambda lambda in ra giá trị của biến number.
         */
    }

}
