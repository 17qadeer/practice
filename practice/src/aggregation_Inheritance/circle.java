package aggregation_Inheritance;

public class circle {
	operation op;
	double pi = 3.145;

	double area(int radius) {
		op = new operation();
		double rsquare = op.square(radius);

		return pi * rsquare;

	}

	public static void main(String[] args) {
		circle c = new circle();
		System.out.println(c.area(5));
	}

}
