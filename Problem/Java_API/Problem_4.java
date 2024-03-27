package java_Problem.java_API;

import java.util.ArrayList;

public class Problem_4 {
    public static void main(String[] args) {

        ArrayList<Cart> myCart = new ArrayList<Cart>();

        myCart.add(new Cart("스트라이프 셔츠",49900));
        myCart.add(new Cart("슬림 면바지",58900));
        myCart.add(new Cart("스니커즈",46900));

        int total_price = 0;

        for (int i = 0; i < myCart.size(); i++) {
            Cart result = myCart.get(i);
            total_price += result.getMoney();
        }

        System.out.printf("총합: %d원", total_price);

    }
}

class Cart {
    String product_name;
    int price;

    public Cart (String product_name, int price) {
        this.product_name = product_name;
        this.price = price;
    }

    int getMoney() {
        return price;
    }

}
