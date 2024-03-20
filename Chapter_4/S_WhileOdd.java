package Chapter_4;

public class S_WhileOdd {
    public static void main(String[] args) {
        int num = 0;

        while (num<10) {
            num ++;

            if (num%2 == 0){
                continue;
            }
            System.out.printf("10 이하 홀수 %d 입니다.", num);
            System.out.println();
        }
    }
}
