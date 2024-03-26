package chapter_6;

import java.io.IOException;
import java.io.FileWriter;

public class S_FileStrInput {
    public static void main(String[] args) throws IOException {
        FileWriter fw_input = new FileWriter("out2.txt");

        for (int i=1; i<11; i++) {
            String data = i + "번째 줄입니다. \n";
            fw_input.write (data);
        }

        fw_input.close();
    }
}
