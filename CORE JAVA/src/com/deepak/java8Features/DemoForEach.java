package com.deepak.java8Features;

import java.util.Arrays;
import java.util.List;

public class DemoForEach {
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(4, 8, 9, 4, 3);
		/*
		 * for(int i=0;i<values.size();i++) { System.out.println(values.get(i));
		 * } //This is external for each loop for(int i:values) {
		 * System.out.println(i); }
		 */
		// This is internal for each loop
		values.forEach(i -> System.out.println(i));// Lambda Expression
	}
}
