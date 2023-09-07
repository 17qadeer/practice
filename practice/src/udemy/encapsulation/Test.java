package udemy.encapsulation;

public class Test {

	public static void main(String[] args) {
		Patient p = new Patient();
		
		p.setId(123);
		p.setName("Bharath");
		p.setSsn("1234567890");
		
		System.out.println("Id: " + p.getId() + "\n"+ "Name: " + p.getName()+ "\n"+ "SSN: "+ p.getSsn());
	}

}
