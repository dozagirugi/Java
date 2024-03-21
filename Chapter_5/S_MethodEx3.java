package Chapter_5;

public class S_MethodEx3 {

    void plusCalculator(int a, int b) {
        System.out.println(a + "와 " + b + "의 합은 " + (a+b) + " 입니다.");
    }

    S_MethodEx3 idus = new S_MethodEx3();

    public static void main(String[] args) {

        S_MethodEx3 idus = new S_MethodEx3();
        idus.plusCalculator(2,8);

    }
}
