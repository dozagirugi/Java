package Chapter_3;

public class S_enum {

    enum CoffeeType {
        Americano,
        Ice_Coffee,
        Cafe_Latte
    } // main 메소드 밖에 적기

    public static void main(String[] args) {
        System.out.println(CoffeeType.Americano);
    }
}
