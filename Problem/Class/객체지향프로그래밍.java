package Java_Problem.Class;

public class 객체지향프로그래밍 {
    public static void main(String[] args) {
        // 1. 객체 생성
        int a = 10; // 기본 타입은 변수(a)가 값을 가짐.
        Square result = new Square(); // 'new Square()'가 진짜 객체. 클래스 타입은 변수(s)가 값을 가지는 것이 아니라 주소를 가지는 것이다.

        // 2. 필드 초기화 (값 변경)
        result.length = 4;

        // 3. 결과 출력 (넓이 도출하기)
        System.out.printf("한 변의 길이가 %d인 정사각형의 넓이는 %d이다.", result.length, result.area());
    }
}

// 정사각형 클래스
class Square {
    int length;

    // 메소드 생성
    int area() {
        return length*length;
    }
}