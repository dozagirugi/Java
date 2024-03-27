package java_Problem.java_API;

import java.util.StringTokenizer;

public class Problem_3 {
    public static void main(String[] args) {
        String str = "나는,정말,행복하다,우하하하,집에가자";
        String comma = ",";

        StringTokenizer token = new StringTokenizer(str, comma);

        while (token.hasMoreTokens()) {
            // hasMoreToken() : 토큰이 남아있는지 알려준다.
            // while (token.hasMoreTokens()) -> 토큰이 있으면 계속 반복하고, 없으면 종료해라
            System.out.println(token.nextToken()); // nextToken(): 객체에서 다음 토큰을 반환한다.
        }
    }
}
