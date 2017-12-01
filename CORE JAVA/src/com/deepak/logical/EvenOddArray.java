package com.deepak.logical;

import java.util.Arrays;

public class EvenOddArray {

	public static int[] sortArray(int[] arr) {
		int last = arr.length - 1;
		int even[];
		int odd[];
		if (last % 2 == 0) {

			even = new int[last / 2 + 1];
			odd = new int[last / 2];
		} else {
			even = new int[last / 2 + 1];
			odd = new int[last / 2 + 1];
		}

		int t1 = 0;
		int t2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				even[t1] = arr[i];
				++t1;

			} else {
				odd[t2] = arr[i];
				++t2;
			}

		}
		t1 = 0;
		t2 = 0;
		Arrays.sort(even);
		Arrays.sort(odd);
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				arr[i] = even[t1];
				++t1;
			} else {
				arr[i] = odd[t2];
				++t2;
			}
		}

		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 100, 1, 2, 33, 44, 5, 56, 67, 8, 99, 10, 11, 112 };
		System.out.println(Arrays.toString(sortArray(arr)));
	}
}
