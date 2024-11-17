package java_io_streams;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderExample {

    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("C:\\JavaTraining\\saycuckho.txt");

        int i;
        while ((i = fr.read()) != -1) {
            System.out.print((char) i);
        }

        fr.close();

    }

}
