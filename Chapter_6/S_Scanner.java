package chapter_6;

import java.util.Scanner;

public class S_Scanner {
    public static void main(String[] args) {
        // InputStream input_original = System.in;
        // Scanner input_scanner = new Scanner(input_original); 이거나 밑에 줄이나 똑같다

        Scanner input_scnner = new Scanner(System.in);
        System.out.println(input_scnner.nextDouble());
        input_scnner.close(); // 사용 후 닫기 (메모리 절약을 위해서)
    }
}
