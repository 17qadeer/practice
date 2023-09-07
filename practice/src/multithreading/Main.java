package multithreading;

public class Main {
	public static void main(String[] args) throws InterruptedException {
//		EvenNumber even = new EvenNumber();
//		OddNumber odd = new OddNumber();
//		TestThread tt = new TestThread();

		Thread even = new Thread(new EvenNumber());
		Thread odd = new Thread(new OddNumber());
		Thread tt = new Thread(new TestThread());
		even.start();
		Thread.sleep(1);
		odd.start();
		Thread.sleep(1);
		tt.start();
	}

}
