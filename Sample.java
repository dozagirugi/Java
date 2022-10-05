package java_study;

class Updater {
	void update(Counter counter) { // 객체 자체를 전달 받음 
		counter.count++;
	}
}

class Counter {
	int count = 0; // 객체변수 
}

public class Sample {
	public static void main(String[] args) {
		Counter myCounter = new Counter(); // Counter 객체 불러오기 
		System.out.println("before update: " + myCounter.count);
		Updater myUpdater = new Updater(); // Updater 객체 불러오기 
		myUpdater.update(myCounter);
		System.out.println("after update: "  + myCounter.count);
	}

}
