package com.deepak.oopsConcept;

public class DynamicPollymorphism {

	public static void main(String[] args) {
		A a = new A();
		a.main();
		a.mainOne();
		System.out.println("***********************");
		B b = new B();
		b.main();
		b.mainOne();
		b.mainTwo();
		System.out.println("****************************");
		A a1 = new B();
		a1.main();
		B b1 = (B) a1;
		b1.main();
	}
}
