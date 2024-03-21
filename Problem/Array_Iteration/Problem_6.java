package Java_Problem.Array_Iteration;

public class Problem_6 {
    public static void main(String[] args) {
        printFactorial(4);
    }

    public static void printFactorial(int number) {
        System.out.printf("%d ! = ", number);

        for (int i=number; i>0; i--) {
            System.out.printf("%d", i);
            if (i != 1) {
                System.out.print(" x ");
            }
        }
    }
}
