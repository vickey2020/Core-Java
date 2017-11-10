package com.deepak.innerClasses;

interface Test2 {
	interface Yes2 {
		void show();
	}
}

class Testing2 implements Test2.Yes2 {
	public void show() {
		System.out.println("show method is implemented");
	}
}

public class DriverClass2 {
	public static void main(String[] args) {
		Test2.Yes2 obj = new Testing2();
		obj.show();
	}
}
