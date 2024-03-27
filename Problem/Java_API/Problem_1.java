package java_Problem.java_API;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem_1 {
    public static void main(String[] args) {
        ArrayList<Chicken> order = new ArrayList<Chicken>();

        order.add(new Chicken("로스트 치킨", 9900));
        order.add(new Chicken("파닭 치킨", 12900));
        order.add(new Chicken("마늘아 치킨", 13900));

        int total_price = 0;

        // 1. totla_price를 구하는 첫번째 방법 : 일반적인 for문
        for (int i = 0; i < order.size(); i++) {
            Chicken abc = order.get(i);
            total_price += abc.getPrice();
        }

        // 2. totla_price를 구하는 두번째 방법 : for - each 문
        for (Chicken c : order) {
            total_price += c.getPrice();
        }

        System.out.println(total_price);

    }
}

class Chicken {
    String name;
    int price;

    public Chicken(String name, int price) {
        this.name = name;
        this.price = price;
    }

    int getPrice() {
        return price;
    }
}
