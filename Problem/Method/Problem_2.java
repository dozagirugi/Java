package Java_Problem.Method;

public class Problem_2 {

    // 걷기 칼로리 소모량
    void walking (double walking_count) {
        double total_losing_calories = walking_count * 0.02;
        System.out.println("소모 칼로리: " + total_losing_calories + " kcal");
    }

    // 삼겹살 칼로리 계산
    void samgyepsal (int people) {

        double total_calories = people * 180 * 5.179;
        System.out.printf("삼겹살 %d인분: %.2f kcal", people, total_calories);
    }

    public static void main(String[] args) {

        Problem_2 sample = new Problem_2();

        // 걷기 칼로리 소모량
        sample.walking(5000);

        System.out.println();

        // 삼겹살 칼로리 계산
        sample.samgyepsal(3);

    }
}
