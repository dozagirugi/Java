package Chapter_5;

class Animal{
    String name;
    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal { // extends 키워드로 부모 Animal 클래스 상속
    void sounds() {
        System.out.println(this.name + "는 멍멍");
    }
}

public class S_Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("해피");
        System.out.println("개의 이름은 " + dog.name);
        dog.sounds();

        Animal dog1 = new Dog();
    }
}
