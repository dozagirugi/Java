package chapter_7;

class Sample_s {
    // 싱글톤 패턴 : 단 하나의 객체를 만드는 방법.
    private static Sample_s one; // 다른 클래스에서 접근 불가

    private Sample_s() {

    } // 생성자도 private으로 다른 클래스에서 접근 불가로 만듬

    public static Sample_s getInstance() {
        if (one == null) {
            one = new Sample_s(); // 처음 한번 객체가 생성됨
        }
        return one;
    }
}

public class S_singleton {
    public static void main(String[] args) {
        Sample_s s1 = Sample_s.getInstance(); // 객체 생성
        Sample_s s2 = Sample_s.getInstance(); // 같은 객체
        Sample_s s3 = Sample_s.getInstance(); // 같은 객체

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s1);
    }
}
