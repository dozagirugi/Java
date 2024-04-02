public class proJava_59 {
    public static void main(String[] args) {
        int[] weekly = {581, 512, 527, 495, 423, 141, 236};

        System.out.printf("하루 평균 사용자: %.2f명",average(weekly));
    }

    public static double average(int[] arr) {
        double sum = 0;
        for (int i=0; i<7; i++ ){
            sum += arr[i];
        }
        double result = sum/7.0;
        return result;
    }
}
