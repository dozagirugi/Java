package java_study;

public class for_congratulation {

	public static void main(String[] args) {
		int[] score = {45, 70, 90, 35, 80};
		
		for (int i=0; i<score.length; i++) {
			if (score[i] < 60) {
				continue;
			}
			else {
				System.out.println((i+1) + "번 학생은 합격입니다. 축하합니다.");
			}
		}
		

	}

}
