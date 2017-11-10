package com.deepak.oopsConcept;

class Parent {
	public void property() {
		System.out.println("Parent class Property method");
	}

	public String marry() throws ArithmeticException {
		System.out.println("Parent class marry method"); // overridden method
		return "parent";
	}
}

class Child extends Parent { // overriding
	public String marry() throws RuntimeException {
		System.out.println("Child class marry method"); // overriding method
		return "child";
	}
}

class Test {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.marry();// (parent method)
		Child c = new Child();
		c.marry();// (child method)
		Parent p1 = new Child();
		p1.marry();// (child method)
	}
}
