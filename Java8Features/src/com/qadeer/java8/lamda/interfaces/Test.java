package com.qadeer.java8.lamda.interfaces;

public class Test {

	public static void main(String[] args) {
//		Runnable r = new MyRunnableImpl();
//		Thread t = new Thread(r);
//		t.start();

		Runnable r = () -> { // by using lamda here we don't need to create a class just for
								// implementation!!!!

			for (int i = 0; i <= 10; i++) {// for using multiple lines in the lamda we have to use"{}" and ';' at the
											// end!!!
				System.out.println("Inside child class ");
			}
		};
		Thread t = new Thread(r);
		t.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("Inside main ");
		}
	}

}
