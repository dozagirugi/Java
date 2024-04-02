// #20240402 반지름 입력받아서 원의 넓이 구하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class proJava_29 {
    public static void main(String[] args) throws IOException {
        double s;
        int r;
        double pi = Math.PI;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        r = Integer.parseInt(br.readLine()); // 입력받는 라인

        s = r * r * pi;

        System.out.printf("반지름이 %d인 원의 넓이 => %.3f", r, s);
    }
}
