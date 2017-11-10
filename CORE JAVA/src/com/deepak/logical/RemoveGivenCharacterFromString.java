package com.deepak.logical;

public class RemoveGivenCharacterFromString {
	private static String removeChar(String str, char c) {
		if (str == null)
			return null;
		return str.replaceAll(Character.toString(c), "l");

	}

	public static void main(String[] args) {

		String str1 = "deepakkumarmishra";
		char c = 'd';
		System.out.println("Remove Given Character From String or Replace char with other char");
		System.out.println(removeChar(str1, c));

	}
}
