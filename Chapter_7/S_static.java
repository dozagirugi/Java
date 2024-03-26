package chapter_7;

class Counter {
    // static 변수는 처음 한번 만들어지고 공유된다.
    static int count = 0;

    public Counter() {
        count ++; // 객체 생성시 카운트 값을 증가시킨다.
        System.out.println(count);
    }
}

public class S_static {
    public static void main(String[] args) {
        // static 변수는 객체 없이 사용 가능하고 다른 객체들도 공유할 수 있다.

        System.out.println(Counter.count);
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println(Counter.count);
    }
}
