package abstraction;

public class MultipleExample implements printable,showable {
	
	

	public static void main(String[] args) {
		
		MultipleExample me = new MultipleExample();
		me.print();
		me.show();

	}

	@Override
	public void show() {
		System.out.println("shown successfully ");
	}

	@Override
	public void print() {
		System.out.println("printed Successfully");
	}

}
