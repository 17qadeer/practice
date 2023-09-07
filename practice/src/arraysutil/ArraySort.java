package arraysutil;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 8, 3, 1077, 44, 87 };

		System.out.println("BEFORE sort");

		for (int eachElement : a) {
			System.out.println(eachElement);
		}

		Arrays.sort(a);
		System.out.println("AFTER sort");

		for (int eachElement : a) {
			System.out.println(eachElement);
		}
		String[] s = { "V", "A", "D", "B" };

//		Arrays.sort(s);
		Arrays.sort(s, new MyComparator());
		System.out.println("AFTER sorting String array");

		for (String eachElement : s) {
			System.out.println(eachElement);
		}

		int binarySearch = Arrays.binarySearch(s, "D");
		System.out.println("index of D is: " + binarySearch);

		List<String> asList = Arrays.asList(s);
		System.out.println("after converting to list: " + asList);

	}

}
