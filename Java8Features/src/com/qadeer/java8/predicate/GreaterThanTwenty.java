package com.qadeer.java8.predicate;

import java.util.function.Predicate;

public class GreaterThanTwenty {
	public static void main(String[] args) {
		Predicate<Integer> p = i->(i>20);
		
		System.out.println(p.test(12));
		System.out.println(p.test(25));
		System.out.println(p.test(30));
	}

}
