package chapter_3;

import java.util.ArrayList;

public class S_generics {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList();
        //제네릭스로 String 타입을 정해놓으면 string 타입 말고는 name에 추가될수가 없다

        name.add("doyoen");
        name.add("kimdoremi");
        name.add("dozagirugi");

        System.out.println(name);

        ArrayList<Integer> numbers = new ArrayList();

        numbers.add(2);
        numbers.add(19);
        numbers.add(26);

        System.out.println(numbers);
    }

}
