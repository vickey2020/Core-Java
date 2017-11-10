package com.deepak.logical;

import java.util.Scanner;

public class Prime2 {

	public static void main(String[] args) {
		int n, t;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		n = Integer.parseInt(sc.next());
		t = n / 2;
		for (int i = 2; i <= t; i++) {
			if (n % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true && n != 0 && n != 1)
			System.out.println("Number " + n + " is prime");
		else
			System.out.println("Number " + n + " is not  prime");
		sc.close();
	}
}