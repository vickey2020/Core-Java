package com.deepak.collectionUtilityClasses;

import java.util.Arrays;

public class ArraysImportantMethod {
	public static void main(String[] args) {
		// initializing an array original
		int[] org = new int[] { 1, 2, 3 };

		System.out.println("Original Array");
		for (int i = 0; i < org.length; i++)
			System.out.print(org[i] + " ");

		// copying array org to copy
		int[] copy = Arrays.copyOf(org, 5);

		// Changing some elements of copy
		copy[3] = 11;
		copy[4] = 55;

		System.out.println("\nNew array copy after modifications:");
		for (int i = 0; i < copy.length; i++)
			System.out.print(copy[i] + " ");
		System.out.println();
		System.out.println("****************************************");
		int[] a1 = { 1, 3, 2, 4, 5, 6, 7, 3 };
		Arrays.fill(a1, 2, 5, 19);
		System.out.println(Arrays.toString(a1));

	}
}
