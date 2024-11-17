package java_io_streams;

import java.io.FileWriter;

public class FileWriterExample {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("C:\\JavaTraining\\saysieukho.txt");
            fw.write("Liên hoàn sấy");
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Success...");
    }
}
