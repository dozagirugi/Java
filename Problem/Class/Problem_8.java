package Java_Problem.Class;

public class Problem_8 {
    public static void main(String[] args) {
        Hero kimdoyeon = new Hero("김도연");
        Hero dozagirugi = new Hero("도자기러기");

        Hero.battle(dozagirugi, kimdoyeon);
    }
}

class Hero {
    String name;
    int hp;

    public Hero(String hero_name) {
        String name = hero_name;
        hp = 30;
    }

    public void punch(Hero enemy) {
        System.out.printf("[%s]의 펀치\n",name);
        enemy.hp -= Math.random();
        System.out.printf("\t%s: %d/30\n",enemy.name ,enemy.hp);
    }

    public static void battle(Hero a, Hero b) {

    }
}
