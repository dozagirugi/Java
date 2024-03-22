package Java_Problem.Class;

public class Problem_5 {
    public static void main(String[] args) {
        Tools storm = new Tools("스톰 브레이커",600);
        Tools infinite = new Tools("인피니티 건틀렛",999);
        Tools howk = new Tools("호크아이의 활",50);
        Tools captain = new Tools("캡틴 아메리카의 방패",70);

        System.out.println(storm.result());
        System.out.println(infinite.result());
        System.out.println(howk.result());
        System.out.println(captain.result());
    }
}

class Tools {
    String name;
    int power;

    public Tools(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String result() {
        return String.format("Item { name: %s, power: %d }", name, power);
    }
}