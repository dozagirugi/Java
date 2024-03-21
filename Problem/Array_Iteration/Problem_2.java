package Java_Problem.Array_Iteration;

public class Problem_2 {
    public static void main(String[] args) {
        String[] city = {"서울", "부산", "인천", "대전", "대구"};
        int[] visitor = {599, 51, 46, 43, 27};

        for (int i=0; i< city.length; i++) {
            System.out.println(city[i]+": "+visitor[i]+"명");
        }
    }
}
