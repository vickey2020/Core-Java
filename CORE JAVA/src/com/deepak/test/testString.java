package com.deepak.test;

public class testString {
	public static void main(String[] args) {
		String s1 = "ja";
		String s2 = "va";
		String s3 = "java";
		String s4 = "ja" + "va";
		String s5 = s1 + "va";

		System.out.println(s3 == s4);
		System.out.println(s4 == s5);
		System.out.println(s3.equals(s4));
		System.out.println(s4.equals(s5));
	}

}
