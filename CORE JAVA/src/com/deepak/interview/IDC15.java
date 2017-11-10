package com.deepak.interview;

public class IDC15 {
	public static void main(String[] args) {

		String s1 = "abcd";
		String s2 = new String("abcd");
		System.out.println(s1 == s2);

		// s2.intern().equals(s1);s2.intern().equals(s1);
		System.out.println(s2.equals(s1));
		System.out.println(s1 == s2.intern());

	}
}