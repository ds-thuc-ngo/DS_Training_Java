package generics;

public class GenericsClass<T> {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {

        GenericsClass<Integer> integerGenericsClass = new GenericsClass<>();
        integerGenericsClass.setValue(10);
        System.out.println("Value: " + integerGenericsClass.getValue());

        GenericsClass<String> stringGenericsClass = new GenericsClass<>();
        stringGenericsClass.setValue("Chi Duong xinh vl");
        System.out.println("Value: " + stringGenericsClass.getValue());

    }


}
