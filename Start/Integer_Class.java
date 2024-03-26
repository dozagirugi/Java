package java_study;

public class Integer_Class {

	public static void main(String[] args) {
		String num = "123";
		int n = Integer.parseInt(num); // 문자열을 정수로 바꾸기 
		System.out.println(n); 
		
		int k = 456;
		String str = "" + k; // 정수를 문자열로 바꾸기 : 정수 앞에 빈 문자열 ("")을 더해주
		System.out.println(str); 
	}

}
