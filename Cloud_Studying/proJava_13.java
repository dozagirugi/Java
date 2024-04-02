import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class proJava_13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name = br.readLine();
        int age = Integer.parseInt(br.readLine());
        double weight = Double.parseDouble(br.readLine());
        boolean male = Boolean.parseBoolean(br.readLine());

        System.out.println("이름: " + name);
        System.out.println("나이: " + age +"세");
        System.out.println("몸무게: " + weight +"kg");
        System.out.println("남성인가요?: " + male);
    }
}
