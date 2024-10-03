package class_training;

// Enum với thuộc tính và phương thức
enum Season {
    SPRING("Mild"),
    SUMMER("Hot"),
    FALL("Cool"),
    WINTER("Cold");

    private String temperature; // Thuộc tính của enum

    // Constructor
    Season(String temperature) {
        this.temperature = temperature;
    }

    // Phương thức để lấy giá trị của thuộc tính
    public String getTemperature() {
        return temperature;
    }
}

public class TestEnum {
    public static void main(String[] args) {
        // Sử dụng enum với thuộc tính và phương thức
        Season currentSeason = Season.SPRING;
        System.out.println("The current season is: " + currentSeason);
        System.out.println("The temperature is: " + currentSeason.getTemperature());
    }
}
