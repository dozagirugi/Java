package Java_Problem.Method;

public class Problem_9 {
    public static void main(String[] args) {
        AnimalBelt(1999);
    }

    public static void AnimalBelt(int year) {
        String animal = "";

        switch (year % 12) {
            case 0 :
                animal = "원숭이" ;
                break;

            case 1 :
                animal = "닭" ;
                break;

            case 2 :
                animal = "개" ;
                break;

            case 3 :
                animal = "돼지" ;
                break;

            case 4 :
                animal = "쥐" ;
                break;

            case 5 :
                animal = "소" ;
                break;

            case 6 :
                animal = "호랑이" ;
                break;

            case 7 :
                animal = "토끼" ;
                break;

            case 8 :
                animal = "용" ;
                break;

            case 9 :
                animal = "뱀" ;
                break;

            case 10 :
                animal = "말" ;
                break;

            case 11 :
                animal = "양" ;
                break;
        }
        System.out.printf("%d년생은 %s띠 입니다.", year, animal);
    }
}
