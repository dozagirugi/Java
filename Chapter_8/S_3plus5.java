package chapter_8;

public class S_3plus5 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i < 1000; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println("3의 배수와 5의 배수의 합은 " + sum + " 이다.");
    }
}
