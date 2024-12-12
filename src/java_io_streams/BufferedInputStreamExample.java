package java_io_streams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExample {

    public static void main(String[] args) throws IOException {
        FileInputStream fin = null;
        BufferedInputStream bin = null;

        try {
            fin = new FileInputStream("C:\\JavaTraining\\abc.txt");
            bin = new BufferedInputStream(fin);
            int i;
            while ((i = bin.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            bin.close();
            fin.close();
        }
    }

}
