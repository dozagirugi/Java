package Chapter_5;

class Car {
    String name;
    int year;

    Car() {
        System.out.println("디폴트 생성자 입니다.");
    }

    Car (String name) {
        this.name = name;
    }
    // 생성자 오버로딩 : 입력이 다른 여러개의 생성자

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
    }
    // alt + insert 눌러서 생성자 만들기

    void setName (String name){
        this.name = name;
    }
}

class Hyundai extends Car {

}

public class S_Constructor {
    public static void main(String[] args) {

        Car car = new Car();
        // 상속일경우 자식 객체는 부모 객체도 함께 생성
        Car hyundai = new Car("genesis");
        System.out.println(hyundai.name);
        Car benz = new Car("e-class",2024);
    }
}
