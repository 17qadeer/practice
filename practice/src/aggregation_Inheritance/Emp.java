package aggregation_Inheritance;

public class Emp {

	int id;
	String name;
	Address add;

	Emp(int id, String name, Address add) {
		this.id = id;
		this.name = name;
		this.add = add;
	}

	void display() {
		System.out.println(id + " " + name);
		System.out.println(add.city + " " + add.state + " " + add.country);
	}

	public static void main(String[] args) {

		Address address1 = new Address("gulbarga", "karnataka", "India");
		Address address2 = new Address("hyderabad", "Telangana", "India");

		Emp e1 = new Emp(1, "saddaam", address1);
		Emp e2 = new Emp(2, "yaqoob", address2);
		
		e1.display();
		e2.display();

	}

}
