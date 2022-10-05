package java_study;

import java.util.ArrayList;

public class Taxi_plus {

	public static void main(String[] args) {
		ArrayList pocket = new ArrayList();
		pocket.add("paper");
		pocket.add("card");
		
	if (pocket.contains("money"))
			{
		System.out.println("택시를 타고 가라.");
			}
	else if(pocket.contains("card")) // 이전 문장이 거짓일 때만 수행된다. 
		{
			System.out.println("택시를 타고 가라.");
		}
		else
		{
			System.out.println("그냥 걸어가라.");
		}

	}

}
