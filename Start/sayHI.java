package java_study;

public class sayHI {
	String sayhallo() {
		return "Hi !";
	}

	public static void main(String[] args) {
		sayHI sample = new sayHI();
		String a = sample.sayhallo(); // 리턴 값 받을 변수 = 객체.메소드명()
		System.out.println(a);

	}

}
