package chapter_6;


import java.io.FileInputStream;
import java.io.IOException;

public class S_ReadFile {
    public static void main(String[] args) throws IOException {
        byte[] array = new byte[1024];
        FileInputStream input_file = new FileInputStream("out.txt");
        input_file.read(array);

        System.out.println(new String(array)); // byte 배열을 문자열로 변경하여 출력.
        input_file.close();
    }
}
