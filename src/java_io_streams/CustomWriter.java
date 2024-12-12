package java_io_streams;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CustomWriter extends Writer {

    protected Writer out;

    public CustomWriter(Writer out) {
        this.out = out;
    }



    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        out.write(cbuf, off, len);
    }

    public void write(String str) throws IOException {
        out.write(str);
    }

    @Override
    public void flush() throws IOException {
        out.flush();
    }

    @Override
    public void close() throws IOException {
        out.close();
    }

    public static void main(String[] args) {


        String data = "Ahihi đồ ngốc";

        try {
            CustomWriter output = new CustomWriter(new FileWriter("C:\\Users\\dimage\\OneDrive\\Desktop\\DS_Training_Java\\src\\java_io_streams\\ryomass.txt"));
            output.write(data);
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
