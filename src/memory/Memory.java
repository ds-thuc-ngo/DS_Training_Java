package memory;

public class Memory {

    /*

    Heap

    Heap là nơi lưu trữ các đối tượng Java.
    Khi tạo một đối tượng bằng cách sử dụng từ khóa "new",
    đối tượng sẽ được lưu trữ trong Heap.
    Vùng nhớ Heap có thể tồn tại đến khi không có tham chiếu đến đối tượng đó nữa
    hoặc cho đến khi chương trình kết thúc.

    Trong Heap, bộ nhớ được cấp phát động bởi JVM khi các đối tượng được tạo ra
    và bộ nhớ được giải phóng khi không có tham chiếu nào trỏ đến đối tượng đó nữa.

     */

    /*

    Stack

    Stack là nơi lưu trữ các biến cục bộ và các tham số của phương thức.
    Mỗi lần một phương thúc được gọi, một frame mới được tạo ra trên Stack
    để lưu trữ các biến cục bộ và tham số của phương thức đó.
    Khi phương trình hoàn thành,
    frame được loại bỏ khỏi Stack và bộ nhớ được giải phóng.

    Trong Stack, bộ nhớ được cấp phát tĩnh khi một phương thức được gọi
    và bộ nhớ được giải phóng khi phương thức hoàn thành.

     */

    /*

    String Pool
    String pool là một vùng nhớ đặc biệt nằm trong vùng nhớ Heap (Heap memory),
    dùng để lưu trữ các biến được khai báo theo kiểu String.
    String pool giúp tối ưu hoá việc lưu trữ và sử dụng vùng nhớ khi khai báo biến String,
    giúp hạn chế tình trạng tràn bộ nhớ Java Heap Space.

    Biến khai báo theo kiểu String khi được tạo ra sẽ được lưu vào String Pool.

     */

    public static void main(String[] args) {

        //2 cách khai báo String

        //C1: Lưu trữ ở String Pool
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);   //true

        //C2: Lưu trữ ở Heap
        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println(s3 == s4);   //false do khác nhau về con trỏ
        System.out.println(s3.equals(s4));  //true do equals chỉ so sánh giá trị

    }
}
