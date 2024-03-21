package Chapter_5;

public class S_MethodEx6 {
    int varTest(int a) {
        a++;
        return a;
    }

    public static void main(String[] args) {
        int c = 5;

        S_MethodEx6 aplus = new S_MethodEx6();

        c = aplus.varTest(c);

        System.out.println(c);

    }
}
