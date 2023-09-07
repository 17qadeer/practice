package general_interview_Q;

import java.util.Arrays;
import java.util.Scanner;

public class Anagramzz {

	static boolean isAnagram(String a, String b) {
		
		if (a == null | b == null | a.length() != b.length()) {
			return false;
		}
		if (a != null && b != null && a.length() == b.length()) {
			char[] A = a.toLowerCase().toCharArray();
			char[] B = b.toLowerCase().toCharArray();
			Arrays.sort(A);
			Arrays.sort(B);
			if (A.equals(B)) {
				return true;
			} 
		}
		return true;
	}

	public static void main(String[] args) {

		System.out.println("Pull two Strings");
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}
