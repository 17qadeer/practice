package com.qadeer.java8.methodRef;

public class MyClass {

	public void myMetho1d(int i) {
		System.out.println(i);
	}

	public static void main(String[] args) {
		MyInterface f = i -> System.out.println(i);
		f.myMethod(10);

		MyClass c = new MyClass();
		MyInterface f1 = c::myMetho1d;
		f1.myMethod(20);
	}

}
