package chapter_3;

import java.util.Arrays;
import java.util.HashSet;

public class S_Set {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList("H","E","L","L","O"));

        System.out.println(set);

        // 교집합 구하기 -> retainAll
        HashSet<Integer> num2 = new HashSet<>(Arrays.asList(2,4,6,8,10,12));
        HashSet<Integer> num4 = new HashSet<>(Arrays.asList(4,8,12,16,20));

        HashSet<Integer> intersection = new HashSet<>(num2);
        intersection.retainAll(num4);

        System.out.println("교집합: " + intersection);

        // 합집합 구하기 -> addAll
        HashSet<Integer> union = new HashSet<>(num2);
        union.addAll(num4); // num2와 num4를 모두 더함(중복은 자동으로 제외됨 -> set의 고유 특성)

        System.out.println("합집합: " + union);

        // 차집합 구하기 -> removeAll
        HashSet<Integer> subset = new HashSet<>(num2);
        subset.removeAll(num4);

        System.out.println("차집합: " + subset);
    }
}
