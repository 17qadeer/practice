package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//converting array to list
public class Conversion {
	public static void main(String[] args) {

		String[] array = { "chicha", "chacha", "chcha" };

		System.out.println("Arary to list conversion : " + Arrays.toString(array));

		List<String> list = new ArrayList<>();

		for (String converting : array) {
			list.add(converting);
		}
		System.out.println("After Coverting : " + list);
		convertingListToArray();

	}
//LIST TO ARRAY!!!!!!!!!!!!
	public static void convertingListToArray() {
		List<String> fruitList = new ArrayList<>();
		fruitList.add("anar");
		fruitList.add("badaAnar");
		fruitList.add("ChotaAnar");

		// converting now!!!!

		String[] array = fruitList.toArray(new String[fruitList.size()]);
		System.out.println("printing array : " + Arrays.toString(array));
		System.out.println("printing list : " + fruitList);

	}
}
