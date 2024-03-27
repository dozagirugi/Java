package chapter_7;

interface Calculator {
    int sum(int a, int b); // 추상 메소드
}
//class MyCalculator implements Calculator {
//    @Override
//    public int sum(int a, int b) {
//        return a+b; // 추상 메소드를 구현함
//    }
//}

public class S_lambda {
    public static void main(String[] args) {
        // MyCalculator a = new MyCalculator();
        Calculator mc = (int a, int b) -> a + b;
        System.out.println(mc.sum(5,8));
    }
}
