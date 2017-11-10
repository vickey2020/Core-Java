package com.deepak.logical;

class Test1 {
	int num, model;

	Test1(int num, int model) {
		this.num = num;
		this.model = model;
	}
}

// A class that uses Car objects
public class SwapObject {
	// To swap c1 and c2
	public static void swap(Test1 t1, Test1 t2) {
		Test1 temp = t1;
		t1 = t2;
		t2 = temp;
	}

	// Driver method
	public static void main(String[] args) {
		Test1 t1 = new Test1(1, 101);
		Test1 t2 = new Test1(2, 202);
		swap(t1, t2);
		System.out.println("t1 : " + t1.num + " , " + t1.model);
		System.out.println("t2 : " + t2.num + " , " + t2.model);
	}
}
