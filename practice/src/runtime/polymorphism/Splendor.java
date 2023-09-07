package runtime.polymorphism;

public class Splendor extends Bike {

	void run() {
		System.out.println("Splendor is running at 70km/hr");
	}

	public static void main(String[] args) {
		Bike s = new Splendor();
		s.run();
	}

}
