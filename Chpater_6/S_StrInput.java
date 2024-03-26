package chapter_6;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class S_StrInput {
    public static void main(String[] args) throws IOException {
        InputStream str_input = System.in;
        InputStreamReader str_reader = new InputStreamReader(str_input);
        BufferedReader buff_reader = new BufferedReader(str_reader);
        // BufferedReader: 큰 데이터 (긴 문자열) 를 읽을 때 사용

        String result = buff_reader.readLine();
        System.out.println(result);

    }
}
