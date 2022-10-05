package java_study;

public class Nickname {
	void printNick(String nick) { // printNick 이라는 메소드 
		if("fool".equals(nick)) { 
			return; // 특별한 경우에 메소드를 빠져나가기 원할 때 return을 단독으로 사용하면 빠져나갈 수 있다. (= nick이 fool이라면 빠져나와라.)
		}
		System.out.println("나의 별명은 "+nick+"입니다.");
	}

	public static void main(String[] args) {
		Nickname sample = new Nickname();
		sample.printNick("dozagirugi"); // 8번 줄에 의하여 출력함.
		sample.printNick("fool"); // 5,6번 줄에 의하여 출력 안함.

	}

}
