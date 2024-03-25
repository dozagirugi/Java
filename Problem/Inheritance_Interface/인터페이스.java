package Java_Problem.Inheritance_Interface;

import java.util.ArrayList;

public class 인터페이스 {
    public static void main(String[] args) {
        Sounding dog = new Dog(); // Dog은 Sounding을 상속 받았기 때문에 Sounding으로 객체를 생성해도 된다 !
        Sounding baby = new Baby();
        Sounding tiger = new Tiger();
        Sounding robot = new Robot();

        ArrayList<Sounding> list = new ArrayList<Sounding>();
        list.add(dog);
        list.add(baby);
        list.add(tiger);
        list.add(robot);

        for (int i = 0; i<list.size(); i++) {
            list.get(i).sound();
        }

    }
}

interface Sounding{
    public void sound();
}

class Dog implements Sounding {
    public void sound() {
        System.out.println("Dog: 멍멍 !");
    }
}

class Baby implements Sounding {
    public void sound() {
        System.out.println("Baby: 아 응애에요");
    }
}

class Tiger implements Sounding {
    public void sound() {
        System.out.println("타이거: 어흥");
    }
}

class Robot implements Sounding {

    public void sound() {
        System.out.println("알파고: 안녕하십니까. 휴먼.");
    }
}