package chapter_7;

public class S_MathException {
    public static void main(String[] args) {
        int result = 0;
        // 변수를 블록 밖에서 선언시 블록 안에서도 사용 가능

        try {
            // try 문에는 예외 가능성이 있는 코드를 넣는다.
            result = 4 / 0;
        } catch (ArithmeticException e) {
            result = -1; // 예외가 발생하면 실행됨
        }

        System.out.printf("result = " + result);
        // -> 0으로 숫자를 나누면 오류가 나는 것이 정상 !
        // 그럴땐 try ~ catch문을 써보자 !

    }
}
