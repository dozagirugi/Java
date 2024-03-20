package Chapter_3;

import java.util.ArrayList;

public class S_ArrayList {
    public static void main(String[] args) {
        ArrayList fruit = new ArrayList();
        fruit.add("apple");
        fruit.add("banana");
        fruit.add("melon");

        System.out.println("fruit 리스트의 구성은 "+ fruit +"이다.");
        System.out.println("fruit의 3번째 값은 "+ fruit.get(2) + "이다."); //인덱스 번호를 이용해서 값을 가져오고 싶다면 get 함수 쓰기 !
        System.out.println("fruit 리스트의 길이는 "+ fruit.size() +"이다.");
        System.out.println("fruit 리스트 안에는 melon이 있다? "+ fruit.contains("melon"));
        System.out.println("나는 바나나를 싫어하니까 제거하겠어(객체로 제거) " + fruit.remove("banana") + " 그 다음에 남는 것은 "+ fruit);
        System.out.println("근데 멜론도 별로 안좋아해(인덱스로 제거) " + fruit.remove(1) + " 결국 얘만 남았군 " + fruit);
    }
}
