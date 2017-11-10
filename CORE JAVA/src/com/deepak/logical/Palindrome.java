package com.deepak.logical;

public class Palindrome {

	public static int isPalindrome(int num) {
		int temp = num, rem = 0, sum = 0;
		while (temp > 0) {
			rem = temp % 10;
			sum = sum * 10 + rem;
			temp = temp / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int num = 123454321;
		int n = isPalindrome(num);
		if (num == n) {
			System.out.println("Given number " + num + " is palindrome");

		} else
			System.out.println("Given number " + num + " is not palindrome");
	}
}
