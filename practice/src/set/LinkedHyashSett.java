package set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHyashSett {

	public static void main(String[] args) {
		LinkedHashSet<String> h = new LinkedHashSet<>();
		h.add("paolo");
		h.add("escobar");
		h.add("che guera");

		Iterator<String> it = h.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		adding();
	}

	/// HashSet from another collection!!!!!!

	public static void adding() {
		ArrayList<String> al = new ArrayList<>();

		al.add("jjjjjjjjj");
		al.add("lllllllll");
		al.add("ppppppppp");

		LinkedHashSet<String> h = new LinkedHashSet<String>(al);
		h.add("wwwwwwww");
		Iterator<String> it = h.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
