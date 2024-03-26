package java_study;

class Animal {
	String name;
	
	public void setName(String name) { // 메소드는 클래스 내에 구현된 함수를 의미하는데 보통 함수라고 하지 않고 메드라고 한다. 
		this.name = name;
	}
}	

public class Instace_variable {
	public static void main(String[] args) {
		Animal cat = new Animal();
		Animal dog = new Animal();
		
		cat.setName("nabi"); 
		dog.setName("happy");
		
		System.out.println("고양이의 이름은 " + cat.name + "입니다."); // cat은 객체, name은 객체 변수
		System.out.println("강아지의 이름은 " + dog.name + "입니다.");
	}
}

