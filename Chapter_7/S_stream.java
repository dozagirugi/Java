package chapter_7;

import java.util.Arrays;
import java.util.Comparator;

public class S_stream {
    public static void main(String[] args) {
        int[] data = {5,6,4,2,3,1,1,2,2,4,8};
        int[] result = Arrays.stream(data)
                .boxed()
                .filter((a) -> a % 2 ==0) // 짝수만 뽑아냄
                .distinct() // 중복 제거
                .sorted(Comparator.reverseOrder()) // 역순 정렬
                .mapToInt(Integer::intValue) // IntStream 으로 변경
                .toArray() // int[] 배열로 반환
                ;

        System.out.println(Arrays.toString(result));
     }
}
