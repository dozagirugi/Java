package Chapter_4;

public class S_이중for문_구구단 {
    public static void main(String[] args) {
        for(int i=2; i<10; i++) {
            System.out.println();
            System.out.println(i + "단 시작합니다.");
            System.out.println();

            for(int j = 1; j < 10; j++) {
                System.out.printf("%d x %d = %d",i,j,i*j);
                System.out.println();
                }
            }
        }
    }
