package exception_handling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UserRegistration {

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be greater than 18");
        }
    }

    public static void registerUser(String name, int age) throws InvalidAgeException, IOException {
        if (name == null || name.isEmpty()) {
            throw new InvalidDataException("Tên không được để trống.");
        }

        checkAge(age);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("users.txt", true))) {
            writer.write("Name: " + name + ", Age: " + age);
            writer.newLine();
            System.out.println("Người dùng đã được đăng ký thành công.");
        } catch (IOException e) {
            System.err.println("Đã xảy ra lỗi khi ghi vào tệp: " + e.getMessage());
            throw e;
        } finally {

            System.out.println("Kết thúc quá trình đăng ký.");
        }
    }

    public static void main(String[] args) {
        try {
            registerUser("John", 18);
        } catch (InvalidAgeException e) {
            System.err.println("Đăng ký thất bại: " + e.getMessage());
        } catch (InvalidDataException e) {
            System.err.println("Lỗi data: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Lỗi IO: " + e.getMessage());
        }
    }

}
