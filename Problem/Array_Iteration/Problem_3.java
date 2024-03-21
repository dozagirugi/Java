package Java_Problem.Array_Iteration;

public class Problem_3 {
    public static void main(String[] args) {
        int[] evens = {0 ,2 ,4, 6, 8};
        int[] odds = {1, 3, 5, 7, 9};

        int[] result = merge(evens,odds);

        System.out.print("결과: ");

        for (int i=0; i<result.length; i++) {
            System.out.printf("%d ", result[i]);
        }
    }

    public static int[] merge(int[] evens, int[] odds) {
        int[] numbers = new int[evens.length + odds.length];

        for (int i =0; i<evens.length; i++) {
            numbers [2*i]= evens[i];
            numbers [(2*i)+1] = odds[i];
        }

        return numbers;
    }
}
