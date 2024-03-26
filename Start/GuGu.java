package java_study;

public class GuGu {
	public void dan(int n) {
		System.out.println(n * 1);
		System.out.println(n * 2);
		System.out.println(n * 3);
		System.out.println(n * 4);
		System.out.println(n * 5);
		System.out.println(n * 6);
		System.out.println(n * 7);
		System.out.println(n * 8);
		System.out.println(n * 9);
		
		/* 
		   for문을 이용한 구구단
		   for (int i = 1, i < 10, i++) {
				System.out.println(n * i);
		   } 
		*/
	}
	public static void main(String[] args) {
		GuGu gugu = new GuGu(); // GuGu 클래스의 객체 생성 
		gugu.dan(2); // 객체를 통해 dan 메소드 호출 (2단에 대한 구구단 출력)
		
		/* 
		   for문을 이용한 구구단 출력
		 
		   for(int i = 2, i < 10, i++) {
		 		gugu.dan(i);
		   } 
	    */
	}

}
