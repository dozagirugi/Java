package chapter_6;
import java.io.IOException; // 예외처리 하기
import java.io.InputStream; // 인풋 스트림 임포트하기

public class S_input {
    public static void main(String[] args) throws IOException {
        InputStream input_prime = System.in;

        int input_a;
        int input_b;
        int input_c;

        input_a = input_prime.read(); // 콘솔에서 받은 입력을 아스키 코드로 변경해서 'input_a' 에 대입
        input_b = input_prime.read();
        input_c = input_prime.read();

        System.out.println(input_a);
        System.out.println(input_b);
        System.out.println(input_c);
    }
}
