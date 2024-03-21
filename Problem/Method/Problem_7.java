package Java_Problem.Method;

public class Problem_7 {
    public static void main(String[] args) {
        System.out.printf("Tom의 오디션 결과: %s\n", oudition(6.0,8.8));
        System.out.printf("Kate의 오디션 결과: %s\n", oudition(8.0,10.0));
    }

    public static String oudition(double vocal, double dance ) {
        return (vocal * dance >= 70.0) ? "합격" : "불합격";
        // 삼항 연산자의 구조 : (조건식)? 참의 반환 값 : 거짓의 반환 값;
    }

}
