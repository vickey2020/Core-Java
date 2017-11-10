package com.deepak.innerClasses;

class Test1 {
	interface Yes1 {
		void show();
	}
}

class Testing1 implements Test1.Yes1 {
	public void show() {
		System.out.println("I am Implemented");
	}
}

public class DriverClass1 {
	public static void main(String[] args) {
		Test1.Yes1 obj = new Testing1();
		obj.show();
	}
}
