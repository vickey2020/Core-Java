package com.deepak.logical;

public class StringLogic {

	public static String logic(String str) {
		String result = "";
		String[] str1 = str.split(" ");
		for (int i = 0; i < str1.length; i++) {
			result = helper(i, str1, result);
		}
		return result;
	}

	private static String helper(int index, String[] str1, String result) {
		String temp = "";
		for (int j = index; j >= 0; j--) {
			temp = temp + " ";

		}

		return result + str1[index] + temp;
	}

	public static void main(String[] args) {
		String str = "My name is Ankit Singh";
		System.out.println(logic(str).toString());
	}
}
