package abstraction;

public class A6 implements printable {

	@Override
	public void print() {
		System.out.println("The interface prinatble is overriden in here and A6 is printed");
	}

	public static void main(String[] args) {
		A6 b = new A6();
		b.print();
	}
}
