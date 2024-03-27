package java_Problem.java_API;

import java.util.Random;

public class Problem_2 {
    public static void main(String[] args) {

        LottoMachine machine = new LottoMachine();

        int[] numbers = machine.getLottoNumbers();

        System.out.print("로또 번호 생성: ");
        for (int i : numbers) {
            System.out.printf("%d ",i);
        }
    }
}

class LottoMachine {
    private int[] LottoNumbers;

    public LottoMachine() {
        LottoNumbers = generate();
    }

    public int[] generate() {
        int[] pickedNumbers = new int[6];
        Random random = new Random();

        for (int i = 0; i<6; i++){
            pickedNumbers[i] = random.nextInt(45) + 1;
        }

        return pickedNumbers;
    }

    public int[] getLottoNumbers() {
        return LottoNumbers;
    }
}
