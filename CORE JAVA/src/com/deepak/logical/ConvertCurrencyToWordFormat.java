package com.deepak.logical;

import java.util.Scanner;

public class ConvertCurrencyToWordFormat {
	public static void numberToWordFirst(int c) {
		numberToWordSecond(((c / 1000000000) % 100), " arab");
		numberToWordSecond(((c / 10000000) % 100), " crore");
		numberToWordSecond(((c / 100000) % 100), " lac");
		numberToWordSecond(((c / 1000) % 100), " thoushand");
		numberToWordSecond(((c / 100) % 10), " hundred");
		numberToWordSecond((c % 100), " ");
	}

	private static void numberToWordSecond(int n, String str) {
		String[] one = { " ", " one", " two", " three", " four", " five", " six", " seven", " eight", 
				" nine", " ten"," eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen",
				" seventeen", " eighteen"," nineteen" };
		String[] ten = { " ", " ", " twenty", " thirty", " fourty", " fifty", " sixty", " sventy", 
				" eighty"," ninety" };
		if (n > 19) {
			System.out.print(ten[n / 10] + " " + one[n % 10]);
		} else
			System.out.print(one[n]);
		if (n > 0) {
			System.out.print(str);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter currency");
		int currency = sc.nextInt();
		numberToWordFirst(currency);
		sc.close();
	}
}
