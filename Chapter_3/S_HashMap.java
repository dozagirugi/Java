package chapter_3;

import java.util.HashMap;

public class S_HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("김도연", 1904);
        map.put("홍길동", 3420);
        map.put("어쩌구", 2508);
        map.put("저쩌구",1415);

        System.out.println("map의 구성은 이렇습니다 -> " + map);
        System.out.println("김도연의 학번은: " + map.get("김도연"));
        System.out.println("value값으로는 key값을 구할 수 없습니다. ->" + map.get(2508)); // key값으로만 value를 출력할 수 있다 (value -> key 못꺼냄)

        System.out.println("홍길동이라는 키를 가지고 있나요?: " + map.containsKey("홍길동"));

        map.remove("어쩌구");
        System.out.println("어쩌구라는 학생의 목록을 지웠습니다. 그래서 남는 학생은: " + map);

        System.out.println("이제 맵의 길이는 " + map.size());

        System.out.println("키 값만 모으면 " + map.keySet());


        HashMap<String, String> test = new HashMap<>();
        test.put("부산","Busan");
        test.put("서울","Seoul");

        System.out.println(test.get("부산"));
    }
}
