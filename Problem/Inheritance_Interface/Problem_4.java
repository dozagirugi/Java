package Java_Problem.Inheritance_Interface;

public class Problem_4 {
    public static void main(String[] args) {
        GreatWizard gandalf = new GreatWizard("Gandalf", 100, 100, 100);

        System.out.println(gandalf.toString());
        System.out.println();

        gandalf.energyVolt();
        System.out.println();

        gandalf.great_wizard_buff();

    }
}

class Novice {
    String name;
    int hp;

    public Novice(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String toString() {
        return String.format("[Novice] %s | HP: %d", name, hp);
    }
}

class Wizard extends Novice {
    int mp;

    public Wizard(String name, int hp, int mp) {
        super(name, hp);
        this.mp = mp;
    }

    public void energyVolt() {
        System.out.printf("%s의 에너지 볼트 ! \n", name);
    }
}

class GreatWizard extends Wizard {
    int shield;

    public GreatWizard(String name, int hp, int mp, int shield) {
        super(name, hp, mp);
        this.shield = shield;
    }

    public String toString() {
        return String.format("[Great Wizard] %s | HP: %d, MP: %d, SHIELD: %d", name, hp, mp, shield);
    }

    public void great_wizard_buff() {
        System.out.printf("(%s의 버프로 데미지 +30 추가)", name);
    }
}