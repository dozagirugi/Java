package chapter_7;

import java.util.ArrayList;

public class S_Join extends Thread {
    int seq;

    public S_Join(int seq) {
        this.seq = seq;
    }

    public void run() {
        System.out.println(this.seq + " thread start."); // Thread 시작 !
        try {
            Thread.sleep(1000); // 현재 스레드(작업)를 1초 대기
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(this.seq + " thread end."); // Thread 종료 !
    }

    public static void main(String[] args) throws InterruptedException {
        for ( int i =0; i < 10; i++) {
            Thread t = new S_Join(i);
            t.start(); // thread 시작
            t.join(); // main이 스레드 종료까지 기다림
        }

        System.out.println("메인 종료 !");
    }
}
