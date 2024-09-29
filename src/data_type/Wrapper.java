package data_type;

public class Wrapper {

    public static void main(String[] args) {

        // Đổi int thành Integer
        int a = 20;
        Integer i = Integer.valueOf(a); // Đổi int thành Integer
        Integer j = a;  // Autoboxing

        System.out.println(a + " " + i + " " + j);

        // Đổi Integer thành int
        Integer b = Integer.valueOf(3);
        int k = b.intValue(); // Đổi Integer thành int
        int l = b;

        System.out.println(b + " " + k + " " + l);

    }

}