package com.deepak.logical;

public class CharPestAtEndOfArray {
	public static String str1 = "";
	public static String str2 = "";
	public static String str3 = "";

	public static String modifyString1(String s, int n) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(n) != s.charAt(i))
				str1 = str1 + s.charAt(i);
		}
		return str1 + s.charAt(n);
	}

	public static String modifyString2(String s, char c) {

		String str21 = "";
		String str22 = "";
		for (int i = 0; i < s.length(); i++) {
			if (c != s.charAt(i))
				str21 = str21 + s.charAt(i);
			else
				str22 = str22 + c;
		}
		str2 = str21 + str22;
		return str2;
	}

	public static String modifyString3(String s, char c) {
		boolean flag = false;
		for (int i = 0; i < s.length(); i++) {
			if (flag == true || c != s.charAt(i))
				str3 = str3 + s.charAt(i);
			else
				flag = true;
		}
		return str3 + c;
	}

	public static void main(String[] args) {
		System.out.println("char pest at end of string by given index");
		String s1 = modifyString1("ramchandrasitamata", 3);
		System.out.println(s1);
		System.out.println("************************************************");
		System.out.println("char pest at end of string by given character to add at end of strng");
		String s2 = modifyString2("ramchandrasitamata", 'a');
		System.out.println(s2);

		System.out.println("************************************************");
		System.out.println("char pest at end of string by given character ");
		String s3 = modifyString3("ramchandrasitamata", 'a');
		System.out.println(s3);
	}
}
