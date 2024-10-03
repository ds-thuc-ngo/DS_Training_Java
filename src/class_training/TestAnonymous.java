package class_training;

public class TestAnonymous {
    public static void main(String[] args) {
        Animal dog = new Animal("Beo") {
            @Override
            public void sound(String sound) {
                System.out.println("Gau gau");
                super.sound(sound);
            }
        };
        dog.sound("Ahihi");
    }
}
