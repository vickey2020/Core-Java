package com.deepak.logical;

public class BinaryToDecimal {
	public static long conversionBinaryToDecimal(long binary) {
		long temp = binary, decimal = 0, rem = 0;
		int decPower = 1;
		while (temp > 0) {
			rem = temp % 10;
			decimal = decimal + decPower * rem;
			decPower = decPower * 2;
			temp = temp / 10;
		}
		return decimal;
	}

	public static void main(String[] args) {
		long binary = 111000010;
		System.out.println("Binary number " + binary + " == " + conversionBinaryToDecimal(binary)
		                    +" decimal equivalent");
	}
}
