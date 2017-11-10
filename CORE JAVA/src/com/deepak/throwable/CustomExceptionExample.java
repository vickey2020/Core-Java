package com.deepak.throwable;

import java.util.Scanner;

class TooYoungException extends RuntimeException {
	public TooYoungException(String str) {
		super(str);
	}
}

class TooOldException extends RuntimeException {
	public TooOldException(String str) {
		super(str);
	}
}

public class CustomExceptionExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter age");
		int age = sc.nextInt();
		if (age > 60) {
			throw new TooOldException("You are over age");
		} else if (age < 18)
			throw new TooYoungException("You are under age");
		else
			System.out.println("You are eligible for marrieage");

	}
}
