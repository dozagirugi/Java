// 20240403 #1 자판기에서 콜라 빼기
public class proJava_66 {
    public static void main(String[] args) {
        DrinkMachine firstPerson = new DrinkMachine();
        DrinkMachine secondPerson = new DrinkMachine();

        firstPerson.drinkMachine(0);
        secondPerson.drinkMachine(2);
    }
}

class DrinkMachine {
    void drinkMachine(int num) {
        String[] menu = {"coke", "cider", "juice"};
        System.out.println(menu[num] + "가 나왔습니다.");
    }
}