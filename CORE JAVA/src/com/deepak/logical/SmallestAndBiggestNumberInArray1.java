package com.deepak.logical;

import java.util.Arrays;

public class SmallestAndBiggestNumberInArray1 {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 6, 9, 9, 3, 4, 77, 11, 3, 0, 1 };
		Arrays.sort(arr);
		System.out.println("Smallest Number In Array : " + arr[0]);
		System.out.println("Biggest Number In Array : " + arr[arr.length - 1]);

	}
}
