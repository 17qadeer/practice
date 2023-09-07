package udemy;

public class ArrayExercise {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 56, 78, 9 };

		String[] courses = { "Java Web Services", "Spring Data REST", "Hibernate", "Spring in easy steps" };

		for (int i = courses.length - 1; i >= 0; i--) {
			System.out.println(courses[i]);
		}

		for (int element : a) {
			System.out.println(element);
		}
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i]);
		}
	}

}
