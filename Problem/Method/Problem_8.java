package Java_Problem.Method;

public class Problem_8 {
    public static void main(String[] args) {
        guide(4);
        guide(14);

    }

    public static void guide(int floor) {
        if (floor<=10) {
            System.out.printf("%d층 -> 저층 엘레베이터\n", floor);
        } else {
            System.out.printf("%d층 -> 고층 엘레베이터\n", floor);
        }
    }
}
