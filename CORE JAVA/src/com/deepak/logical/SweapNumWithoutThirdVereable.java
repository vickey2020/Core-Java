package com.deepak.logical;

public class SweapNumWithoutThirdVereable {

	public static void swap1(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a=" + a + "  & b=" + b);
	}

	public static void swap2(int x, int y) {
		x = x ^ y ^ (y = x);
		System.out.println("x=" + x + "  & y=" + y);
	}

	public static void main(String[] args) {
		int x = 10;
		int y = 20;

		swap1(x, y);
		swap2(x, y);
	}
}