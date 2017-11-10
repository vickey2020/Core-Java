package com.deepak.logical;

import java.util.Arrays;

public class Array2D {

	public static void main(String[] args) {
		int[][] a = new int[3][4];
		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;
		a[0][3] = 40;
		a[1][0] = 50;
		a[1][1] = 60;
		a[1][2] = 70;
		a[1][3] = 80;
		a[2][0] = 90;
		a[2][1] = 15;
		a[2][2] = 10;
		a[2][3] = 10;

		int[][] arr1 = { { 9, 5, 6 }, { 3, 5, 3 }, { 3, 4, 5 } };

		System.out.println("Array i matrix form");
		System.out.println("By for loop");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print("\t" + arr1[i][j]);
			}
			System.out.println();
		}
		System.out.println("************************************************");
		System.out.println("By for each loop");
		/*
		 * In array if we use the concept of 'for each loop' in given 1st loop a
		 * gives a row of matrix to arr[] then come to the 2nd loop , in 2nd
		 * loop a gives one value to arr at a time.
		 */
		for (int ar[] : a) {
			for (int arr : ar) {
				System.out.print("\t" + arr);
			}
			System.out.println();
		}

		System.out.println("*****************************************************");
		System.out.println(Arrays.deepToString(arr1));

	}
}