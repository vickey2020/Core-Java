package com.deepak.logical;

public class StringIntern {
	public static void main(String[] args) {
		String s = "deepak";
		String s1 = new String("deepak");
		System.out.println("s :" + s.hashCode());
		System.out.println("s1 :" + s1.hashCode());

		System.out.println(s1.intern() == s.intern());
		System.out.println(s.equals(s1));
	}
}
