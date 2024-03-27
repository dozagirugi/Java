package chapter_7;

public class S_Thread extends Thread {
    int seq;

    public S_Thread(int seq) {
        this.seq = seq;
    }

    // thread의 run 메소드가 thread 시작(start)시 실행됨

    public void run() {
        System.out.println(this.seq + " thread start."); // Thread 시작 !
        try {
            Thread.sleep(1000); // 현재 스레드(작업)를 1초 대기
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(this.seq + " thread end."); // Thread 종료 !
    }

    public static void main(String[] args) {
        S_Thread a = new S_Thread(4);

        System.out.println(a);

        for (int i = 0; i <10; i++) {
            Thread t = new S_Thread(i);
            t.start(); // 10개의 스레드 각각 실행
        }
        System.out.println("main end.");


    }
}
