package java_io_streams;

import java.io.*;

public class CustomReader extends Reader {

    protected Reader in;

    public CustomReader (Reader in) {
        super(in);
        this.in = in;
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        return in.read(cbuf, off, len);
    }

    @Override
    public void close() throws IOException {
        in.close();
    }

    public static void main(String[] args) throws FileNotFoundException {

        char arr[] = new char[100];

        try {

            CustomReader input = new CustomReader(new FileReader("C:\\Users\\dimage\\OneDrive\\Desktop\\DS_Training_Java\\src\\java_io_streams\\ryoma.txt"));
            int charsRead = input.read(arr, 0, arr.length);
            System.out.println("Data in the stream:");
            System.out.println(new String(arr, 0, charsRead));
            input.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {

            String str = "Buồn ngủ vl";
            CustomReader input = new CustomReader(new StringReader(str));
            int charsRead = input.read(arr, 0, arr.length);
            System.out.println("Data in the stream:");
            System.out.println(new String(arr, 0, charsRead));
            input.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
