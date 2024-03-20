package Chapter_4;

import java.util.ArrayList;
import java.util.Arrays;

public class S_ForEach {
    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("One","Two","Three"));

        // for-each문은 리스트에서 아이템을 한개씩 꺼내어 반복한다.
        for (String n : numbers) {
            System.out.println(n);
        }
    }
}
