package Java_Problem.Class;

public class Problem_3 {
    public static void main(String[] args) {
        Miner malon = new Miner("Malon");
        Miner gloria = new Miner("Gloria");

        malon.coins();
        malon.coins();
        malon.coins();

        gloria.coins();
        gloria.coins();

        System.out.println(malon.gangbu());
        System.out.println(gloria.gangbu());
    }
}

class Miner {
    String name;
    int coins;

    public Miner(String name) {
        this.name = name;
        int coins = 0;
    }

    public String gangbu(){
        return String.format("Miner { name: %s, coins: %d }", name, coins);
    }

    public int coins(){
        return coins += 1;
    }
}