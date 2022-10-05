package java_study;

class Animals {
	String name;
	
	void setName(String name) {
		this.name = name;	
	}
}

class Dog extends Animals { 
 
 // 클래스 상속을 위해서 extends라는 키워드를 사용했다.
 // Dog 클래스에는 name 이라는 객체 변수와 setName 이라는 메소드가 없지만 Animal 클래스를 상속 받았기 때문에 모두 사용이 가능하다. 	

}

public class Dog_Animal {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("baduk");
		System.out.println(dog.name);
	}
}
