package com.deepak.interview;

public class IDC2 {

	int m1(Long n, Long m) {
		return 1;
	}

	int m1(Long... n) {
		return 2;
	}

	int m1(Integer n, Integer m) {
		return 3;
	}

	int m1(Number n, Number m) {
		return 4;
	}

	void m2() {
		short s = 7;
		System.out.println(m1(s, s));
	}

	public static void main(String[] args) {
		IDC2 i = new IDC2();
		i.m2();
	}

}
