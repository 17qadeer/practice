package Colectionsutil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedList {
	public static void main(String[] args) {

		List<String> l = new ArrayList<>();
		l.add("z");
		l.add("a");
		l.add("x");
		l.add("b");

		System.out.println("collections before sorting: " + l);

//		Collections.sort(l, new MyComparator());
		Collections.sort(l);

		System.out.println("after sorting: " + l);

		int binarySearch = Collections.binarySearch(l, "x");
		System.out.println("Index is: " + binarySearch);

	}

}
