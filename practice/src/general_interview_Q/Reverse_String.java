package general_interview_Q;

// Simple program to reverse an array and an String

public class Reverse_String {
	public static void main(String[] args) {

		String s = "Sachin_is_the_goat";

		String reversedstr = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			reversedstr = reversedstr + s.charAt(i);

		}
		System.out.println("The reversed String is :" + reversedstr);

		ArrayReverse();
	}

	static void ArrayReverse() {
		int a[] = { 1, 2, 4, 5, 6 };

		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
	}
}
