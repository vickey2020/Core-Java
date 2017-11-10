package com.deepak.logical;

public class CheckStringIsPalindrome {
	private static boolean isPalindrome1(String str) {
		char[] chr = str.toCharArray();
		for (int i = 0; i < chr.length / 2; i++) {
			char c = chr[i];
			chr[i] = chr[chr.length - 1 - i];
			chr[chr.length - 1 - i] = c;
		}
		return str.equals(String.valueOf(chr));

	}

	private static boolean isPalindrome2(String str) {
		if (str == null)
			return false;
		StringBuilder strBuilder = new StringBuilder(str);
		strBuilder.reverse();
		return strBuilder.toString().equals(str);
	}

	public static void main(String[] args) {
		String s = "abcdcdcba";

		System.out.println("1st way Check String is palindrome by logic");

		if (isPalindrome1(s))

			System.out.println("Entered string is palindrome");

		else
			System.out.println("Entered string is not a palindrome");

		System.out.println("**************************************************");

		System.out.println("2nd way Check String is palindrome by predefine methods");
		if (isPalindrome2(s) == true)

			System.out.println("Entered string is palindrome");

		else
			System.out.println("Entered string is not a palindrome");

	}

}
