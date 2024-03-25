package Chapter_5;

// 추상 클래스는 클래스 앞에 abstract가 붙음.
abstract class GameObject{
    String name;
    void game() {
        System.out.println("게임 시작 !");
    } // 추상 메소드는 1. 클래스 처럼 구현도 되고
    abstract void describe();
    // 2. 인터페이스처럼 구현도 된다.
    // 메소드도 abstract가 붙음 -> 추상 메소드
}

class Player extends GameObject { // 추상 클래스는 extends(상속)으로 구현한다.
    @Override
    void describe() {
        System.out.println("Player 입니다.");
    }
}

class Monster extends GameObject{
    @Override
    void describe() {
        System.out.println("Monster 입니다.");
    }
}

public class S_AbstractClass {
    public static void main(String[] args) {

        // player 객체와 monster 객체는 게임 오브젝트를 상속했으므로 선언 가능
        GameObject[] objs = {new Player(), new Monster()};

        for (GameObject obj: objs){
            obj.game();
            System.out.println(obj); // 객체 주소 toString 메소드
            obj.describe(); // 추상 메소드 구현
        }

    }
}
