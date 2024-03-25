package Java_Problem.Inheritance_Interface;

public class Problem_3 {
    public static void main(String[] args) {
        KRW krw = new KRW("KRW", 1500.00,"원");
        USD usd = new USD("USD", 100.50, "달러");
        EUR eur = new EUR("EUR", 260.87, "유로");
        JPY jpy = new JPY("JPY", 1400.00, "엔");

        krw.explain_money();

        usd.explain_money();

        eur.explain_money();

        jpy.explain_money();

    }
}

class KRW {
    String name;
    double money;
    String notation;

    public KRW (String name, double money, String notation) {
        this.name = name;
        this.money = money;
        this.notation = notation;
    }

    void explain_money() {
        System.out.printf("%s: %.2f %s\n", name, money, notation);
    }

}

class USD extends KRW {

    public USD (String name, double money, String notation) {
        super(name, money, notation);
    }

}

class EUR extends KRW {

    public EUR (String name, double money, String notation) {
        super(name, money, notation);
    }

}

class JPY extends KRW {

    public JPY (String name, double money, String notation) {
        super(name, money, notation);
    }

}