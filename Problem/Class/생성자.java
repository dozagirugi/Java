package Java_Problem.Class;

public class 생성자 {
    public static void main(String[] args) {
        // 객체 생성
        Marine marine = new Marine("dozagirugi", 80);
        Medic medic = new Medic("김도연", 20);

        // 마린 스팀팩 사용
        marine.stimpack();

        // 메딕 힐 사용
        medic.heal(marine);
    }
}

// 마린 클래스
class Marine {
    // 필드 (= 변수)
    String name;
    int hp;

    // 생성자 (alt + insert, 필드값 초기화)
    public Marine(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    // 메소드
    public void stimpack() {
        System.out.printf("[%s]의 스팀팩 ! HP : %d -> ", name, hp);
        hp = hp-10;
        System.out.printf("%d\n",hp);
    }
}

// 메딕 클래스
class Medic {
    // 필드
    String name;
    int hp;

    // 생성자 (alt + insert, 필드값 초기화)
    public Medic(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    // 메소드
    public void heal(Marine to) {
        System.out.printf("[%s]의 치유 ! [%s]의 HP : %d -> ",name,to.name,to.hp);
        to.hp = to.hp + 10;
        System.out.printf("%d\n",to.hp);
    }
}
