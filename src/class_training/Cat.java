package class_training;

public class Cat extends Animal implements MoveAble{

    Cat(String name) {
        super(name);
    }

    @Override
    public void flyAble() {
        System.out.println(name + " can't fly");
    }

    @Override
    public void walkAble() {
        System.out.println(name + " can walk");
    }

    public static void main(String[] args) {
        Cat cat = new Cat("HLB");
        cat.start();
        cat.run();
        cat.flyAble();
        cat.walkAble();
    }
}
