package variable;

public class Variable {

    public static void main(String[] args) {
        // Khai báo và gán giá trị cho biến
        int a = 17;

        // Toán tử
        int b = a - 7;

        // So sánh 2 biến
        if (a > b) {
            System.out.println(a + " > " + b);
        } else if (a == b) {
            System.out.println(a + " = " + b);
        } else {
            System.out.println(a + " < " + b);
        }

        // Ép kiểu trong java
        int x = 15;
        long y = x; // Ép kiểu từ nhỏ sang lớn, tự động
        byte z = (byte)x;   //Ép từ lớn sang nhỏ, phải tự ép
        System.out.println(x + " " + y + " " + z);

    }


}
