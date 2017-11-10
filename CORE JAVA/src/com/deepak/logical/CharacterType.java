package com.deepak.logical;

public class CharacterType {

	public static String characterType(char c) {
		if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
			return c + " : is alphabet";
		} else if (c >= '0' && c <= '9') {
			return c + " : is digites ";
		} else
			return c + " : is special character";
	}

	public static void main(String[] args) {
		char ch = '%';
		System.out.println(characterType(ch));

	}
}
