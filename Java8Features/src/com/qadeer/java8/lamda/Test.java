package com.qadeer.java8.lamda;

public class Test {

	public static void main(String[] args) {
		Sum s = (int x, int y) -> System.out.println("Sum of the integers : " + (x + y));

		s.add(25, 26);
	}

}
