package abstraction;

public class Honda extends vehicle {
	
	void run() {
		System.out.println("Vehcile is running safe");
	}
	
	public static void main(String[] args) {
		vehicle v = new Honda();
		v.run();
	}

}
