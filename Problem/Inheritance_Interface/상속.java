package Java_Problem.Inheritance_Interface;

public class 상속 {
    public static void main(String[] args) {
        Elf elf = new Elf ("티란데", 100);
        HighElf highElf = new HighElf("말퓨리온", 160, 100);
        ElfLord elfLord = new ElfLord("마이에브", 230, 140, 100);

        Elf[] elves = { elf, highElf, elfLord };

        for (int i = 0; i < elves.length; i++) {
            System.out.println(elves[i].toString());
        }
    }
}

class Elf {
    String name;
    int hp;

    public Elf(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String toString() {
        return String.format("[엘프] Name: %s, HP: %d", name, hp);
    }
}

class HighElf extends Elf {
    int mp; // Elf 클래스의 name, hp에 mp를 추가.

    public HighElf(String name, int hp, int mp) {
        super(name, hp);
        // 상속 받았기 때문에 Elf 클래스의 생성자를 받지 않으면 에러가 난다.
        // 부모 클래스의  Elf 생성자로 객체를 생성.
        this.mp = mp;
    }

    public String toString() {
        return String.format("[하이 엘프] Name: %s, HP: %d, MP: %d", name, hp, mp);
    }
}

class ElfLord extends HighElf {
    int shield;
    public ElfLord(String name, int hp, int mp, int shield) {
        super(name, hp, mp); // 부모 클래스인 HighElf의 객체를 생성
        this.shield = shield;
    }
    public String toString() {
        return String.format("[엘프로드] Name: %s, HP: %d, MP: %d, Shield: %d", name, hp, mp, shield);
    }
}
