package general_interview_Q;

public class fabionacci {
	
	static int n1 = 0, n2 = 1, n3 = 0;

	public void test() {

		int n1 = 0, n2 = 1, n3, i, count = 10;

		System.out.print(n1 + " " + n2);

		for (i = 2; i < count; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);

			n1 = n2;
			n2 = n3;
		}
	}

	public static void example2(int count) {

		if (count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			example2(count - 1);
		}
	}

	public static void main(String[] args) {
		int count = 10;
		System.out.print(n1 + " " + n2);
		example2(count-2);

		fabionacci fb = new fabionacci();
		fb.test();
	}
}
