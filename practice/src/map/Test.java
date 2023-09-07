package map;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		HashMap<Integer, Bookzz> hm = new HashMap<>();

		Bookzz b1 = new Bookzz(101, "fire", "APJ", "namrnadaHouse", 555);
		Bookzz b2 = new Bookzz(201, "ice", "Martin", "AppalaHouse", 300);
		Bookzz b3 = new Bookzz(301, "Skry", "nolan", "mirindaHouse", 450);

		hm.put(1, b1);
		hm.put(2, b2);
		hm.put(3, b3);

		for (Map.Entry<Integer, Bookzz> entry : hm.entrySet()) {

			Bookzz b = entry.getValue();
			System.out.println(entry.getKey() + " Details:");

			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);

		}
	}

}
