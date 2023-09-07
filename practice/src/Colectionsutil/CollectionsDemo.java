package Colectionsutil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(23);
		l.add(24);
		l.add(50);

		System.out.println("before reversing: " + l);
		Collections.reverse(l);
		System.out.println("After reversing: " + l);
	}

}
