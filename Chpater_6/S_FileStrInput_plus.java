package chapter_6;

import java.io.FileWriter;
import java.io.IOException;

public class S_FileStrInput_plus {
    public static void main(String[] args) throws IOException {
        FileWriter fw_input2 = new FileWriter("out2.txt", true);

        for (int i=11; i<21; i++) {
            String data = i + "번째 줄입니다. \n";
            fw_input2.write (data);
        }

        fw_input2.close();
    }
}
