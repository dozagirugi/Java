package Chapter_5;

// 계산기 클래스 만듬 ! 그리고 개졸림
class Calculator {
    int result = 0;
    int add(int number) {
        result += number;
        return result;
    }
}

class Fruits{
    String name;
}

public class S_Class {
    public static void main(String[] args) {
        Calculator doyeon = new Calculator();
        Calculator geounu = new Calculator();

        System.out.println("도연의 계산기 사용: " + doyeon.add(26));
        System.out.println("도연의 계산기 사용: " + doyeon.add(2024));

        System.out.println("건우의 계산기 사용: " + geounu.add(29));
        System.out.println("건우의 계산기 사용: " + geounu.add(1996));

        Fruits apple = new Fruits();
        apple.name = "사과";
        System.out.println(apple.name);

        Fruits banana = new Fruits();
        banana.name = "바나나";
        System.out.println(banana.name);

        Fruits grape = new Fruits();
        grape.name = "포도";
        System.out.println(grape.name);
    }
}
