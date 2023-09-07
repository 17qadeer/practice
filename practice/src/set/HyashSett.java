package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HyashSett {
	
	public static void main(String[] args) {
		HashSet<String> h = new HashSet<>();
		h.add("paolo");
		h.add("escobar");
		h.add("che guera");
		
		Iterator<String> it = h.iterator();
		while(it.hasNext()) {
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
		
		HashSet<String> h = new HashSet<String>(al);
		h.add("wwwwwwww");
		
		Iterator<String> it = h.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
 
		
	}

}
