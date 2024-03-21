package Java_Problem.Array_Iteration;

public class Problem_1 {
    public static void main(String[] args) {
        double weight = 72.4;
        double plus = 0.231;

        for (int month =0; month<6; month++) {
            if (month<5) {
                continue;
            }

            System.out.printf("5개월 후 예상 몸무게 => %.2f kg",weight+plus*month);
        }
    }

}
