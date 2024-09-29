package data_type;

import java.math.BigDecimal;

public class DoubleVsBigDecimal {

    public void useDouble() {
        // Sự mất chính xác khi sử dụng double
        double value1 = 0.1;
        double value2 = 0.2;
        double sum = value1 + value2;

        System.out.println("Use Double:");
        System.out.println("Expected result: 0.3");
        System.out.println("Actual result with double: " + sum);
    }

    public void useDemacial() {
        // Sử dụng BigDecimal
        BigDecimal value1 = new BigDecimal("0.1");
        BigDecimal value2 = new BigDecimal("0.2");
        BigDecimal sum = value1.add(value2);

        System.out.println("Use Demacial:");
        System.out.println("Expected result: 0.3");
        System.out.println("Actual result with BigDecimal: " + sum);
    }

    public static void main(String[] args) {

        DoubleVsBigDecimal i = new DoubleVsBigDecimal();
        i.useDouble();
        i.useDemacial();

    }

}
