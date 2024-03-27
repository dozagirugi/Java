package chapter_7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class S_noFileException {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("내 이름은 없는 파일"));
            bufferedReader.readLine();
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("파일을 못 찾았습니다 !");
        } catch (IOException e) {
            System.out.println("파일을 읽지 못합니다 !");
        }
    }
}
