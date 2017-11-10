package com.deepak.logical;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatedCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String...");
		String s = sc.next();
		char c[] = s.toCharArray();
		List<Character> al = new ArrayList();
		int count;
		for (int i = 0; i < c.length; i++) {
			count = 1;
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j]) {
					count++;
				}
			}
			if (count > 1 && !al.contains(c[i])) {
				System.out.println(c[i] + "==" + count);
				al.add(c[i]);
			}
			if (count == 1 && !al.contains(c[i]))

				System.out.println(c[i] + "==1");
		}
		sc.close();
	}
}