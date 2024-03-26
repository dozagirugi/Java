package chapter_6;

import java.io.FileOutputStream;
import java.io.IOException;

public class S_FileSysout {
    public static void main(String[] args) throws IOException {
        // 파일 생성하기
        FileOutputStream file_output = new FileOutputStream("out.txt");

        // 파일 안에 내용 만들기
        for (int i=1; i<11; i++) {
            String data = i + "번째 줄입니다. \r\n";  // \r\n : 한 줄 띄운 뒤 첫번째 위치
            file_output.write(data.getBytes()); // 파일에 바이트 단위로 데이터를 입력
        }

        file_output.close();
    }
}
