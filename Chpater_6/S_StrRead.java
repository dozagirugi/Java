package chapter_6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class S_StrRead {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer_read = new BufferedReader(new FileReader("out.txt"));

        while (true) {
            String line = buffer_read.readLine(); // 한줄씩 문자열을 읽음
            if (line == null) break; // 더이상 읽을 줄이 없으면 반복문을 종료해라.
            System.out.println(line);
        }
    }
}
