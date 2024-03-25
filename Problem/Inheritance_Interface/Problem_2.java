package Java_Problem.Inheritance_Interface;

public class Problem_2 {
    public static void main(String[] args) {

        Car tico = new Car("티코");
        Truck bongo = new Truck("봉고", 1.5);

        System.out.println(tico.toString());
        System.out.println(bongo.toString());

    }
}

class Car {
    protected String name;

    public Car(String name){
        this.name = name;
    }

    public String toString() { // toString 메서드는 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드이다.
        return String.format("[자동차] { name: %s }", name);
    }
}

class Truck extends Car {
    double ton;
    public Truck(String name, double ton) {
        super(name);
        this.ton = ton;
    }

    public String toString() {
        return String.format("[트럭] { name: %s, ton: %.1f }", name, ton);
    }
}
