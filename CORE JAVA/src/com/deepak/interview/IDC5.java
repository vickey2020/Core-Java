package com.deepak.interview;

public class IDC5 extends Thread {
	int code = 9;

	public void run() {
		this.code = 7;
	}

	public static void main(String[] args) {
		IDC5 t = new IDC5();
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println(t.code);
		}
	}
}
