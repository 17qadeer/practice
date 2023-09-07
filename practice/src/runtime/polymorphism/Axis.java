package runtime.polymorphism;

public class Axis extends Bank {
	float getTheRateOfInterest() {
		return 8455.3f;

	}

	public static void main(String[] args) {
		Bank b;

		b = new SBI();
		System.out.println("SBI interest is " + b.getTheRateOfInterest());

		b = new Canara();
		System.out.println("Canara interest is " + b.getTheRateOfInterest());

		b = new Axis();
		System.out.println("Axis interest is " + b.getTheRateOfInterest());
	}
}
