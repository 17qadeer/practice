package com.qadeer.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UpperToLowerCase {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		l1.add("JOHN");
		l1.add("QADEER");
		l1.add("JIM");
		
		System.out.println(l1);
		
		List<String> c1 = l1.stream().map(s->s.toLowerCase()).collect(Collectors.toList());
		
		System.out.println(c1);
	}

}
