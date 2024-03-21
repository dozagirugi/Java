package Java_Problem.Method;

public class Problem_6 {
    public static void main(String[] args) {
        grade(88);
    }

    public static void grade(int score) {
        if (score>=95) {
            System.out.printf("%d점 -> A+", score);
        } else if (score>=90) {
            System.out.printf("%d점 -> A", score);
        } else if (score>=85) {
            System.out.printf("%d점 -> B+", score);
        } else if (score>=80) {
            System.out.printf("%d점 -> B", score);
        } else {
            System.out.printf("%d점 -> ", score);
        }
    }
}
