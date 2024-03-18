package java_practice;

public class Problem_1 {
    public static void main(String[] args) {
        String name = "홍팍";
        int age = 35;
        double height = 176.4;
        boolean grade = true;

        System.out.println(String.format("이름: %s",name));
        System.out.println(String.format("나이: %d",age));
        System.out.println(String.format("신장: %.1f",height));
        System.out.println(String.format("입문자입니까? %b",grade));

    }
}