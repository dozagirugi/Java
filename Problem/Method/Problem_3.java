package Java_Problem.Method;

public class Problem_3 {
    public static void main(String[] args) {
        double fuel = 8.86;
        double distance = 182.736;

        double result = calculator(fuel,distance);

        System.out.printf("연비: %.2f km/L", result);
    }

    public static double calculator(double fuel, double distance) {
        double effiency = distance/fuel;
        return effiency;
    }
}
