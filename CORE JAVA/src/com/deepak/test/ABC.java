package com.deepak.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ABC {
	public static void main(String[] args) {
		Set s=new HashSet();
		s.add(10);
		s.add(20);
		
		Object[] arr=s.toArray();
		System.out.println(Arrays.toString(arr));
	}

}
