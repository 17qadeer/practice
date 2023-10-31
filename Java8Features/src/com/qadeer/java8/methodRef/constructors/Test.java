package com.qadeer.java8.methodRef.constructors;

public class Test {

	public static void main(String[] args) {
		MyInterface f = s -> new MyClass(s);
		f.get("using lambdas");

		MyInterface f2 = MyClass::new;
		f2.get("Using contructor mapping");
	}

}
