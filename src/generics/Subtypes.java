package generics;

class Animal {
    protected String name = "animal";
};
class Dog extends Animal {
    String name = "dog";
};
class Cat extends Animal {
    String name = "cat";
};

class Box<T> {

    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class Subtypes {

    public static void main(String[] args) {
        Box<Animal> dogBox = new Box<>(new Dog());
        Box<Cat> catBox = new Box<>(new Cat());
        Box<Animal> animalBox = new Box<>(new Animal());
        System.out.println(dogBox.getValue().name);
        System.out.println(catBox.getValue().name);
        System.out.println(animalBox.getValue().name);
    }
}
