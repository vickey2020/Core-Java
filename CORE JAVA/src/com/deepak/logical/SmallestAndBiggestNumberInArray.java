package com.deepak.logical;

import java.util.Scanner;

public class SmallestAndBiggestNumberInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Array of Integer");
		String s = sc.nextLine();
		String[] s1 = s.split(" ");
		int largest = Integer.parseInt(s1[0]);
		int smallest = Integer.parseInt(s1[0]);

		int n, secondLargest = 0, secondSmallest = 0;
		for (int i = 1; i < s1.length; i++) {
			n = Integer.parseInt(s1[i]);
			if (largest < n) {
				secondLargest = largest;
				largest = n;
			} else if (smallest > n) {
				secondSmallest = smallest;
				smallest = n;
			}
		}
		System.out.println("largest Number of n size array is " + largest);
		System.out.println("Second largest Number of n size array is " + secondLargest);
		System.out.println("smallest Number of n size array is " + smallest);
		System.out.println("Second smallest Number of n size array is " + secondSmallest);

		sc.close();
	}
}