package Java_Problem.Class;

public class Problem_4 {
    public static void main(String[] args) {
        Cube a = new Cube(3);
        Cube b = new Cube(5);

        System.out.printf("정육면체 a의 부피: %d, 겉넓이: %d\n",a.sizeOfV(),a.sizeOfS());
        System.out.printf("정육면체 b의 부피: %d, 겉넓이: %d\n",b.sizeOfV(),b.sizeOfS());
    }

}

class Cube {
    int length;

    public Cube(int length) {
        this.length = length;
    }

    public int sizeOfV() {
        return length*length*length;
    }

    public int sizeOfS() {
        return 6*length*length;
    }
}