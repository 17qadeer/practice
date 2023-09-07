package set;

import java.util.HashSet;

public class TestBook {

	public static void main(String[] args) {
		HashSet<Book> hs = new HashSet<Book>();
		Book b1 = new Book(1, "fire", "APJ", "namrnadaHouse", 555);
		Book b2 = new Book(2, "ice", "Martin", "AppalaHouse", 300);
		Book b3 = new Book(3, "Skry", "nolan", "mirindaHouse", 450);

		hs.add(b1);
		hs.add(b2);
		hs.add(b3);

		for (Book book : hs) {

			System.out.println(
					book.id + " " + book.name + " " + book.author + " " + book.publisher + " " + book.quantity);

		}
	}

}
