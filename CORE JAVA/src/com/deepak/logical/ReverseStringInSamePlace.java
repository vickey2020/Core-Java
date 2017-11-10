package com.deepak.logical;

public class ReverseStringInSamePlace {
	public static String reverse(String str) {
		String[] st = str.split(" ");

		String ss = "";
		for (int i = 0; i < st.length; i++) {
			String s = st[i];

			for (int j = s.length() - 1; j >= 0; j--) {
				ss = ss + s.charAt(j);
			}
			ss = ss + " ";
		}
		return ss;
	}

	public static void main(String[] args) {
		String str = "Deepak Kumar Mishra";
		System.out.println(reverse(str));
	}
}
