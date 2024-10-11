package lambda_expressions;
/*

Lambda Expression (biểu thức Lambda) có thể được định nghĩa là một hàm ẩn danh,
cho phép người dùng chuyển các phương thức làm đối số. Điều này giúp loại bỏ rất nhiều mã soạn sẵn.

Cú pháp: (argument-list) -> {body}

 */

public class LambdaExpressions {


    public static void main(String[] args) {

        String name = "trans";

        Playable phuDan = () -> {
            System.out.println("Playing " + name);
        };

        phuDan.play();

        Addable chiDung = (a, b) -> (a + b);
        System.out.println(chiDung.add(350, 70));

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread1 is running");
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();

        Runnable r2 = () -> {
            System.out.println("Thread2 is running");
        };
        Thread t2 = new Thread(r2);
        t2.start();

    }

}
