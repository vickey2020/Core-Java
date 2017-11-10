package com.deepak.logical;

import java.util.HashSet;
import java.util.Set;

public class PermutationOfString {
	public static Set<String> permutationFinder(String str) {
		Set<String> perm = new HashSet<>();
		// Handling error scenarios
		if (str == null) {
			return null;
		} else if (str.length() == 0) {
			perm.add("");
			return perm;
		}
		char initial = str.charAt(0); // first character
		System.out.println("initial " + initial);
		String rem = str.substring(1);// Full string without first character
		System.out.println("rem " + rem);
		Set<String> words = permutationFinder(rem);
		System.out.println("words " + words);
		for (String strNew : words) {
			System.out.println("strNew " + strNew);
			for (int i = 0; i <= strNew.length(); i++) {
				perm.add(charInsert(strNew, initial, i));

			}
		}
		return perm;
	}

	public static String charInsert(String str, char c, int i) {
		String begin = str.substring(0, i);
		String end = str.substring(i);
		System.out.println(i + " :" + begin + " || " + end);

		return begin + c + end;
	}

	public static void main(String[] args) {
		// String s = "AAC";
		String s1 = "ABC";
		// String s2 = "ABCD";
		// System.out.println("\nPermutations for " + s + " are: \n" +
		// permutationFinder(s));
		System.out.println("\nPermutations for " + s1 + " are: \n" + permutationFinder(s1));
		// System.out.println("\nPermutations for " + s2 + " are: \n" +
		// permutationFinder(s2));
	}
}
