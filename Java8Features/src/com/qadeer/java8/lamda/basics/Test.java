package com.qadeer.java8.lamda.basics;

public class Test {

	public static void main(String[] args) {
		A a = ()->System.out.println("Inside myMethod from lambda expression");
		
		a.myMethod();
	}

}
