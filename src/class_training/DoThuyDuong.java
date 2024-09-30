package class_training;

//Inheritance
public class DoThuyDuong extends ClassTraining{

    DoThuyDuong(String color, String model, int year) {
        super(color, model, year);
        System.out.println("Do Thuy Duong Class");
    }

    public static void main(String[] args) {
        DoThuyDuong thuyDuong = new DoThuyDuong("Duong", "Duong", 1);
        thuyDuong.displayInfo();
    }

    //Method Overriding
    @Override
    void displayInfo() {
        System.out.println("Đây là Đỗ Thùy Dương Overriding");
    }
}
