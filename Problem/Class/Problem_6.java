package Java_Problem.Class;

public class Problem_6 {
    public static void main(String[] args) {
        Menu jjajang = new Menu("짜장", 4900);
        Menu jjambbong = new Menu("짬뽕", 5900);
        Menu ttangsuckyuck = new Menu("탕수육", 13900);

        Menu[] menuArr = { jjajang, jjambbong, ttangsuckyuck };

        Order a = new Order(3, menuArr);
        System.out.println("주문합계: " + a.total_price() + "원");

    }
}

class Order {
    int orderNum;
    Menu[] menus;
    int result;
    public Order(int i, Menu[] arr) {
        orderNum = i;
        menus = arr;
    }

    public int total_price() {
        for (int i = 0; i < menus.length; i++) {
             result += menus[i].price;
        }
        return result;
    }
}

class Menu {
    String name;
    int price;

    public Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }
}