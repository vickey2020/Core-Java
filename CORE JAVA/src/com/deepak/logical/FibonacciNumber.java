package com.deepak.logical;

import java.util.Arrays;

public class FibonacciNumber {

	public static int[] fibonacciSeries(int initial, int length) {
		int len = length - initial + 1;
		int[] arr = new int[len];
		arr[0] = initial;
		arr[1] = ++initial;
		int n1 = arr[0];
		int n2 = arr[1];
		for (int i = 2; i < len; i++) {
			int n = n1 + n2;
			arr[i] = n;
			n1 = n2;
			n2 = n;
		}
		return arr;
	}

	public static void main(String[] args) {
		int initial = 5;
		int length = 20;
		System.out.println(Arrays.toString(fibonacciSeries(initial, length)));
	}
}
