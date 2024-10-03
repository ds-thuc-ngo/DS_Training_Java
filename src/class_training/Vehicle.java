package class_training;

public class Vehicle  {

    String type;

    Vehicle() {
        System.out.println("Vehicle Constructor");
    }

    Vehicle(String type) {
        this.type = type;   //this
    }

    void start() {
        System.out.println("Vehicle is starting");
    }

    //Method overloading
    void start(String parameter) {
        System.out.println("Vehicle is starting with parameter " + parameter);
    }

}
