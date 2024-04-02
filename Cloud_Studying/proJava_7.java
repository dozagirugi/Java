// 20240401 #1

public class proJava_7 {
    public static void main(String[] args) {
        Foo example = new Foo();

        example.result();
        //System.out.println();
        //System.out.println("다음은 Foo 클래스의 result() 메소드로 출력한것입니다.");
        //System.out.println();
        //example.println();

    }
}

class Foo {
    String str;

    void println() {
        System.out.println("헬로?");
    }

    void result() {
        System.out.print("1. 클래스란 자바 프로그램의 최소 단위이다.\n" +
                "2. 주석은 실행되지 않는 코드이다.\n" +
                "3. 메인 메소드란 프로그램 실행의 시작점이다.\n" +
                "4. println() 메소드는 문자열을 출력한다.\n");
    }
}