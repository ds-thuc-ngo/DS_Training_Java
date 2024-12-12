package java_io_streams;

/*
 Dùng để đọc dữ liệu dạng byte (nhị phân).
 Nó chủ yếu được sử dụng cho các file chứa dữ liệu không phải ký tự, như hình ảnh,
 âm thanh, hoặc file nhị phân (binary files).
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {

    public static void main(String[] args)  {
        try (FileInputStream fis = new FileInputStream("C:\\Users\\dimage\\OneDrive\\Pictures\\krixi.png")) {
            int content;
            while((content = fis.read()) != -1) {
                System.out.print((char) content); //Lặp vô hạn ???
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
