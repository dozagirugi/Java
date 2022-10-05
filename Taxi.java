package java_study;

public class Taxi {

	public static void main(String[] args) {
		int money = 3000;
		boolean hasCard = true;

//1
		
		if (money >= 7000) // if문은 괄호 쓰기!
				{
			System.out.println("택시를 타고 가라.");
				}
		else
				{
			System.out.println("그냥 걸어가라.");
				}

//2 and 포함해서 if문 사용하기
		
		if (money >= 7000 || hasCard)
				{
			System.out.println("택시를 타고 가라.");
				}
		else
				{
			System.out.println("그냥 걸어가라.");
				}

	}

}
