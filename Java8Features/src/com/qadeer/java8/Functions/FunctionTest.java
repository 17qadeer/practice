package com.qadeer.java8.Functions;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply("qadeer"));
		System.out.println(f.apply("coby"));
	}

}
