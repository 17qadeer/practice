package com.qadeer.java8.lamda.interfaces;

public class MyRunnableImpl implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("Inside child class");
		}
	}

}
