package Java_Problem.Method;

public class Problem_4 {
    public static void main(String[] args) {
        double dice_dollar = dice() + dice() + dice();
        double won = exchange(dice_dollar);

        System.out.printf("획득 금액: $%.2f (%.0f원)", dice_dollar, won);
    }
    public static int dice() {
        int ran = (int)(Math.random()*6)+1;
        return ran;
    }
    public static double exchange(double dollar) {
        return dollar * 1082.25108;
    }
}

