package chapter_3;

public class S_boolean {
    public static void main(String[] args) {
        int kim = 180;
        int lee = 185;
        boolean isTall = lee > kim;

        System.out.println(isTall);

        if(isTall){
            System.out.println("kim보다 lee의 키가 큽니다.");
        }

        int i=3;
        boolean isOdd = i % 2 ==2;
        System.out.println(isOdd);
    }

}
