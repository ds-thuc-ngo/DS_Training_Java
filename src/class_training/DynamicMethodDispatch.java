package class_training;

public class DynamicMethodDispatch {

    static class Vehicle{
        void start() {
            System.out.println("Vehicle starting");
        }
    }

    static class Car extends Vehicle {
        void start() {
            System.out.println("Car starting");
        }
    }

    public static void main(String[] args) {
        Vehicle v = new Car();  //Upcasting
        v.start();
        Car c = (Car) v;
    }

}
