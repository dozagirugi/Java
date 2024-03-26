package chapter_6;

import java.io.IOException;
import java.io.InputStream;

public class S_arrayInput {
    public static void main(String[] args) throws IOException { // 입력이 안 됐을 경우를 대비해서 예외 처리를 꼭 해준다.
        InputStream input_array = System.in;

        byte[] byte_array = new byte[3]; // 하나의 1바이트짜리 배열 3개 생성
        input_array.read(byte_array);


        System.out.println(byte_array[0]);
        System.out.println(byte_array[1]);
        System.out.println(byte_array[2]);

    }
}
