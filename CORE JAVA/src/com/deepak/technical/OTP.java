package com.deepak.technical;

import java.util.Random;

public class OTP {
	static char[] otp(int len) {
		System.out.println("Generating OTP using random() : ");
		System.out.print("You OTP is : ");

		// Using numeric values
		String numbers = "0123456789";

		// Using random method
		Random rndm = new Random();

		char[] otp = new char[len];

		for (int i = 0; i < len; i++) {
			// Use of charAt() method : to get character value
			// Use of nextInt() as it is scanning the value as int
			otp[i] = numbers.charAt(rndm.nextInt(numbers.length()));
		}
		return otp;
	}

	public static void main(String[] args) {
		int length = 6;
		System.out.println(otp(length));
	}
}
