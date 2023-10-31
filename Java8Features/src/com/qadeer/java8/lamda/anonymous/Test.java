package com.qadeer.java8.lamda.anonymous;

public class Test {

	public static void main(String[] args) {

		Thread t = new Thread(() -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println("Inside from the lambda func.");
			}
		});
		t.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("Inside main ");
		}
	}

}
