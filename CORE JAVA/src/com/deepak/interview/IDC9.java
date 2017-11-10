package com.deepak.interview;

class newthread extends Thread {
	Thread t;
	String name;

	newthread(String threadname) {
		this.name = threadname;
		t = new Thread(this, name);
		t.start();

	}

	public void run() {
		System.out.println("done");
	}
}

public class IDC9 {

	public static void main(String[] args) {
		newthread obj1 = new newthread("one");
		try {
			System.out.println("first");

			obj1.t.wait();
			System.out.print("obj1.t.isAlive()" + " Ok");

		} catch (Exception e) {
			System.out.println("Main thrad interrupted");
		}
	}
}
