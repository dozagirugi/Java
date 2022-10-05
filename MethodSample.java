package java_study;

public class MethodSample { // MethodSample라는 클래스 
	int sum(int a, int b) { // sum이라는 메소드 
		return a + b;
	}
	
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		
		MethodSample sample = new MethodSample(); // 객체 생성 
		int c = sample.sum(a,b);
		
		System.out.println(c);

	}

}
