package com.deepak.logical;

public class DecimalToBinary {
	public static long conversionDecimalToBinary(int decimal) {
		String str = "";
		int rem = 0;
		int temp = decimal;
		while (temp > 0) {
			rem = temp % 2;
			str = rem + str;
			temp = temp / 2;
		}
		return Long.parseLong(str);
	}

	public static void main(String[] args) {
		int decimal = 450;
		System.out.println("Decimal " + decimal + " == " + conversionDecimalToBinary(decimal)
		                    + " equivalent Binary");
	}
}
