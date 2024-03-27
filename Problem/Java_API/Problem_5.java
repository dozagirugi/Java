package java_Problem.java_API;

import java.util.ArrayList;

public class Problem_5 {
    public static void main(String[] args) {
        ArrayList<Menu> order = new ArrayList<Menu>();

        order.add (new Menu("김밥", 2000,57));
        order.add (new Menu("돈까스", 6000, 29));
        order.add (new Menu("냉면", 5000, 34));

        int total_price = 0 ;

        for (int i = 0; i < order.size(); i++) {
            total_price += order.get(i).getPrice() * order.get(i).getCount();
        }

        System.out.println("총 결제할 금액은 " + total_price + "원 입니다.");
    }
}

class Menu {
    String menu_name;
    int price;
    int count;

    public Menu (String menu_name, int price, int count) {
        this.menu_name = menu_name;
        this.price = price;
        this.count = count;
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }
}
