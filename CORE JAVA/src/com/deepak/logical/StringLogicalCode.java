package com.deepak.logical;

public class StringLogicalCode {
	public static String reverseString(String str) {
		char[] chr = str.toCharArray();
		char[] tempChr = new char[str.length()];
		int i = 0;
		int j = 0;
		for (char c : chr) {
			if (Character.isAlphabetic(c)) {
				tempChr[i] = c;
				++i;
			}
		}
		--i;
		while (j < i) {
			char temp = tempChr[j];
			tempChr[j] = tempChr[i];
			tempChr[i] = temp;
			++j;
			--i;
		}
		j = 0;
		for (i = 0; i < str.length(); i++) {
			if (Character.isAlphabetic(chr[i])) {
				chr[i] = tempChr[j];
				++j;
			}
		}
		return String.valueOf(chr);
	}

	public static void main(String[] args) {
		String str = "cda!@#az%i$q^^&90(cd)";
		System.out.println(reverseString(str));
	}
}
