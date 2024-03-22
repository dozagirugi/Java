package Java_Problem.Class;

public class Problem_8 {

    public static void main(String[] args) {
        Hero kimdoyeon = new Hero("김도연");
        Hero honggildong = new Hero("홍길동");

        Hero.battle(kimdoyeon, honggildong);

    }
}

// Hero 클래스 만듬
class Hero {
    String name;
    int hp;

    // Hero 생성자 만듬
    public Hero(String a) {
        name = a;
        hp = 30;
    }

    // 펀치 메소드(한번 때릴때 데미지 주는 메소드) 만듬
    public void punch(Hero enemy) {
        int damage = (int) (Math.random() * 10) +1;
        enemy.hp -= damage;
    }

    // 배틀 메소드(싸우는 메소드) 만듬
    public static void battle(Hero a,Hero b) {
        boolean firstAttack = true;
        while ((a.hp > 0) && (b.hp > 0)) {
            if (firstAttack) {

                a.punch(b);
                System.out.printf("[%s] 의 펀치\n", a.name);
                System.out.printf("-> %s: %d/30\n", b.name, b.hp);
                System.out.println();

            } else {

                b.punch(a);
                System.out.printf("[%s] 의 펀치\n", b.name);
                System.out.printf("-> %s: %d/30\n", a.name, a.hp);
                System.out.println();

            }

            firstAttack = !firstAttack;

        }

    }
}
