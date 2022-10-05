package java_study;

import java.util.Scanner; // 사용자로부터 데이터를 입력받는 스캐너 클래스 

public class _0921_movie {

	
// 입력한 영화 정보 출력하기
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 스캐너 객체 생성 : 스캐너 클래스 호출 후 (위에 import한 문장) 함수 내부에 스캐너 객체를 생성하자
		                                     // Scanner 사용할 이름 = new Scanner(System.in);
		System.out.print("영화제목: ");
	    String title = sc.nextLine();
	    System.out.print("개봉년도: ");
	    int releaseYear = sc.nextInt();
	    System.out.print("상영시간: ");
	    double runTime = sc.nextFloat();
	    System.out.print("더빙판 존재 유무: ");
	    boolean dubbing = sc.nextBoolean();
	    System.out.print("언어: "); //왜 언어는 입력 안 받아...?
	    String language = sc.nextLine();
	    
	    System.out.println();
	    System.out.println();
	    System.out.println(title);
	    System.out.println(releaseYear);
	    System.out.println(runTime);
	    System.out.println(dubbing);
	    System.out.println(language);
	    

	}

}
