package list;

import java.util.*;

public class ArrrayList {

	public static void main(String args[]) {

		LinkedList<Integer> listis = new LinkedList<>();

		listis.add(654646);
		listis.add(6556);
		listis.add(657);


		Iterator<Integer> itr = listis.descendingIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
