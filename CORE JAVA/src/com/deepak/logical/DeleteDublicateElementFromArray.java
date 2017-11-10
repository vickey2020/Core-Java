package com.deepak.logical;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DeleteDublicateElementFromArray {
	public static Set<Integer> uniqueNumberArray1(String arr) {
		String[] str = arr.split("\\,");
		Set<Integer> set = new LinkedHashSet(Arrays.asList(str));
		return set;
	}

	public static int[] uniqueNumberArray2(int[] input) {
		Arrays.sort(input);
		int index = 0;
		// return if the array length is less than 2
		if (input.length < 2) {
			return input;
		}
		for (int temp = 1; temp < input.length; temp++) {
			if (input[index] != input[temp]) {
				input[++index] = input[temp];
			}
		}
		int[] output = new int[index + 1];
		for (int k = 0; k < output.length; k++) {
			output[k] = input[k];
		}
		return output;

	}

	public static String uniqueCharacterString(String str) {
		char[] chr = str.toCharArray();
		Arrays.sort(chr);
		int index = 0;
		for (int temp = 1; temp < chr.length; temp++) {
			if (chr[index] != chr[temp]) {
				chr[++index] = chr[temp];
			}
		}

		char[] output = new char[index + 1];
		for (int i = 0; i < output.length; i++) {
			output[i] = chr[i];
		}
		return String.valueOf(output);
	}

	public static void main(String[] args) {
		String s = "10,1,3,6,6,6,9,7,6,6,5";
		System.out.println("Without dublicate numbers......using Collection api");
		System.out.println(uniqueNumberArray1(s));
		System.out.println("************************************************");
		int[] input = { 2, 12, 6, 6, 23, 23, 10, 10, 10, 12, 12 };
		System.out.println("Without dublicate numbers........... using logic");
		System.out.println(Arrays.toString(uniqueNumberArray2(input)));
		System.out.println("************************************************");
		String str = "abcsgdgdgagdjkshshks";
		System.out.println("Without dublicate character String......using Collection api");
		System.out.println(uniqueCharacterString(str));
	}
}