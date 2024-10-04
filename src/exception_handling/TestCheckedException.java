package exception_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestCheckedException {
    public static void main(String[] args) {
        try {
            // Mở file không tồn tại, gây ra FileNotFoundException
            File file = new File("nonexistent.txt");
            Scanner sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        }
    }
}
