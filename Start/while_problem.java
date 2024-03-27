package java_study;

public class while_problem {

	public static void main(String[] args) {
		int treeHit = 0;
		while (treeHit < 10) {
			treeHit ++;
			System.out.println(String.format("나무가 %d번 찍혔습니다.", treeHit));
			// System.out.println("나무를 " + treeHit + "번 남았습니다."); 로도 할 수 있음.
			if (treeHit == 10)
			{
				System.out.println("나무가 넘어갔습니다.");
			}
		}

	}

}
