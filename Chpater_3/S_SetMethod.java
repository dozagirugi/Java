package Chapter_3;

import java.util.Arrays;
import java.util.HashSet;

public class S_SetMethod{
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Jump");
        set.add("To");
        set.add("Java");

        System.out.println(set);

        set.addAll(Arrays.asList("HTML","CSS","JavaScript"));

        System.out.println(set);

        set.remove("To");

        System.out.println(set);

        set.removeAll(Arrays.asList("JavaScript","CSS"));

        System.out.println(set);
    }

}
