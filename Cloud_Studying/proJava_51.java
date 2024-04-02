// #20240402 구구단 레지고

public class proJava_51 {
    public static void main(String[] args) {
        gugudan();
    }

    public static void gugudan() {
        for (int i = 2; i <= 9; i++) {
            System.out.println();
            System.out.printf("< %d단 입니다 >\n", i);
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %d", i, j, i*j);
                System.out.println();
            }
        }
    }
}
