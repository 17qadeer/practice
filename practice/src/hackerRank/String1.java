package hackerRank;

import java.util.Scanner;

public class String1 {

	public static void main(java.lang.String[] args) {
		System.out.println("enter 2 strings below !!");
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();

		String result = A.compareTo(B) > 0 ? "Yes" : "No";

		String aCap = A.substring(0, 1).toUpperCase() + A.substring(1);
		String bCap = B.substring(0, 1).toUpperCase() + B.substring(1);

		System.out.println(A.length() + B.length());
		System.out.println(result);
		System.out.printf("%s %s", aCap, bCap);
	}

}
//Sample Input 0
//hello
//java

//Sample Output 0
//9.... length
//No.... if a comes after than b in dictionary
//Hello Java.... first alphabets in block letters of both the letters

