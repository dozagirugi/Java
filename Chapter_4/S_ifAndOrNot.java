package Chapter_4;

public class S_ifAndOrNot {
    public static void main(String[] args) {
        int money = 3500;
        int people = 3;

        if (money > 3000 && people >= 2) {
            System.out.println("돈도 많고 사람도 많으니 택시를 타자");
        } else {
            System.out.println("그냥 걸어가자..");
        }

        if (money > 2500 || people >= 2) {
            System.out.println("돈은 별로 없지만 사람이 많으니 택시를 타자");
        } else {
            System.out.println("그냥 걸어가자..");
        }

    }
}
