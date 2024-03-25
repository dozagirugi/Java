package Java_Problem.Inheritance_Interface;

public class Problem_6 {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();

        taxi.start();
        taxi.stop(2500);

    }
}

interface Meter {
    public int base_fare = 3000;
    public abstract void start();
    public abstract void stop(int distance);
}

class Taxi implements Meter {
    @Override
    public void start() {
        System.out.println("운행을 시작합니다.");
    }

    @Override
    public void stop(int distance) {
        int price = base_fare + distance*2;
        System.out.printf("운행을 종료합니다. 요금은 %d원 입니다.", price);

    }
}