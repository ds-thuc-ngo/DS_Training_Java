package java_io_streams;

import java.io.*;
import java.util.ArrayList;

public class IOStreams {

    private ArrayList<Integer> list;

    public IOStreams() {
        this.list = new ArrayList<>();
    }

    public void write(int... datas) {
        for (int data : datas) {
            list.add(data);
        }
    }

    public int read() {
        int first = list.get(0);
        list.remove(0);
        return first;
    }

    public int available() {
        return list.size();
    }

    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("C:/Users/dimage/OneDrive/Desktop/DS_Training_Java/IOStreams/source.txt");
        OutputStream outputStream = new FileOutputStream("C:/Users/dimage/OneDrive/Desktop/DS_Training_Java/IOStreams/result.txt");

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            outputStream.write(data);
        }

        inputStream.close();
        outputStream.close();

        IOStreams ioStreams = new IOStreams();
        ioStreams.write(1, 2, 3, 4, 5, 6, 7, 8);
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:/Users/dimage/OneDrive/Desktop/DS_Training_Java/IOStreams/data.txt"));
        while (ioStreams.available() > 0) {
            int data = ioStreams.read();
            writer.write(String.valueOf(data));
        }
        writer.newLine();
        writer.close();

    }
}
