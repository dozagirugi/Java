package java_Problem.java_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 자바API {
    public static void main(String[] args) {
        //45개의 공을 리스트로 만듬
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0; i<46; i++) {
            numbers.add(i); // numbers에는 1,2,3~45 숫자가 들어간다.
        }
        // 랜덤으로 섞기
        Collections.shuffle(numbers);

        // 6개의 숫자 뽑기
        int[] pick = new int[6];

        for (int i = 0; i<6; i++) {
            pick[i] = numbers.get(i);
        }

        // 출력하기
        System.out.print(Arrays.toString(pick));
    }
}
