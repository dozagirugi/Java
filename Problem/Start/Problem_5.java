package Java_Problem.Start;

public class Problem_5 {
    public static void main(String[] args) {
        int euro = 52;
        int dollar = 32;

        double euroRate = 1281.62664;
        double dollarRate = 1091.70306;

        double korEuro = euro * euroRate;
        double korDollar = dollar * dollarRate;

        double result = korEuro + korDollar;

        System.out.printf("환전 결과: %.0f원",result); // 소수점을 표현하고 싶지 않다면 .0f로 지정하기
    }
}
