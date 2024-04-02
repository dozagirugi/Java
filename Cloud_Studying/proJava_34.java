// #주사위 랜덤 숫자 받기

public class proJava_34 {
    public static void main(String[] args) {
        int result = rollDice();

        System.out.printf("주사위의 눈: %d", result);
    }

    public static int rollDice() {
        int diceNum = (int)(Math.random() * 10)+1;

        if (diceNum <= 6) {
            return diceNum;
        } else {
            rollDice();
        }

        return diceNum;
    }
}
