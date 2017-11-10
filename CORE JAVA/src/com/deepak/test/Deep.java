package com.deepak.test;

public class Deep {
	public static void main(String[] args) {
		Deep deep = new Deep();
		deep.call();
		System.gc();
	}

	protected void finalize() {
		System.out.println("finalize");
	}

	private void call() {
		for (int i = 0; i < 10; i++) {
			Deep d = new Deep();
			d=null;
		}
	}
}
