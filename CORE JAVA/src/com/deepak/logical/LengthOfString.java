package com.deepak.logical;

import java.util.Scanner;

public class LengthOfString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();
		int count = 0;
		for (char c : s.toCharArray()) {
			count++;
		}
		System.out.println("String length==" + count);
		sc.close();
	}
}
