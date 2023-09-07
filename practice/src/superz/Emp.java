package superz;

// using the constructor of parent class

public class Emp extends person {
	float salary;

	Emp(int id, String name, float salary) {
		super(id, name);
		this.salary = salary;
	}

	void display() {
		System.out.println(id + " " + name + " " + salary);
	}

	public static void main(String[] args) {
		Emp e = new Emp(22, "dada", 45000f);
		e.display();
	}
}
