package Java_Problem.Inheritance_Interface;

public class Problem_1 {
    public static void main(String[] args) {
        Coffee americano = new Coffee("americano", 3500);
        Ade lemonade = new Ade("lemonade", 4500);
        Tea earlgrey = new Tea("earlgrey", 3000);

        americano.order();
        lemonade.order();
        earlgrey.order();

    }
}

class Drink {
    String name;
    int price;

    public Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public void order() {
        System.out.println("주문되었습니다.");
    }
}

class Coffee extends Drink {
    public Coffee(String name, int price) {
        super(name, price);
    }

}

class Ade extends Drink {
    public Ade(String name, int price) {
        super(name, price);
    }
}

class Tea extends Drink {
    public Tea(String name, int price) {
        super(name, price);
    }
}