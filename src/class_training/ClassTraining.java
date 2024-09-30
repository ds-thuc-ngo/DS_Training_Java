package class_training; //package

public class ClassTraining {

    //Class Atributes
    String color;
    String model;
    final int year;

    //Static members
    static int number;

    static {
        String name = "Đỗ Thùy Dương";
        System.out.println(name);
    }

    ClassTraining(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
        System.out.println("Parent class");
    }

    void displayInfo() {
        System.out.println("Model: " + model + " Color: " + color + " Year: " + year);
    }

    static void printNumber() {
        System.out.println("Number: " + number);
    }


    public static void main(String[] args) {
        //Object
        ClassTraining a = new ClassTraining("blue", "Duong", 2003);
        a.displayInfo();
    }

}
