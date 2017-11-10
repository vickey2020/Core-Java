package com.deepak.logical;

public class ReverseString {

	/* 1:- By getBytes() method of String Class */
	public static void reverseString1(String s) {
		byte[] b = s.getBytes();
		for (int i = 0, j = b.length - 1; i < j; i++, j--) {
			byte temp;
			temp = b[i];
			b[i] = b[j];
			b[j] = temp;

		}
		System.out.println(new String(b));
	}

	/* 2:- By reverse() method of StringBuffer Class */
	public static void reverseString2(String s) {
		StringBuffer input = new StringBuffer(s);
		input = input.reverse();
		System.out.println(input);
	}

	/* 3:- Best logic */
	public static String reverseString3(String str) {
		char[] c = str.toCharArray();
		for (int i = 0; i < c.length / 2; i++) {
			char temp = c[i];
			c[i] = c[c.length - 1 - i];
			c[c.length - 1 - i] = temp;
		}
		return String.valueOf(c);
	}

	public static void main(String[] args) {
		String s = "deepak mishra";
		System.out.println("1:- By getBytes() method of String Class");
		reverseString1(s);
		System.out.println("****************************************");
		System.out.println("2:- By reverse() method of StringBuffer Class");
		reverseString2(s);
		System.out.println("********************************");
		System.out.println("3:- Reverse String By best logic");
		System.out.println(reverseString3(s));

	}
}
