// 20240403 #2 마린과 메딕 (마린에서 메딕이 힐 주기)
public class proJava_75 {
    public static void main(String[] args) {
        Marine marine = new Marine();
        Medic medic = new Medic();

        System.out.printf(marine.name + "의 현재 상태: HP: %d\n", marine.HP);
        System.out.printf(medic.name + "의 현재 상태: HP: %d | MP: %d\n", medic.HP, medic.MP);
        System.out.println();

        medic.heal();
        System.out.printf(medic.name + "의 현재 상태: HP: %d | MP: %d\n", medic.HP, medic.MP);
        System.out.println();

        marine.healing();
        System.out.printf(marine.name + "의 현재 상태: HP: %d\n", marine.HP);
        System.out.println();
    }
}

class Marine {
    String name = "marine";
    int HP = 50;


    void healing() {
        System.out.println("마린이 메딕의 힐을 받았습니다 ! 마린의 HP가 30 회복됩니다.");
        HP = HP + 30;
    }
}

class Medic {
    String name = "medic";
    int HP = 80;
    int MP = 90;

    void heal() {
        System.out.println("메딕이 마린의 체력을 회복시킵니다. 메딕의 마력이 15 하락합니다.");
        MP -= 15;
    }
}
