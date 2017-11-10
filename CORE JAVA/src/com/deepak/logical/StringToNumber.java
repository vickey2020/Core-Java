package com.deepak.logical;

public class StringToNumber {
	/*
	 * convert string format of a number to number without calling
	 * Integer.parseInt() method
	 */

	public static int stringToNumber(String str) {
		int num = 0;
		int ascii = (int) '0';
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			num = num * 10 + ((int) ch[i] - ascii);
		}
		return num;

	}

	public static void main(String[] args) {
		String str = "1054173";
		System.out.println(stringToNumber(str));
	}
}
