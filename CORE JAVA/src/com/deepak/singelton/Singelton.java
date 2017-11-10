package com.deepak.singelton;

public class Singelton {
	private static Singelton singleInstance;

	private Singelton() {
	}

	public static Singelton getSingleInstance() {
		if (singleInstance == null) {
			synchronized (Singelton.class) {
				if (singleInstance == null) {
					singleInstance = new Singelton();
				}
			}
		}
		return singleInstance;
	}

	public void fun() {
		System.out.println("fun  " + singleInstance);
		System.out.println("Deepak");
	}

	public void foo() {
		System.out.println("foo  " + singleInstance);
		System.out.println("Mishra");

	}

	public static void main(String[] args) {
		// Singelton1 singleInstance=new Singelton1();
		// System.out.println(singleInstance);
		getSingleInstance().fun();
		getSingleInstance().foo();
		// singleInstance.fun();
		// singleInstance.foo();
	}
}