package Chapter_4;

public class S_WhileJavability {
    public static void main(String[] args) {
        int javability = 0;

        while (javability < 10) {
            System.out.printf("현재 자바 능력은 %d 입니다.",javability);
            System.out.println();
            javability ++;
        }

        if (javability == 10) {
            System.out.println("자바 능력이 10이 되었습니다. 성장했군요 !");
        }
    }
}
