package java_study;

public class formating {

	public static void main(String[] args) {
		System.out.println(String.format("I eat %d apples.", 3));
		
		System.out.println(String.format("I eat %s apples.", "five"));
		
		int number = 4;
		System.out.println(String.format("I eat %d apples.", number));
		
		int howmany = 10;
		String day = "three";
		System.out.println(String.format("I eat %d apples. so I was sick for %s days.", howmany, day));
	}

}
