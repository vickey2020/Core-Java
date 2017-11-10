package com.deepak.interview;

import java.util.Arrays;

public class IDC8 {
	public static void main(String[] args) {
		int[] a = new int[10];
		System.out.println(a);

		int[] b = new int[20];
		System.out.println(b);

		a = b; // Compiler checks only type, not the size
		System.out.println(a);
		System.out.println(Arrays.toString(a));
	}
}
