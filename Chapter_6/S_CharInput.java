package chapter_6;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class S_CharInput {
    public static void main(String[] args) throws IOException {
        InputStream string_input = System.in; // 키보드에서 입력받은 것을 아스키 코드로 변환
        InputStreamReader string_reader = new InputStreamReader(string_input); // 그걸 다시 문자로 변환

        char[] result = new char[3];
        string_reader.read(result); // 예외처리 잊지 말기

        System.out.println(result);
    }
}
