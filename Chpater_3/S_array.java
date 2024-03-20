package Chapter_3;

public class S_array {
    public static void main(String[] args) {
        int[] odds = {1,3,5,7,9};
        String[] weekely = {"월","화","수","목","금"};
        char[] alphabet = {'a','b','c','d','이'};

        System.out.println(odds[1]);
        System.out.println(weekely[4]);
        System.out.print(alphabet);

        System.out.println();
        System.out.print("주간은 ");
        for(int i=0; i<weekely.length; i++){
            System.out.print(weekely[i]);
        }
        System.out.println("이다.");
    }
}
