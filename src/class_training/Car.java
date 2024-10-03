package class_training;

public class Car extends Vehicle {

    //Constructor
    Car() {
        System.out.println("Car Constructor");
    }

    Car(String type) {
        super(type);    //super
    }

    //Method overriding
    void start() {
        System.out.println("Car is starting");
    }

    @Override
    void start(String parameter) {
        System.out.println("Car is starting with parameter " + parameter);
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        Car car = new Car("Java SpringBoot");
        System.out.println(car.type);
        car.start();
        vehicle.start("Nguyen Thi Thuy Dung");  //Dynamic Method Dispatch

        Vehicle v = new Car(); // Upcasting
        Car c = (Car) v; // Downcasting
        
    }

}
