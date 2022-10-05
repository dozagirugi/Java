package java_study;

public class Array {

	public static void main(String[] args) {
		int[] odd = {1, 3, 5, 7, 9}; // 정수형의 배열 
		String[] weeks = {"월", "화", "수", "목", "금", "토", "일"}; // 문자열의 배열 
		
		System.out.println(odd[1]); // 배열의 순서는 0부터 시작됨 
		System.out.println(weeks[4]);
		
		String[] colors = new String[7]; // 배열의 길이를 먼저 설정한 후, 나중에 값을 대입 
		colors[0] = "빨강";
		colors[1] = "주황";
		colors[2] = "노랑";
		colors[3] = "초록";
		colors[4] = "파랑";
		colors[5] = "남색";
		colors[6] = "보라";
		
		System.out.println(colors[2]);
		
		for (int i = 0; i < colors.length; i++) {
			System.out.println(colors[i]); // color의 배열을 순서대로 출력하는 프로그램 
		}
		
 	}

}
