package chapter_3;

public class S_내장메소드 {
    public static void main(String[] args) {

        //indexOf: 문자열에서 특정 문자열이 시작되는 위치(인덱스 값)를 리턴
        String a = "I AM KIMDOYEON";
        System.out.println(a.indexOf("KIMDOYEON"));
        System.out.println(a.indexOf("I")); //java에선 숫자를 0부터 센다

        //contains: 문자열에서 특정 문자열이 포함되어 있는지 참*거짓을 리턴
        System.out.println(a.contains("KIMD"));
        System.out.println(a.contains("kimd")); //대*소문자 구별함
        System.out.println(a.contains("I A K"));

        //charAt: 문자열에서 특정 위치의 문자를 리턴
        System.out.println(a.charAt(3));

        //replaceAll: 문자열에서 특정 문자열을 다른 문자열로 바꿈
        System.out.println(a.replaceAll("KIMDOYEON", "DOZAGIRUGI"));

        //substring: 특정 문자열을 어디서부터 어디까지 뽑아낼때 사용
        System.out.println(a.substring(0,8)); //시작 위치(0)부터 끝나는 위치(8) 전까지 출력된다 -> 즉 인덱스 0부터 인덱스 7까지 출력됨.

        //split: 특정한 구분자로 나누어 배열로 리턴
        String b = "I:am:Kimdoyeon";
        String[] result = a.split(":");
        System.out.println(result);
    }
}
