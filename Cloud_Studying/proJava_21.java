import java.util.Scanner;

public class proJava_21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String f = scanner.nextLine(); // 문자열

        double c = ( Double.parseDouble(f) - 32.0 ) / 1.8;

        System.out.printf("화씨 %.1f도는 섭씨로 %.1f도 입니다!", Double.parseDouble(f), c);
    }
}
