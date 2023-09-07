package map;

import java.util.HashMap;
import java.util.Map;

public class Myap {

	public static void main(String[] args) {
//		LinkedHashMap<Integer, String> m = new LinkedHashMap<>();
		HashMap<Integer, String> m = new HashMap<>();

		m.put(1, "usain");
		m.put(2, "MOFarah");
		m.put(6, "adil");
		m.put(4, "adil");
		m.put(8, "adil");
		m.put(9, "adil");
		m.put(3, "adil");
		m.put(5, "adil");

		for (Map.Entry<Integer, String> entry : m.entrySet()) {

			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println(m);
	}
}
