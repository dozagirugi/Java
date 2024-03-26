package chapter_3;

public class S_parseInt {
    public static void main(String[] args) {
        String strNum = "123";

        // 문자형를 정수형으로 변환
        int realNum = Integer.parseInt(strNum);

        // 문자형을 실수형으로 변환
        double douNum = Double.parseDouble(strNum);

        // 정수형을 문자형으로 변환
        String numToStr = "" + realNum; // 문자열 + 숫자 => 문자열

        System.out.printf("정수형: %d", realNum);
        System.out.println();
        System.out.printf("실수형: %f", douNum);
        System.out.println();
        System.out.printf("문자형: %s", numToStr);
        System.out.println();

        double dksldjswpRKwl = 123.456;
        int gksirh = (int)dksldjswpRKwl;

        System.out.println(gksirh);
    }
}
