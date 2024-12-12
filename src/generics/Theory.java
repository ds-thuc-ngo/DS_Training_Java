package generics;

/*
Generics là một tính năng trong Java cho phép chúng ta định nghĩa các lớp, giao diện và phương thức
với kiểu dữ liệu (type) chưa xác định. Điều này giúp chương trình linh hoạt hơn và có thể làm việc với nhiều loại dữ liệu khác nhau
mà không phải khai báo lại các phương thức hoặc lớp cho từng loại dữ liệu.
 */

import java.util.ArrayList;

public class Theory {

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(20);
//        integers.add("String"); Lỗi vì sai kiểu




    }

}
