package class_training;

/*
Abstract Class là một lớp không thể tạo đối tượng, có thể chứa các phương thức abstract (không có thân) và các phương thức cụ thể.
 */

public abstract class Animal {

    public String name;

    Animal(String name) {
        this.name = name;
    }

    public void start() {}  //abstract method

    public void run() {
        System.out.println(name + " is running");
    }

    public void sound(String sound) {
        System.out.println(name + " sound " + sound);
    }

}
