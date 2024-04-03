// 20240403 #3 피타고라고라스 정리
public class proJava_83 {
    public static void main(String[] args) {
        Point A = new Point(0,0);
        Point B = new Point(3,4);

        System.out.printf("두 점 A(%d, %d), B(%d, %d) 사이의 거리: %.2f", A.a, A.b, B.a, B.b, Math.sqrt(A.toDistance(A.a-B.a,A.b-B.b)));
    }
}

class Point {
    int a;
    int b;

    public Point(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double toDistance(int a, int b) {
        double result;
        result = a*a + b*b;

        return result;
    }
}