package general_interview_Q;

public class Palindrome {

	static void check(String str) {
		String revstr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			revstr = revstr + str.charAt(i);
		}
		if (str.equalsIgnoreCase(revstr)) {
			System.out.println("Given string is palindrome");
		} else {
			System.out.println("Given string is not a Palindrome");
		}
	}

	public static void main(String[] args) {
		check("abb");
	}
}
