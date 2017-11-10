package com.deepak.interview;

import java.util.HashSet;

public class IDC16 {

public static void main(String[] args) {
	String s1 = "abc";
	String s2 = "abc";
	System.out.println("s1 == s2 is:" + s1 == s2);
	
	System.out.println("********************************************");
	
	String s3 = "JournalDev";
	int start = 1;
	char end = '5';
	System.out.println( end + start);
	System.out.println(s3.substring(start, end));
	
	System.out.println("**************************************************");
	
	HashSet shortSet = new HashSet();
	for (short i = 0; i < 100; i++) {
		shortSet.add(i);
		shortSet.remove(i - 1);
	}
	System.out.println(shortSet.size());
	
	System.out.println("***************************************************");
	
	String str = null;
	String str1="abc";
	System.out.println(str1.equals("abc") | str.equals(null));
}
}

