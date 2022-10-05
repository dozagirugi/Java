package java_study;

import java.util.ArrayList; // ArraryList를 사용하기 위해서는 import.java.util.ArrayList와 같이 ArrayList를 먼저 import 해야한다. 

public class WhyYellow { // 리스트와 배열의 차이는 리스트는 크기가 정해져 있지 않고 동적으로 변한다는 점이다.  

	public static void main(String[] args) {
		ArrayList pitches = new ArrayList();
		pitches.add("136");
		pitches.add("129");
		pitches.add("142");

		System.out.println(pitches.get(1)); // ArrayList의 두번째 값을 출력
		System.out.println(pitches.size()); // ArrayList의 갯수를 리턴
		System.out.println(pitches.contains("142")); // ArrayList에 '142' 값이 있는지 리턴 
		
	}

}
