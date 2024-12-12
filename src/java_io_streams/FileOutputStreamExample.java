package java_io_streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

    public static void main(String[] args) throws IOException {
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream("C:\\JavaTraining\\sayhoikho.txt");
            fout.write(65);
            fout.close();
            System.out.println("Success...");

        } catch (Exception e) {
            System.out.print(e);
        } finally {
            fout.close();
        }
    }

}
