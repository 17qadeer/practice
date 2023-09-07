package encapsulation;

public class TestAccount {
	public static void main(String[] args) {
		Account a = new Account();

		a.setAcc_no(455545544);
		a.setName("ChanduLaal");
		a.setEmail("chandulaal@gmail.com");
		a.setAmount(546);

		System.out.println(a.getAcc_no() + " \n" + a.getName() + " \n" + a.getEmail() + "\n" + a.getAmount());
	}

}
