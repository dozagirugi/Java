package Java_Problem.Method;

public class Problem_10 {

    public static void main(String[] args) {
        double tall = 1.76;
        double weight = 81.6;

        double bmi_score = calculate(tall, weight);

        System.out.printf("BMI: %.2f(%.2fkg, %.2fm)\n", bmi_score, weight, tall);
        result(bmi_score);
    }
    public static double calculate (double tall, double weight) {
        double bmi_score = weight/(tall*tall);
        return bmi_score;
    }
    public static void result (double bmi_score) {
        if (bmi_score >= 30) {
            System.out.printf("비만입니다.");
        } else if(bmi_score >= 25) {
            System.out.printf("과체중입니다.");
        } else if(bmi_score >= 18.5) {
            System.out.printf("정상입니다.");
        } else {
            System.out.printf("저체중입니다.");
        }
    }
}
