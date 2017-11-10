package com.deepak.logical;

import java.util.Scanner;

public class SearchNumberInArray {

	public static void main(String[] args) {
		int[] array = { 21, 4, 6, 2, 6, 36, 4263, 3, 3, 6, 37, 377, 373, 0 };
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number whenever you want to search....");
		int n = sc.nextInt();
		for (int i = 0; i < array.length; i++) {
			if (array[i] == n) {
				flag = true;
				System.out.print("Your searching number " + n + " is available in array");
				break;
			}
		}
		if (flag == false) {

			System.out.println("Given number " + n + " is not in array");
		}

		sc.close();
	}
}