package com.deepak.logical;

import java.util.Scanner;

public class Prime1 {
	public static void main(String[] args) {
		int n, temp, j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		n = sc.nextInt();
		temp = n;
		if (n <= 2) {
			System.out.println("There are not exit any prime number less than given number " + n);
		}

		else {
			System.out.println("Prime numbers less than " + n + " are....");

			for (int i = 2; i < temp; i++) {
				boolean flag = false;
				for (j = 2; j <= i / 2; j++) {
					if (i % j == 0) {
						flag = true;
						break;
					}
				}
				if (flag == false) {
					System.out.print(i + ", ");
				}
			}
		}
		sc.close();
	}
}
